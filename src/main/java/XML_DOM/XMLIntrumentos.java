/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_DOM;
import Data.Data;
import Logic.Instrumento;
import Logic.TipoInstrumento;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.SAXException;
/**
 *
 * @author David
 */
public class XMLIntrumentos {
    private static String xmlFilePath = "";
    private Data datos;
    private TipoInstrumento inst;

    public XMLIntrumentos(String filepath){
        xmlFilePath = filepath;
        CreateFile();
        datos = new Data();
        inst = new TipoInstrumento();
    }
    private void CreateFile()
    {
        try {
        
            File xmlFile = new File(xmlFilePath);
        
            if(!xmlFile.exists())
            {
                DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
                Document document = documentBuilder.newDocument();
                
                Element instrumentos = document.createElement("Instrumentos");
                document.appendChild(instrumentos);
                
                Element inst1 = document.createElement("Instrumento1");
                instrumentos.appendChild(inst1);
                
                Element cod1 = document.createElement("Codigo");
                cod1.appendChild(document.createTextNode("TER"));
                inst1.appendChild(cod1);
                 
                Element nom1 = document.createElement("Nombre");
                nom1.appendChild(document.createTextNode("Termómetro"));
                inst1.appendChild(nom1);
                
                Element uni1 = document.createElement("Unidad");
                uni1.appendChild(document.createTextNode("Grados Celsius"));
                inst1.appendChild(uni1);

                Element inst2 = document.createElement("Instrumento2");
                instrumentos.appendChild(inst2);
                
                Element cod2 = document.createElement("Codigo");
                cod2.appendChild(document.createTextNode("BAR"));
                inst2.appendChild(cod2);
                 
                Element nom2 = document.createElement("Nombre");
                nom2.appendChild(document.createTextNode("Barómetro"));
                inst2.appendChild(nom2);
                
                   
                Element uni2 = document.createElement("Unidad");
                uni2.appendChild(document.createTextNode("PSI"));
                inst2.appendChild(uni2);

                // create the xml file
                //transform the DOM Object to an XML File
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(xmlFilePath));

                // If you use
                // StreamResult result = new StreamResult(System.out);
                // the output will be pushed to the standard output ...
                // You can use that for debugging

                transformer.transform(domSource, streamResult);

                System.out.println("TIPOS DE INSTRUMENTO");
            }
        } catch (ParserConfigurationException | TransformerException pce) {
            System.out.println(pce.getMessage());
            
        }
    }
    
     public boolean AddInstrumento(TipoInstrumento ints) throws TransformerConfigurationException, TransformerException
    {
        boolean result = false;
       
        try {
            File xmlFile = new File(xmlFilePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            if(!xmlFile.exists())
                return result;
            Document document = builder.parse(xmlFile);
     
            Node root = document.getElementsByTagName("Instrumentos").item(0);

            Element newInst = document.createElement("Intrumento"+datos.getInstrumentos().size());
    
            root.appendChild(newInst);
                
            inst = datos.getInstrumentos().get(datos.getInstrumentos().size()-1);
                   
            Element cod = document.createElement("Codigo");
            cod.appendChild(document.createTextNode(inst.getCodigo()));
            newInst.appendChild(cod);
                 
            Element nom = document.createElement("Nombre");
            nom.appendChild(document.createTextNode(inst.getNombre()));
            newInst.appendChild(nom);
                     
            Element uni = document.createElement("Unidad");
            uni.appendChild(document.createTextNode(inst.getUnidad()));
            newInst.appendChild(uni);
    
                 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            transformer.transform(domSource, streamResult);
            
        } catch (ParserConfigurationException | IOException | SAXException pce) {
        }    
         return result; 
    } 
    
    public boolean UpdateInstrumento(Instrumento instrumento) throws TransformerConfigurationException, TransformerException
    {
        boolean result = false;
        
        try {
            File xmlFile = new File(xmlFilePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            if(!xmlFile.exists())
                return result;
            Document doc = builder.parse(xmlFile);
            NodeList instNodes = doc.getElementsByTagName("Instrumento1");
            for(int i = 0; i < instNodes.getLength(); i++) {            
                Node instNode = instNodes.item(i);
                if(instNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element instElement = (Element) instNode;
                    //int id = Integer.parseInt(userElement.getAttribute("id"));
                     
                    if(instrumento.getCodigo().equals(instElement.getAttribute("Codigo")))
                    {
                        instElement.getElementsByTagName("Nombre").item(0).setTextContent(instrumento.getNombre());
                        instElement.getElementsByTagName("Unidad").item(0).setTextContent(instrumento.getUnidad()); 
                     
                        
                        // write the DOM object to the file
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();

                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource domSource = new DOMSource(doc);

                        StreamResult streamResult = new StreamResult(new File(xmlFilePath));
                        transformer.transform(domSource, streamResult);
                        
                        System.out.println("Done updating the user to XML File");
                        
                        break;
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException pce) {
        }
        
        return result;
    }
}

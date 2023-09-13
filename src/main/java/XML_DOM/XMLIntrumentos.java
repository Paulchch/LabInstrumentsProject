/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_DOM;
import Data.Data;
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
                 
                 
//                
//                for(int i = 1; i <= datos.getInstrumentos().size();i++){
//                Element instrumento = document.createElement("Instrumento"+i);
//                instrumentos.appendChild(instrumento);
//               
//                inst = datos.getInstrumentos().get(i);
//                
//                 Element codigo = document.createElement("Codigo");
//                codigo.appendChild(document.createTextNode(inst.getCodigo()));
//                 instrumento.appendChild(codigo);
//                 
//                 Element nombre = document.createElement("Nombre");
//                nombre.appendChild(document.createTextNode(inst.getNombre()));
//                instrumento.appendChild(nombre);
//                
//                   
//                Element unidad = document.createElement("Unidad");
//                unidad.appendChild(document.createTextNode(inst.getUnidad()));
//                 instrumento.appendChild(unidad);
//                }

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
}

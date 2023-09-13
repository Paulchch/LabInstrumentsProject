/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_DOM;
import Data.Data;
import Logic.Instrumento;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
/**
 *
 * @author David
 */
public class XMLIntrumentos {
    private static String xmlFilePath = "";
    private Data datos;
    private Instrumento inst;

    public XMLIntrumentos(String filepath){
        xmlFilePath = filepath;
        CreateFile();
        datos = new Data();
        inst = new Instrumento();
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
                
                for(int i = 1; i <= datos.getInstrumentos().size();i++){
                Element instrumento = document.createElement("Instrumento"+i);
                instrumentos.appendChild(instrumento);
               
                inst = datos.getInstrumentos().get(i);
                
                 Element codigo = document.createElement("Codigo");
                codigo.appendChild(document.createTextNode(inst.getCodigo()));
                 instrumento.appendChild(codigo);
                 
                 Element nombre = document.createElement("Nombre");
                nombre.appendChild(document.createTextNode(inst.getNombre()));
                instrumento.appendChild(nombre);
                
                   
                Element unidad = document.createElement("Unidad");
                unidad.appendChild(document.createTextNode(inst.getUnidad()));
                 instrumento.appendChild(unidad);
                }

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
    
    
    
    
}

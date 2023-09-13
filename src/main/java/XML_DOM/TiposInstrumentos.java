/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_DOM;
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
public class TiposInstrumentos {
    private static String xmlFilePath = "";

    public TiposInstrumentos(String filepath){
        xmlFilePath = filepath;
        CreateFile();
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
                
                Element instrumento = document.createElement("Instrumento");
                instrumentos.appendChild(instrumento);
                
                Element codigo = document.createElement("Codigo");
                 codigo.appendChild(document.createTextNode("TER"));
                  instrumento.appendChild(codigo);
                 
                Element nombre = document.createElement("Nombre");
                nombre.appendChild(document.createTextNode("Termometro"));
                instrumento.appendChild(nombre);
                
                Element unidad = document.createElement("Unidad");
                unidad.appendChild(document.createTextNode("Grados Celcius"));
                 instrumento.appendChild(unidad);

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

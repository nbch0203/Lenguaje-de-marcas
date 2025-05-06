package notas_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class Notas_xml {
 
    public static void main(String[] args) {
    	
    	
    	
        File file = new File("C:\\Users\\ANTONIO\\Desktop\\FP DAM\\Temporal Lenguaje de marcas\\LeerXML\\notas.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("alumno");
            System.out.println("Número de alumnos: " + nList.getLength());
            
            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
 
                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
 
                    System.out.println("\nNIF Alumno: " + eElement.getAttribute("NIF"));
                    System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Asignatura: " + eElement.getElementsByTagName("asignatura").item(0).getTextContent());
                    
                    // Mostrar todas las notas
                    NodeList notas = eElement.getElementsByTagName("nota");
                    System.out.print("Notas: ");
                    for (int tempnota = 0; tempnota < eElement.getElementsByTagName("nota").getLength(); tempnota++) {
                    System.out.println(eElement.getElementsByTagName("nota").item(tempnota).getTextContent());
                    }
                    }
                    System.out.println();
                }
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
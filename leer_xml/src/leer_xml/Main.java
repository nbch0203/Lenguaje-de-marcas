package leer_xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Main {

	public static void main(String[] args) { // Contenido obtenido de http://jmoral.es/blog/xml-dom
		/*
		 * Tratamiento de concesionario.xml File file = new File("concesionario.xml");
		 * 
		 * if (!file.exists()) {
		 * System.out.println("El xml no existe o no se encuentra"); }
		 * 
		 * try { DocumentBuilderFactory dbFactory =
		 * DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder =
		 * dbFactory.newDocumentBuilder(); Document doc = dBuilder.parse(file);
		 * 
		 * // estos métodos podemos usarlos combinados para normalizar el archivo XML
		 * doc.getDocumentElement().normalize();
		 * 
		 * 
		 * // almacenamos los nodos para luego mostrar la // cantidad de ellos con el
		 * método getLength() NodeList nList = doc.getElementsByTagName("coche");
		 * System.out.println("Número de coches: " + nList.getLength());
		 * 
		 * for(int temp = 0; temp < nList.getLength(); temp++) { Node nNode =
		 * nList.item(temp);
		 * 
		 * if(nNode.getNodeType() == Node.ELEMENT_NODE) { Element eElement = (Element)
		 * nNode;
		 * 
		 * System.out.println("\nCoche id: " + eElement.getAttribute("id"));
		 * System.out.println("Marca: " +
		 * eElement.getElementsByTagName("marca").item(0).getTextContent());
		 * System.out.println("Modelo: " +
		 * eElement.getElementsByTagName("modelo").item(0).getTextContent());
		 * System.out.println("Cilindrada: " +
		 * eElement.getElementsByTagName("cilindrada").item(0).getTextContent()); } }
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */

		/*
		 * Tratamiento del archivo concesionario_modificado.xml
		 * 
		 * File file = new File("concesionario_modificado.xml");
		 * 
		 * if (!file.exists()) {
		 * System.out.println("El xml no existe o no se encuentra"); }
		 * 
		 * try { DocumentBuilderFactory dbFactory =
		 * DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder =
		 * dbFactory.newDocumentBuilder(); Document doc = dBuilder.parse(file);
		 * 
		 * // estos métodos podemos usarlos combinados para normalizar el archivo XML
		 * doc.getDocumentElement().normalize();
		 * 
		 * 
		 * // almacenamos los nodos para luego mostrar la // cantidad de ellos con el
		 * método getLength() NodeList nList = doc.getElementsByTagName("coche");
		 * System.out.println("Número de coches: " + nList.getLength());
		 * 
		 * for(int temp = 0; temp < nList.getLength(); temp++) { Node nNode =
		 * nList.item(temp);
		 * 
		 * if(nNode.getNodeType() == Node.ELEMENT_NODE) { Element eElement = (Element)
		 * nNode;
		 * 
		 * System.out.println("\nCoche id: " + eElement.getAttribute("matricula"));
		 * System.out.println("Marca: " +
		 * eElement.getElementsByTagName("marca").item(0).getTextContent());
		 * System.out.println("Modelo: " +
		 * eElement.getElementsByTagName("modelo").item(0).getTextContent());
		 * System.out.println("Color: " +
		 * eElement.getElementsByTagName("color").item(0).getTextContent());
		 * System.out.println("Cilindrada: " +
		 * eElement.getElementsByTagName("cilindrada").item(0).getTextContent()); } }
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		try {
			Scanner sc = new Scanner(System.in);
			String fichero = sc.next();

			File file = new File(fichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			// estos métodos podemos usarlos combinados para normalizar el archivo XML
			doc.getDocumentElement().normalize();

			// almacenamos los nodos para luego mostrar la
			// cantidad de ellos con el método getLength()
			NodeList nList = doc.getElementsByTagName("alumno");
			System.out.println("Número de alumnos: " + nList.getLength());

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					System.out.println("\nAlumno nif: " + eElement.getAttribute("nif"));
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println(
							"Asignatura: " + eElement.getElementsByTagName("asignatura").item(0).getTextContent());

					NodeList nListNotas = doc.getElementsByTagName("nota");
					System.out.println("Número de notas: " + nListNotas.getLength());

					for (int i = 0; i < nListNotas.getLength(); i++) {
						Node nNodeNota = nListNotas.item(i);

						if (nNodeNota.getNodeType() == Node.ELEMENT_NODE) {
							Element eElementNota = (Element) nNodeNota;

							System.out.println("Nota " + i + ": " + eElementNota.getNodeValue());
						}
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("El xml no existe o no se encuentra");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

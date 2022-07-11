package Filehndlr;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class createxml {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.newDocument();

		// createElement
		Element rootElement = doc.createElement("cars");
		doc.appendChild(rootElement);

		Element supercar = doc.createElement("supercars");
		rootElement.appendChild(supercar);

		Attr attr = doc.createAttribute("company");
		attr.setValue("Ferrai");
		supercar.setAttributeNode(attr);

		Element carname = doc.createElement("carname");
		Attr attrtype = doc.createAttribute("type");
		attrtype.setValue("formula car one");
		carname.setAttributeNode(attrtype);
		carname.appendChild(doc.createTextNode("Ferrai 101"));
		supercar.appendChild(carname);

		String path = "..//second//Resource//Testing//First//";
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		
		t.setOutputProperty(OutputKeys.INDENT, "yes");
		// t.setOutputProperty(OutputKeys.INDENT, "yes");

		DOMSource src = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(path + "one.xml"));
		t.transform(src, result);

		StreamResult consoleResult = new StreamResult(System.out);
		t.transform(src, consoleResult);
	}

}

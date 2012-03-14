package kybele.metagem.ui.api;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.eclipse.core.runtime.IPath;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ChangeValues {
	
	static private ChangeValues changeValues = null;
	
	public int changeAttValue(IPath filePath,String elementName,String attName,String oldAttValue,String attValue)
	{
		 String xmlFilePath =  filePath.toOSString();
		 try {
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	        Document doc;
			
				doc = docBuilder.parse(xmlFilePath.replace(" ", "%20"));
			

	        int totalReplaced = replaceValue(doc, elementName,attName,oldAttValue,attValue);

	        Transformer t = TransformerFactory.newInstance().newTransformer();
	        Result result = new StreamResult(new File(xmlFilePath.toString()));
	        Source source = new DOMSource(doc);
	        t.transform(source, result);
	        return totalReplaced;
		 } catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerFactoryConfigurationError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		
		
	}
	
	private int replaceValue(Document doc, String tagName,String attName, String oldValue, String replaceValue) {
		int totalReplaced=0;
	    NodeList nodeList = doc.getElementsByTagName(tagName);
	    NamedNodeMap nnp = null;
	    int nodeCount = nodeList.getLength();
	    for(int i =0;i< nodeCount;i++)
	    {	nnp = nodeList.item(i).getAttributes();
	    	
	    	if(nnp.getNamedItem(attName).getNodeValue().equalsIgnoreCase(oldValue))
	    	{
	    		nnp.getNamedItem(attName).setNodeValue(replaceValue);
	    		totalReplaced++;
	    	}
	    }
	    return totalReplaced;
	}
	
	static synchronized public ChangeValues getInstance() {

		if (changeValues == null) {

			changeValues = new ChangeValues();

		}

		return changeValues;
	}

}

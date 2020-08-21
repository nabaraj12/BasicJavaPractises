/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlOperations;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

/**
 *
 * @author lll
 */
public class ParseXmlToJava {
    
    public static void main(String args[]) throws ParserConfigurationException
    {
        DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        try {
            
            File XmlFile=new File("C:/Users/lll/Documents/NetBeansProjects/InitialPractise/src/XmlOperations/Catalog.xml");
            Document doc=db.parse(XmlFile);
            System.out.println(doc.getDocumentElement().getNodeName());
            
            NodeList NList=doc.getElementsByTagName("book");
            System.out.println("<----------Length of List--->:"+NList.getLength());
            for(int i=0;i<NList.getLength();i++)
            {
                Node Lnode=NList.item(i);
                System.out.println("\nCurrent Element:"+Lnode.getNodeName());
                if(Lnode.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element elem=(Element)Lnode;
                    
                    System.out.println("Book id:"+elem.getAttribute("id"));
                    System.out.println("Author:"+elem.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Publish Date:"+elem.getElementsByTagName("publish_date").item(0).getTextContent());
//                    System.out.println("Book id:"+elem.getElementsByTagName("id"));
//                    System.out.println("Book id:"+elem.getElementsByTagName("id"));
                }
            }
//            System.out.println(NList.item(4));
        } catch (SAXException ex) {
            Logger.getLogger(ParseXmlToJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseXmlToJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

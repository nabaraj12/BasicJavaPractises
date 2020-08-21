/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlOperations;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author lll
 */
public class SerializetoXml {
    
    public static void main(String[] args) throws IOException
    {
        UserSettings settings = new UserSettings();
        settings.setFieldOne(10000);
        settings.setFieldTwo("HowToDoInJava.com");
        settings.setFieldThree(false);
         
        //Before
        System.out.println(settings);
        serializeToXML ( settings );
        UserSettings loadedSettings = deserializeFromXML();
        //After
        System.out.println(loadedSettings);
    }
    private static void serializeToXML (UserSettings settings) throws IOException
{
    FileOutputStream fos = new FileOutputStream("settings.xml");
    XMLEncoder encoder = new XMLEncoder(fos);
//    encoder.setExceptionListener(new ExceptionListener() {
//            public void exceptionThrown(Exception e) {
//                System.out.println("Exception! :"+e.toString());
//            }
//    });
    encoder.writeObject(settings);
    encoder.close();
    fos.close();
}
    private static UserSettings deserializeFromXML() throws IOException {
    FileInputStream fis = new FileInputStream("settings.xml");
    XMLDecoder decoder = new XMLDecoder(fis);
    UserSettings decodedSettings = (UserSettings) decoder.readObject();
    decoder.close();
    fis.close();
    return decodedSettings;
}
    
}

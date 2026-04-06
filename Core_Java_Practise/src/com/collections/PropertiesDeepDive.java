package com.collections;
import java.io.*;
import java.util.*;

public class PropertiesDeepDive {

    public static void main(String[] args) throws Exception {

        // ===============================
        // 1. Create Properties Object
        // ===============================
        Properties props = new Properties();

        // ===============================
        // 2. Add Properties
        // ===============================
        props.setProperty("id", "101");
        props.setProperty("name", "Maruthi");
        props.setProperty("city", "Hyderabad");

        System.out.println("Properties: " + props);

        // ===============================
        // 3. Save to File
        // ===============================
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos, "My Config File");
        fos.close();

        // ===============================
        // 4. Load from File
        // ===============================
        Properties loaded = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loaded.load(fis);
        fis.close();

        System.out.println("Loaded: " + loaded);

        // ===============================
        // 5. Get Property
        // ===============================
        System.out.println("Name: " + loaded.getProperty("name"));

        // default value
        System.out.println("Age: " + loaded.getProperty("age", "Not Found"));

        // ===============================
        // 6. Iterate Properties
        // ===============================
        for (String key : loaded.stringPropertyNames()) {
            System.out.println(key + " = " + loaded.getProperty(key));
        }

        // ===============================
        // 7. Remove Property
        // ===============================
        loaded.remove("city");

        // ===============================
        // 8. Contains
        // ===============================
        System.out.println("Contains key 'id'? " + loaded.containsKey("id"));

        // ===============================
        // 9. List (Print nicely)
        // ===============================
        loaded.list(System.out);

        // ===============================
        // 10. XML Support
        // ===============================
        FileOutputStream xmlOut = new FileOutputStream("config.xml");
        loaded.storeToXML(xmlOut, "XML Config");
        xmlOut.close();

        // Load XML
        Properties xmlProps = new Properties();
        FileInputStream xmlIn = new FileInputStream("config.xml");
        xmlProps.loadFromXML(xmlIn);
        xmlIn.close();

        System.out.println("XML Loaded: " + xmlProps);

        System.out.println("Done");
    }
}
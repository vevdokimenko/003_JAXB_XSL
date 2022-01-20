package practice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/catalog.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Catalog catalog = (Catalog) unmarshaller.unmarshal(file);

            System.out.println(catalog);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

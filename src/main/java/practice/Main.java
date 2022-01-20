package practice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/catalog.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Catalog catalog = (Catalog) unmarshaller.unmarshal(file);

            System.out.println(catalog);

//            =======
            List<Cd> cdList = new ArrayList<>();
            cdList.add(new Cd(
                    "Title",
                    "Artist",
                    "Country",
                    "Company",
                    0.00,
                    2022
            ));
            Catalog catalog1 = new Catalog(cdList);
            File out = new File("src/main/resources/catalog_out.xml");

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(catalog1, System.out);
            marshaller.marshal(catalog1, out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

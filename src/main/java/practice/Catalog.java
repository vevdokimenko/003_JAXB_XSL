package practice;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "CATALOG")
public class Catalog {
    @XmlElement(name = "CD")
    private List<Cd> cdList = new ArrayList<>();

    public Catalog() {
    }

    public Catalog(List<Cd> cdList) {
        this.cdList = cdList;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "cdList=" + cdList +
                '}';
    }
}

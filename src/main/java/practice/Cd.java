package practice;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CD")
public class Cd {
    @XmlElement(name = "TITLE")
    private String title;

    @XmlElement(name = "ARTIST")
    private String artist;

    @XmlElement(name = "COUNTRY")
    private String country;

    @XmlElement(name = "COMPANY")
    private String company;

    @XmlElement(name = "PRICE")
    private double price;

    @XmlElement(name = "YEAR")
    private int year;

    public Cd() {
    }

    public Cd(String title, String artist, String country, String company, double price, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.company = company;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

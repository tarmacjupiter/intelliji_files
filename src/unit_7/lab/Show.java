package unit_7.lab;

import java.util.ArrayList;

public class Show {
    private String date;
    private int price;
    private int quant;
    private String performer;
    private String city;

    public Show(String date, int price, int quant, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quant = quant;
        this.performer = performer;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Show{" +
                "date='" + date + '\'' +
                ", price=" + price +
                ", quantity=" + quant +
                ", performer='" + performer + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

package unit_7.lab;

public class Show {
    private String date;
    private double price;
    private int quant;
    private String performer;
    private String city;

    public Show(String date, double price, int quant, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quant = quant;
        this.performer = performer;
        this.city = city;

    }

    public String toString(){
        String output = "";
//        output += "Date\t\tPrice\tQuantity\tPerformer\tCity\n";
        output += date + "\t" + "$" + price + "\t\t" + quant + "\t\t\t" + performer + "\t" + city;
        return output;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
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

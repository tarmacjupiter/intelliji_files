package unit_7.lab;

public class Show {
    //Instance variables
    private String date;
    private double price;
    private int quant;
    private String performer;
    private String city;

    // Full Constructor
    public Show(String date, double price, int quant, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quant = quant;
        this.performer = performer;
        this.city = city;

    }

    /**
     * The "toString" function takes in and formats all the instances
     * variables in a similar CSV or Excel format
     * @return a String of all the formatted data
     */
    public String toString(){
        String output = "";
        output += date + "\t";
        output += "$" + price + "\t\t";
        output += quant + "\t\t\t";
        output += performer;
        while(output.length() < 52){
            output += " ";
        }
        output += "\t" + city;
        return output;
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return city.toLowerCase();
    }

    public void setCity(String city) {
        this.city = city;
    }
}

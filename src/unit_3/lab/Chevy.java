package unit_3.lab;

import java.text.DecimalFormat;

public class Chevy {
    private int year;
    private int mileage;
    private double fuel_efficiency;
    private int price;
    private String model;
    private String color;
    private boolean luxury_status;
    private boolean wd_status;
    private boolean sports_status;

    //DEFAULT CONSTRUCTOR
    public Chevy(){
        color = "White";
        model = "Trax";
        year = 2021;
        mileage = 0;
        price = (16000 + 500) / 1000 * 1000;
        fuel_efficiency = 35;
        luxury_status = false;
        wd_status = false;
        sports_status = false;
    }

    //FULL CONSTRUCTOR
    public Chevy(int aYear, int aMileage, double aFuel, int aPrice, String aModel, String aColor, boolean aLuxury, boolean a4WD, boolean aSports){
        year = aYear;
        mileage = aMileage;
        fuel_efficiency = aFuel;
//        price = (aPrice + 500) / 1000 * 1000; (round the thousand place)
        price = Math.round(aPrice);
//        price = aPrice;
        model = aModel;
        color = aColor;
        luxury_status = aLuxury;
        wd_status = a4WD;
        sports_status = aSports;
    }

    //GETTERS AND SETTERS


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuel_efficiency() {
        return fuel_efficiency;
    }

    public void setFuel_efficiency(double fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSports_status() {
        return sports_status;
    }

    public void setSports_status(boolean sports_status) {
        this.sports_status = sports_status;
    }

    public boolean isWd_status() {
        return wd_status;
    }

    public void setWd_status(boolean wd_status) {
        this.wd_status = wd_status;
    }

    public boolean isLuxury_status() {
        return luxury_status;
    }

    public void setLuxury_status(boolean luxury_status) {
        this.luxury_status = luxury_status;
    }

    //comparesTo() method

    public int comparesTo(Chevy otherPizza){
        if(this.getPrice() < otherPizza.getPrice()){ //this.getPrice is less than otherPizza.getPrice()
            return -1;
        }else if(this.getPrice() > otherPizza.getPrice()){ //this.getPrice is greater than otherPizza.getPrice()
            return 1;
        }else{ // Both Chevy prices are the same
            return 0;
        }
    }

    //equals method

    public boolean equals(Chevy otherChevy){
        if((this.getModel() == otherChevy.getModel()) && (this.getColor() == otherChevy.getColor()) && (this.getMileage() <= 200 || this.getMileage() >= 200) && (otherChevy.getMileage() <= 200 || otherChevy.getMileage() >= 200)){
            return true;
        }else{
            return false;
        }
    }

    //toString method

    public String toString() {
        String output = "";

        output += year + " Chevrolet " + model + " (" + color + ")\n";

        output += "\tPRICE:\t\t\t\t" + "$" + price + "\n";

        output += "\tMILEAGE:\t\t\t" + mileage + "\n";

        output += "\tFUEL EFFICIENCY:\t" + fuel_efficiency + "\n";

        output += "\tPACKAGES: \n";

        if (luxury_status == true) {
            output += "\t\t-Luxury Package\n";
        }
        if(wd_status == true) {
            output += "\t\t-4WD Package\n";
        }
        if(sports_status == true) {
            output += "\t\t-Sports Package\n";
        }

        if(luxury_status == false && wd_status == false && sports_status == false){
            output += "\t\t-None";
        }

        return output;
    }


    //calcPrice method

    public double calcPrice(){
        price = price;
        double priceDouble = price;

        fuel_efficiency = fuel_efficiency;

        if(luxury_status == true){
            double luxury_percent = price * .322;
            priceDouble = priceDouble + luxury_percent;
        }else if(wd_status == true){
            priceDouble = priceDouble + 3500;
        }else if(sports_status == true){
            double sports_percent = price * .272;
            priceDouble = priceDouble + sports_percent;

            double fuel_percent = fuel_efficiency * .20;
            fuel_efficiency = fuel_percent - fuel_percent;
        }
        return priceDouble;
    }

}

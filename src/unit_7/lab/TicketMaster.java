package unit_7.lab;

/*
Method to read in data can be in this file,
no need to have an ArrayList as a parameter
in your constructor then. Just have a function
(possibly even in your constructor that reads
in the data and sets the data of those "Show"
objects in the already provided ArrayList called
"shows"

All other methods you will have in this class


 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;
    File ticketData = new File("ticket_files/showData.txt");
    Scanner inF = new Scanner(ticketData);

    public TicketMaster() throws FileNotFoundException {
        this.shows = new ArrayList<>();
    }

    public void readData() throws FileNotFoundException {
        while(inF.hasNextLine()){
            inF.useDelimiter("\\s");
            String date = inF.next();
            double price = inF.nextDouble();
            int quantity = inF.nextInt();
            inF.useDelimiter(",");
            String performer = inF.next();
            inF.useDelimiter("\\s");
            inF.next();
            String tempCity = inF.nextLine();
            String city = tempCity.substring(1);
            Show temp = new Show(date, price, quantity, performer, city);
            shows.add(temp);
        }

        inF.close();
    }

    public ArrayList<Show> filterCity(ArrayList<Show> shows, String cityName){
        ArrayList<Show> temp = new ArrayList<>();
        for(int i = 0; i < shows.size(); i++){
            if(shows.get(i).getCity().equals(cityName)){
                temp.add(shows.get(i));
            }
        }
        return temp;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public String toString(){
        String output = "";
        output += "Date\t\tPrice\t\tQuantity\tPerformer\t\tCity\n";
        output += "____________________________________________________________________\n";
        for (Show show : shows) {
            output += show.getDate() + "\t$";
            output += show.getPrice() + "\t\t";
            output += show.getQuant() + "\t\t\t";
            output += show.getPerformer() + "\t\t";
//            while(output.length() < 50){
//                output += "\t";
//            }
            output += show.getCity() + "\t\n";
        }
        return output;
    }

    public String organizeFiltered(ArrayList<Show> shows){
        String output = "";
        output += "Date\t\tPrice\t\tQuantity\tPerformer\t\t\tCity\n";
        output += "____________________________________________________________________\n";
        for(Show temp : shows){
            output += temp.getDate() + "\t$";
            output += temp.getPrice() + "\t\t";
            output += temp.getQuant() + "\t\t\t";
            output += temp.getPerformer() + "\t\t";
            output += temp.getCity() + "\t\n";
        }
        return output;
    }

    public ArrayList<Show> filterPerformerTop(){
        ArrayList<Show> temp = shows;
        temp.sort(Comparator.comparing(Show::getPerformer));
        return temp;
    }

    public ArrayList<Show> filterPerformerDown(){
        ArrayList<Show> temp = shows;
        temp.sort((o1, o2) -> o2.getPerformer().compareTo(o1.getPerformer()));
        return temp;
    }

    public ArrayList<Show> sortByPriceTop(){
        ArrayList<Show> temp = shows;
        temp.sort(Comparator.comparingDouble(Show::getPrice));
        return temp;
    }

    public ArrayList<Show> sortByPriceBot(){
        ArrayList<Show> temp = shows;
        temp.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        return temp;
    }
}

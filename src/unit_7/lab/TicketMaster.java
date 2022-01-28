package unit_7.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class TicketMaster {
    //Instance variables
    private ArrayList<Show> shows;

    //Global File and Scanner objects
    File ticketData = new File("ticket_files/showData.txt");
    Scanner inF = new Scanner(ticketData);

    // Full Constructor
    public TicketMaster() throws FileNotFoundException {
        this.shows = new ArrayList<>();
    }

    /**
     * The "readData" function takes in the "showData.txt" text file and
     * reads and assigns data values to appropriate variables, then assigns
     * those variables to a new Show object, which then pushes those Show instances
     * to the "shows" ArrayList
     * @throws FileNotFoundException
     */
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

    /**
     * The "filterCity" function shows Ticket data by whichever City the user specifies
     * @param shows An ArrayList containing Show objects
     * @param cityName a String which is the means of filtering
     * @return returning a new filtered ArrayList<Show>
     */
    public ArrayList<Show> filterCity(ArrayList<Show> shows, String cityName){
        cityName = cityName.toLowerCase();
        ArrayList<Show> temp = new ArrayList<>();
        for(int i = 0; i < shows.size(); i++){
            if(shows.get(i).getCity().equals(cityName.toLowerCase())){
                temp.add(shows.get(i));
            }
        }
        if(temp.isEmpty()){
            System.out.println();
            System.out.println("No Ticket Data for that City!");
            System.out.println();
        }
        return temp;
    }

    /**
     * The "toString" function formats the data of ALL the tickets
     * @return a String of all the Show(s) data
     */
    public String toString(){
        String output = "";
        output += "Date\t\tPrice\t\tQuantity\t Performer\t\t\t\t\t\tCity\n";
        output += "______________________________________________________________________________\n";
        for(Show tempShow : shows){
            output += tempShow + "\n";
        }
        return output;
    }

    /**
     * The "organizeFiltered" method is similar to the "toString" methods, but takes
     * an ArrayList of Shows as a parameter
     * @param shows an ArrayList of Shows
     * @return a String from the ArrayList
     */
    public String organizeFiltered(ArrayList<Show> shows){
        String output = "";
        output += "Date\t\tPrice\t\tQuantity\t Performer\t\t\t\t\t\tCity\n";
        output += "______________________________________________________________________________\n";
        for(Show tempShow : shows){
            output += tempShow + "\n";
        }
        return output;
    }

    /**
     * The "filterPerformerTop" method returns an ArrayList of Shows by performer A-Z
     * This function uses the sort method and a Comparator which can compare and
     * organize values
     * @return an ArrayList of Shows
     */
    public ArrayList<Show> filterPerformerTop(){
        ArrayList<Show> temp = shows;
        temp.sort(Comparator.comparing(Show::getPerformer));
        return temp;
    }

// ___________________________________________________________________________________________
    // Selection Sorting methods!
    /**
     * A sorting method to organize Shows by performer, from A-Z
     * Using the selection sort method
     * @return the sorted Array of organized Shows
     */
    public ArrayList<Show> selectionFilterPerformerAZ(){
        ArrayList<Show> temp = shows;

        for(int i = 0; i < temp.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < temp.size(); j++){
                if(temp.get(j).getPerformer().compareTo(temp.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }
            String tempP = temp.get(i).getPerformer();
            temp.get(i).setPerformer(temp.get(minIndex).getPerformer());
            temp.get(minIndex).setPerformer(tempP);
        }
        return temp;
    }

    /**
     * A sorting method to organize Shows by performer, from Z-A
     * Using the selection sort method
     * @return the sorted Array of organized Shows
     */
    public ArrayList<Show> selectionFilterPerformerZA(){
        ArrayList<Show> temp = shows;

        for(int i = 0; i < temp.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < temp.size(); j++){
                if(temp.get(j).getPerformer().compareTo(temp.get(minIndex).getPerformer()) > 0){
                    minIndex = j;
                }
            }
            String tempP = temp.get(i).getPerformer();
            temp.get(i).setPerformer(temp.get(minIndex).getPerformer());
            temp.get(minIndex).setPerformer(tempP);
        }
        return temp;
    }

    /**
     * A sorting method to organize Shows by price, Low to High
     * Using the selection sort method
     * @return the sorted Array of organized Shows
     */
    public ArrayList<Show> selectionFilterPriceLH(){
        ArrayList<Show> temp = shows;
        for(int i = 0; i < temp.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < temp.size(); j++){
                if(temp.get(j).getPrice() < temp.get(minIndex).getPrice()){
                    minIndex = j;
                }
            }
            double tempNum = temp.get(i).getPrice();
            temp.get(i).setPrice(temp.get(minIndex).getPrice());
            temp.get(minIndex).setPrice(tempNum);
        }
        return temp;
    }

    /**
     * A sorting method to organize Shows by price, High to Low
     * Using the selection sort method
     * @return the sorted Array of organized Shows
     */
    public ArrayList<Show> selectionFilterPriceHL(){
        ArrayList<Show> temp = shows;
        for(int i = 0; i < temp.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < temp.size(); j++){
                if(temp.get(j).getPrice() > temp.get(minIndex).getPrice()){
                    minIndex = j;
                }
            }
            double tempNum = temp.get(i).getPrice();
            temp.get(i).setPrice(temp.get(minIndex).getPrice());
            temp.get(minIndex).setPrice(tempNum);
        }
        return temp;
    }

    //_________________________________________________________________________________________________

    /**
     * The "filterPerformerDown" method returns an ArrayList of Shows by performer Z-A
     * This function uses the sort method and a Comparator which can compare and
     * organize values
     * @return an ArrayList of Shows
     */
    public ArrayList<Show> filterPerformerDown(){
        ArrayList<Show> temp = shows;
        temp.sort((o1, o2) -> o2.getPerformer().compareTo(o1.getPerformer()));
        return temp;
    }

    /**
     * The "sortByPriceTop" method returns an ArrayList of Shows by price Low-High
     * This function uses the sort method and a Comparator which can compare and
     * organize values
     * @return an ArrayList of Shows
     */
    public ArrayList<Show> sortByPriceTop(){
        ArrayList<Show> temp = shows;
        temp.sort(Comparator.comparingDouble(Show::getPrice));
        return temp;
    }

    /**
     * The "sortByPriceBot" method returns an ArrayList of Shows by price High-Low
     * This function uses the sort method and a Comparator which can compare and
     * organize values
     * @return an ArrayList of Shows
     */
    public ArrayList<Show> sortByPriceBot(){
        ArrayList<Show> temp = shows;
        temp.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        return temp;
    }


    // Getters and Setters
    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }
}

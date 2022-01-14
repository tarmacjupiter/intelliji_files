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
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;

    public TicketMaster() throws FileNotFoundException {
        File ticketData = new File("ticket_files/showData.txt");
        Scanner inF = new Scanner(ticketData);

        while(inF.hasNextLine()){
            String date = inF.next();
            System.out.println(date);
        }

    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public int countArray(int num){
        int count = 0;
        for(Show tempShow : shows){
            count++;
        }
        return count + num;
    }


    @Override
    public String toString() {
        return "TicketMaster{" +
                "shows=" + shows +
                '}';
    }
}

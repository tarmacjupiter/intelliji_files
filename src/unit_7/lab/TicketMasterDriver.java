package unit_7.lab;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inF = new Scanner(System.in);

        TicketMaster tickets = new TicketMaster();
        tickets.readData();
        System.out.println(tickets);

        ArrayList<Show> filtered = tickets.filterCity(tickets.getShows(), "Chicago");
        System.out.println(tickets.organizeFiltered(filtered));

        ArrayList<Show> perFilter = tickets.filterPerformerTop();
        System.out.println(tickets.organizeFiltered(perFilter));

        ArrayList<Show> perFilterDown = tickets.filterPerformerDown();
        System.out.println(tickets.organizeFiltered(perFilterDown));

        ArrayList<Show> filteredPrice = tickets.sortByPriceTop();
        System.out.println(tickets.organizeFiltered(filteredPrice));

        ArrayList<Show> filtBotPrice = tickets.sortByPriceBot();
        System.out.println(tickets.organizeFiltered(filtBotPrice));
    }
}

package unit_7.lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Show jb = new Show("02-08-2022", 150, 7, "JB", "LA");
        Show doja = new Show("02-08-2022", 43, 86, "Doja Cat", "Chicago");
        ArrayList<Show> allShows = new ArrayList<>();
        allShows.add(jb);
        allShows.add(doja);

        TicketMaster tickets = new TicketMaster();
//        System.out.println(tickets);
//        System.out.println(tickets.countArray(5));
    }
}

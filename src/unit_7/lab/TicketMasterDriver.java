package unit_7.lab;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        //Bool value to keep user in while loop
        boolean isValid = true;
        // TicketMaster object
        TicketMaster tickets = new TicketMaster();
        tickets.readData();

        // Saying hello to the user
        System.out.println("Check out the NEW and coming up concerts!");

        // Try-catch statement nested inside of a while loop, checking for primitive int data values
        // for user input
        while(isValid){
            try {
                System.out.println();
                System.out.println("Pick a number between 1-7");
                System.out.println("1. Show all Tickets");
                System.out.println("2. Show by Performer A-Z");
                System.out.println("3. Show by Performer Z-A");
                System.out.println("4. Show by Price Low-High");
                System.out.println("5. Show by Price High-Low");
                System.out.println("6. Show by City");
                System.out.println("7. Quit");
                System.out.println();
                Scanner sb = new Scanner(System.in);
                int num = sb.nextInt();

                // Switch case statement to check for num values
                switch (num) {
                    case 1 -> System.out.println(tickets);
                    case 2 -> System.out.println(tickets.organizeFiltered(tickets.filterPerformerTop()));
                    case 3 -> System.out.println(tickets.organizeFiltered(tickets.filterPerformerDown()));
                    case 4 -> System.out.println(tickets.organizeFiltered(tickets.sortByPriceTop()));
                    case 5 -> System.out.println(tickets.organizeFiltered(tickets.sortByPriceBot()));
                    case 6 -> returnCityList();
                    case 7 -> {
                        System.out.println("Goodbye!");
                        Thread.sleep(1000);
                        isValid = false;
                        sb.close();
                    }
                    default -> System.out.println("Do you not know how to count to 7?");
                }
            } catch (Exception e){ // If user does not know how to count to 7...
                System.out.println("Do you not know how to count to 7?");
            }
        }
    }

    /**
     * The "returnCityList" method keeps the user inside this function until "returnCityList" is done
     * running, this function asks the user for a City they would like to filter by then is ran inside the
     * Try-Catch statement
     * @throws FileNotFoundException just in case a file was not found, or I was dumb enough to move it somewhere
     */
    public static void returnCityList() throws FileNotFoundException {
        TicketMaster tickets = new TicketMaster();
        tickets.readData();
        System.out.println("What city would you like to search for?");
        Scanner sb = new Scanner(System.in);
        String cityName = sb.nextLine().toLowerCase();
        System.out.println(cityName);
        System.out.println(tickets.organizeFiltered(tickets.filterCity(tickets.getShows(), cityName)));
    }
}

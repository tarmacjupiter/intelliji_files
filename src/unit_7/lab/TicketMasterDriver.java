package unit_7.lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        boolean isValid = true;
        TicketMaster tickets = new TicketMaster();
        tickets.readData();
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

                if(num == 1){
                    System.out.println(tickets);
                } else if(num == 2){
                    System.out.println(tickets.organizeFiltered(tickets.filterPerformerTop()));
                } else if(num == 3){
                    System.out.println(tickets.organizeFiltered(tickets.filterPerformerDown()));
                } else if(num == 4){
                    System.out.println(tickets.organizeFiltered(tickets.sortByPriceTop()));
                } else if(num == 5){
                    System.out.println(tickets.organizeFiltered(tickets.sortByPriceBot()));
                }else if(num == 6){
                    returnCityList();
                } else if(num == 7){
                    System.out.println("Goodbye!");
                    Thread.sleep(1000);
                    isValid = false;
                } else {
                    System.out.println();
                    System.out.println("Do you not know how to count to 7?");
                    System.out.println();
                }
            } catch (Exception e){
                System.out.println("Do you not know how to count to 7?");
                System.out.println(e);
            }
        }
    }

    public static void returnCityList() throws FileNotFoundException {
        TicketMaster tickets = new TicketMaster();
        tickets.readData();
        System.out.println("What city would you like to search for?");
        Scanner sb = new Scanner(System.in);
        String cityName = sb.nextLine();
        System.out.println(tickets.organizeFiltered(tickets.filterCity(tickets.getShows(), cityName)));
    }
}

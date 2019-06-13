import java.util.*;

public class Main{
    private static Scanner s=new Scanner(System.in);
    public static void main(String[]args){
        /* 
        The app manages an airport. This has two types of flight: internal and external.
	Each flight has a ticket price, number of passengers, destination, if the flight is multi-stop or not and flight series. In case of external flights, the country of origin for the airline is indicated.
	The airport can have up to 30 registered flights (internal and external), otherwise an exception will be thrown.
	Using a method that receives a series flight as a parameter, we can determine whether it's an internal or external flight.
	You can give commands from the console (exit the app, add flights, show all flights, show information about a specific flight and whether is internal or external).
	We also have a thread that periodically counts the number of current flights in the airport.*/

        new FlightThread().start();
        printActions();
        
        while(true){
            System.out.println("\nEnter your choice: ");
            int line=s.nextInt();
            switch(line){
                case 0:
                    printActions();
                    break;
                case 1:
                    addInternalFlight();
                    break;
                case 2:
                    addExternalFlight();
                    break;
                case 3:
                    Airport.getInstance().showFlight();
                    break;
                case 4:
                    Airport.getInstance().showExternal();
                    break;
                case 5:
                    Airport.getInstance().showInternal();
                    break;
                case 6:
                    flightType();
                    break;
                case 7:
                    System.out.println("Bye, bye!");
                    return;
            }
        }
    }
    
    private static void printActions(){
        System.out.println("Options: "+
            "\n\t 0 - To print options."+
            "\n\t 1 - To add an internal flight."+
            "\n\t 2 - To add an external flight."+
            "\n\t 3 - To show all flights."+
            "\n\t 4 - To show external flights."+
            "\n\t 5 - To show internal flights."+
            "\n\t 6 - To show flight type(internal or external)."+
            "\n\t 0 - To quit the application.");
    }
    
    private static void addInternalFlight(){
        System.out.print("Enter ticket price: ");
        double ticketPrice=s.nextInt();
        System.out.print("Enter passengers number: ");
        int numberPassengers=s.nextInt();
        System.out.print("Enter destination: ");
        s.nextLine();
        String destination=s.nextLine();
        System.out.print("Is a multi-stop fligth?(yes/no): ");
        String multiStopFlight=s.nextLine();
        System.out.print("Enter barcode for fligth: ");
        String barCode=s.nextLine();
        InternalFlight ci=new InternalFlight(ticketPrice, numberPassengers, destination, multiStopFlight, barCode);
        Airport.getInstance().addFlight(ci);
        System.out.println("An internal flight was added.");
    }
    
    private static void addExternalFlight(){
        System.out.print("Enter ticket price: ");
        double ticketPrice=s.nextInt();
        System.out.print("Enter passengers number: ");
        int numberPassengers=s.nextInt();
        System.out.print("Enter destination: ");
        s.nextLine();
        String destination=s.nextLine();
        System.out.print("Is a multi-stop fligth?(yes/no): ");
        String multiStopFlight=s.nextLine();
        System.out.print("Enter country of origin for airline: ");
        String countryAirline=s.nextLine();
        System.out.print("Enter barcode for fligth: ");
        String barCode=s.nextLine();
        ExternalFlight ce=new ExternalFlight(ticketPrice, numberPassengers, destination, multiStopFlight, countryAirline, barCode);
        Airport.getInstance().addFlight(ce);
        System.out.println("An external flight was added.");
    }
    
    private static void flightType(){
        System.out.print("Enter barcode for fligth: ");
        s.nextLine();
        String barCode=s.nextLine();
        Airport.getInstance().flightType(barCode);
    }
}
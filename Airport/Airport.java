import java.util.*;

public class Airport{
    List<Flight> flights=new ArrayList<>();
    
    private Airport(){
    }
    
    private static final class SingletonHolder{
        private static final Airport airoport=new Airport();
    }
    
    public static Airport getInstance(){
        return SingletonHolder.airoport;
    }
    
    public void addFlight(Flight c){
        if(flights.size()<30){
            flights.add(c);
        }else{
            throw new TooManyFlightsException();
        }
    }
    
    public void flightType(String barCode){
        for(Flight c:flights){
            if(c.barCode.equals(barCode)){
                System.out.println(c);
            }
        }
    }
    
    public void showFlight(){
        if(flights.isEmpty()){
            System.out.println("There's no flight in the airport.");
        }else{
            for(int i=0; i<flights.size(); i++){
                System.out.println((i + 1) + ". " + flights.get(i));
            }
        }
        
    }
    
    public void showInternal(){
        for(Flight c:flights){
            if(c instanceof InternalFlight){
                System.out.println(c);
            }
        }
    }
    
    public void showExternal(){
        for(Flight c:flights){
            if(c instanceof ExternalFlight){
                System.out.println(c);
            }
        }
    }
    
    public int getNumberFlights(){
        return flights.size();
    }
}
public class TooManyFlightsException extends RuntimeException{
    public TooManyFlightsException(){
        super("Too many flights in the airport!");
    }
}
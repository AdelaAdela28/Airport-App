public class InternalFlight extends Flight{
        
    public InternalFlight(double ticketPrice, int numberPassengers, String destination, 
                          String multiStopFlight, String barCode){
        this.ticketPrice=ticketPrice;
        this.numberPassengers=numberPassengers;
        this.destination=destination;
        this.multiStopFlight=multiStopFlight;
        this.barCode=barCode;
    }
    
    public String toString(){
        return "Internal Flight: "+
        "\nticket price per person: "+ticketPrice+" euro"+
        ", \nnumber of passengers: "+numberPassengers+
        ", \ndestination: "+destination+
        ", \nmulti-stop flight: "+multiStopFlight+
        ", \nbarcode: "+barCode;
    }
}
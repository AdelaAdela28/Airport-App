public class ExternalFlight extends Flight{
    String countryAirline;
    
    public ExternalFlight(double ticketPrice, int numberPassengers, String destination, 
                          String multiStopFlight, String countryAirline, String barCode){
        this.ticketPrice=ticketPrice;
        this.numberPassengers=numberPassengers;
        this.destination=destination;
        this.multiStopFlight=multiStopFlight;
        this.countryAirline=countryAirline;
        this.barCode=barCode;
    }
    
    public String toString(){
        return "External Flight: "+
        "\nticket price per person: "+ticketPrice+" euro"+
        ", \nnumber of passengers: "+numberPassengers+
        ", \ndestination: "+destination+
        ", \nmulti-stop flight: "+multiStopFlight+
        ", \nairline's origin country"+countryAirline+
        ", \nbarcode: "+barCode;
    }
}
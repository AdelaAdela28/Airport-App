public class FlightThread extends Thread{
    @Override
    public void run(){
        try{
            System.out.println(Airport.getInstance().getNumberFlights());
            Thread.sleep(40000);
        }catch(InterruptedException e){
            System.out.println("Error!");
        }
    }
}
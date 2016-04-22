/**
 * Created by cj on 4/15/16.
 */
public class Passenger {

    double arrivalTime;
    double finalTime;
    int depart;
    int dest;
    int direction;  //0 = west, 1 = east

    public Passenger(double t, double fin, int departureStop, int destinationStop){
        arrivalTime = t;
        finalTime = fin;

        depart = departureStop;
        dest = destinationStop;

        if (dest < depart){
            direction = 0;
        }
        else if (dest > depart){
            direction = 1;
        }
        else {
            System.out.println("Passenger constructor error");
        }
    }

    public void setFinalTime(double time){
        finalTime = time;
    }

    public double getFinalTime(){
        return finalTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public int getDirection(){
        return direction;
    }

    public int getDestination(){
        return dest;
    }

    public int getDepartureStop(){
        return depart;
    }

    public void printInfo() {
        System.out.println("Arrival time: " + arrivalTime + " departureStop: " + depart + " destination: " + dest);
    }

}

package inheritanceexample;

public class RoadVehicle extends Vehicle{

    public void travelOnRoad(){
        System.out.println("these travels on Road");
    }

    public void start() {
        System.out.println("Road vehicle has started");
    }

    public void stop() {
        System.out.println("Road vehicle has stopped");
    }
    
    public void fuel() {
        System.out.println("Road vehicle has fueled");
    }
}

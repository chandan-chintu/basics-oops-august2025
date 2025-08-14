package inheritanceexample;

public class AirVehicle extends Vehicle{

    public void travelOnAir(){
        System.out.println("these travels on Air");
        super.color="Green";
        System.out.println("color is : "+super.color);
    }

    @Override
    public void start() {
        System.out.println("Air vehicle has started");
        super.start();
    }

    @Override
    public void stop() {
        System.out.println("Air vehicle has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Air vehicle has fueled");
    }
}

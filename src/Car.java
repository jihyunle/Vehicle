public class Car extends Vehicle{
    private String type;

    @Override
    public String getDestination() {
        return type;
    }

    @Override
    public void setDestination(String destination) {
        this.type = destination;
    }

    @Override
    String run(){
        return "The car is running";
    }
    String stop(){
        return "The car is stopping";
    }
    String accelerate(){
        return "The car is accelerating";
    }

    private String haulGravel(){
        return "The dump truck, a car object, is hauling 10 tons of gravel";
    }
}

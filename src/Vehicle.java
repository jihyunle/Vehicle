public abstract class Vehicle {
    private String destination;
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }
    abstract String run();  // an abstract method
    abstract String stop();
    abstract String accelerate();


}

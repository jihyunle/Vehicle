public class Boat extends Vehicle{
    private boolean isEmpty;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    String run(){
        return "The boat is running";
    }
    String stop(){
        return "The boat is stopping";
    }
    String accelerate(){
        return "The boat is accelerating";
    }

    private String crossRiver(){
        return "The boat is crossing the river";
    }

}

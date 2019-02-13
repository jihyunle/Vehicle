public final class Plane extends Vehicle {
    private String boardingPass;

    public String getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(String boardingPass) {
        this.boardingPass = boardingPass;
    }

    @Override
    String run(){
        return "The plane is running";
    }
    String stop(){
        return "The plane is stopping";
    }
    String accelerate(){
        return "The plane is accelerating";
    }

    public String takeOff(){
        return "The plane is taking off";
    }
    public String land(){
        return "The plane is landing";
    }

}


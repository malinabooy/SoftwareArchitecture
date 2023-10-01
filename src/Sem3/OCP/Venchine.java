package Sem3.OCP;

public class Venchine {
    private int maxSpeed;
    private String type;

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Venchine(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }


    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
}

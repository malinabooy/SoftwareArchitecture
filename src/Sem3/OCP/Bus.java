package Sem3.OCP;

public class Bus extends Venchine{
    public Bus(int maxSpeed, String type){
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }
}

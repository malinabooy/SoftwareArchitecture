package Sem3.OCP;

public class Car extends Venchine {
    public Car(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}

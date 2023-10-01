package Sem3;

import Sem3.OCP.Car;
import Sem3.OCP.Venchine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void mainOcp(){
        Venchine car = new Car(123);
        car.calculateAllowedSpeed();
    }
}


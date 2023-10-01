package Sem3.DIP;

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: Включено");
    }

    public void turnOff() {
        System.out.println("LightBulb: Выключено");
    }
}

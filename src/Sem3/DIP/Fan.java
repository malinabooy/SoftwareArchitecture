package Sem3.DIP;

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan: Включено");
    }

    public void turnOff() {
        System.out.println("Fan: Выключено");
    }
}

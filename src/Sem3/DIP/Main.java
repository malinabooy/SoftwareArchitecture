package Sem3.DIP;

public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();

        RemoteControl remote1 = new RemoteControl(bulb);
        RemoteControl remote2 = new RemoteControl(fan);

        remote1.turnOn();  // Включение лампы
        remote1.turnOff(); // Выключение лампы

        remote2.turnOn();  // Включение вентилятора
        remote2.turnOff(); // Выключение вентилятора
    }
}
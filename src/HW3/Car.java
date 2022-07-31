package HW3;

public abstract class Car {
    //начать движение
    public void go() {
        System.out.println("Машина едет");
    }
    //останавливаться
    public void stop() {
        System.out.println("Машина останавливается");
    }
    //включать фары
    public void light() {
        System.out.println("Машина включает фары");
    }
}

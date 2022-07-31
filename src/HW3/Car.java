package HW3;

public abstract class Car {
    public final String name;

    public Car(String name) {
        this.name = name;
    }
    //начать движение
    public void go() {
        System.out.println(this.name + " едет");
    }
    //останавливаться
    public void stop() {
        System.out.println(this.name + " останавливается");
    }
    //включать фары
    public void light() {
        System.out.println(this.name + " включает фары");
    }
}

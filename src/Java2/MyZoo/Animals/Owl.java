package Java2.MyZoo.Animals;

import Java2.MyZoo.Flyable;
import Java2.MyZoo.Flying;

public class Owl extends Flying implements Flyable {
    @Override
    public void fly() {
        System.out.println("Сова летит");
    }
}

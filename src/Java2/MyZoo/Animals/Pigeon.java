package Java2.MyZoo.Animals;

import Java2.MyZoo.Flyable;
import Java2.MyZoo.Flying;

public class Pigeon extends Flying implements Flyable {
    @Override
    public void fly() {
        System.out.println("Голубь летит");
    }
}

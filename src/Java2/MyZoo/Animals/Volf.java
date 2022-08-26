package Java2.MyZoo.Animals;

import Java2.MyZoo.Biteable;
import Java2.MyZoo.Biting;

public class Volf extends Biting implements Biteable {
    @Override
    public void bite() {
        System.out.println("Волк кусает");
    }
}

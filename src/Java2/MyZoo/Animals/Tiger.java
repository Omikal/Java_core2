package Java2.MyZoo.Animals;

import Java2.MyZoo.Biteable;
import Java2.MyZoo.Biting;

public class Tiger extends Biting implements Biteable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }
}

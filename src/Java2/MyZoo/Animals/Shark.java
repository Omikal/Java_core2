package Java2.MyZoo.Animals;

import Java2.MyZoo.Swimable;
import Java2.MyZoo.Swimming;

public class Shark extends Swimming implements Swimable {
     @Override
     public void swim() {
         System.out.println("Акула плывет");
     }
}


package Java2;

import Java2.MyZoo.Animals.*;
import Java2.MyZoo.Zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class
HW1_1 {
    public static void main(String[] args) {
        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.
        Owl owl = new Owl();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        Pigeon pigeon = new Pigeon();
        Dolphin dolphin = new Dolphin();
        Volf volf = new Volf();
        Zoo<Owl, Shark, Tiger> zoo1 = new Zoo<>(owl, shark, tiger);
        Zoo<Pigeon, Dolphin, Volf> zoo2 = new Zoo<>(pigeon, dolphin, volf);
        zoo1.getFlying().fly();
        zoo1.feedBiteable();
        zoo2.getBiting().bite();
        zoo2.getSwimming().swim();
        zoo2.feedFlyable();
        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.

        MyList myList = new MyList(3);
        int length = myList.length();
        for (int i = 0; i < myList.length(); i++) {
            myList.add(i, i);
        }
    }
}
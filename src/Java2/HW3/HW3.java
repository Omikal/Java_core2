package Java2.HW3;

import java.util.HashMap;
import java.util.HashSet;

public class HW3 {
    public static void main(String[] args) {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера
        HashSet<User> users = new HashSet<>();
        users.add(new User("Dimon"));
        users.add(new User("Dimon"));
        users.add(new User("Vasilyi"));
        users.add(new User("Petr"));
        System.out.println(users);
        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер
        HashSet<UserBroken> userBrokens = new HashSet<>();
        userBrokens.add(new UserBroken("Dimon"));
        userBrokens.add(new UserBroken("Vasilyi"));
        userBrokens.add(new UserBroken("Petr"));
        System.out.println(userBrokens);
        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap <CarBroken, Integer> carBroken = new HashMap<>();
        CarBroken car1 = new CarBroken();
        CarBroken car2 = new CarBroken();
        carBroken.put(car1, 1);
        carBroken.put(car2, 2);
        System.out.println(carBroken);
    }
}

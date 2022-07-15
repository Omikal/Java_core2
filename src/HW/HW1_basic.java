package HW;

import java.util.Scanner;

public class HW1_basic {
    public static void main(String[] args) {
//          Задание 1
        System.out.println("Задание 1");
        String hi = "                Hello ".trim();
        String world = " WoRld!".toLowerCase();
        char newLine = '\n';
        String text = (hi+world+newLine).repeat(3);
        System.out.println(text);

//          Задание 2
        System.out.println("Задание 2");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите рост в метрах (прим. 1,78) и нажмите enter\n");
        float height = s.nextFloat();
        System.out.println("Введите вес в кг (прим. 75,96) и нажмите enter\n");
        float weight = s.nextFloat();
        float index = weight/(height*height);
        System.out.println("Ваш индекс массы тела =" + ' ' + index);

//          Задание 3
        System.out.println("Задание 3");
        char[] letters = new char[] {'a', 'b', 'c', 'd', 'e'};
        String charText = String.valueOf(letters);
        System.out.println(charText);
        letters[3] = 'h';
        String charText2 = String.valueOf(letters);
        System.out.println(charText2);
    }
}

package HW1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HW1_adv {
    public static void main(String[] args) {
//      Задание 1
        System.out.println("Задание 1");
        String num = "234";
        String txt = "some_text";
        int num2 = Integer.parseInt(num);
        int lng = txt.length();
        System.out.println(num2 + lng);

//      Задание 2
//      Посчитать (a+b)^2 = ?, при a=3, b=5
        System.out.println("Задание 2");
        double number1 = 3;
        double number2 = 5;
        double number3 = Math.pow(number1 + number2, 2);
        System.out.println(number3);

//      Задание 3
//Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15

        System.out.println("Задание 3");
        int[] a = new int[]{1, 2, 5, 7, 10};
        int[] b = new int[]{2, 3, 2, 17, 15};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c = IntStream.range(0, a.length).map(i -> a[i] * b[i]).toArray();
        int [] d = new int[a.length + b.length + c.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            d [i] = a [i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            d [count] = b [j];
            count++;
        }
        for (int k = 0; k < c.length; k++) {
            d [count] = c[k];
            count++;
        }
        for (int i = 0; i < d.length; i++)
            System.out.print(d [i] + " ");

//        В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        System.out.println("\nЗадание 4");
        String world = "Hello world!".replaceAll("l", "r").toUpperCase();
        world = world.substring(0, 8);
        System.out.println(world);
    }
}


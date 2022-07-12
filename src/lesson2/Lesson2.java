package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String text = "Это текст\n";
        int number = 10;
//        Нижний регистр
        String newText = text.toLowerCase();
//        Верхний регистр
        String newText2 = text.toUpperCase();
//        замена строки
        String txt = text.replace("текст","нет");
//         Повторить строку n раз
        String repeatedText = text.repeat(10);

        int clet = text.length();

        System.out.println(text);
        System.out.println(newText);
        System.out.println(newText2);
        System.out.println(clet);
        System.out.println(repeatedText);
    }
}

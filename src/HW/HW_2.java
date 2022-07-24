package HW;

import java.util.Arrays;

public class HW_2 {
    public static void main(String[] args) {

            // Домашка
            // Базовый уровень

            // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
            // Ожидаемый результат: 1а 2а 3а .. 100а

            System.out.println("Задание 1");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + "a" + " ");
            }


            // Задание №2
            System.out.println("\n");
            System.out.println("Задание 2");
            // Дано:
            int ageChildren = 10;
            // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
            // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
            // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
            // Проверьте работоспособность условий, через изменение значения переменной.

            if (ageChildren < 6) {
                System.out.println("Ребенок идет в сад");
            } else if (ageChildren >= 6 && ageChildren < 11) {
                System.out.println("Ребенок идет в младшую школу");
            } else if (ageChildren >= 11 && ageChildren < 17) {
                System.out.println("Ребенок идет в среднюю школу");
            } else {
                System.out.println("Ребенок идет в университет (или это не ребенок)))");
            }

            System.out.println();
            System.out.println("Задание 3");
            // Задание №3
            // Дано:
            boolean chicken = false;
            boolean vegetables = true;
            boolean sour = false;
            boolean toast = true;
            boolean sausage = true;
            boolean eggs = true;
            // Задача: Повара попросили сделать салат.
            // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
            // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
            // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
            // Если ингредиентов нет, то повар объявляет: У меня ничего нет
            // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
            // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
            // Проверьте работоспособность условий, через изменение значения переменных.

            if ((chicken && vegetables) && (sour && toast)){
                System.out.println("Я готовлю \"Цезарь\"");
            } else if ((vegetables && eggs) && (sausage || chicken)) {
                System.out.println("Я готовлю \"Оливье\"");
            } else if (vegetables) {
                System.out.println("Я готовлю \"Овощной салат\"");
            } else
                System.out.println("У меня ничего нет");


            // Задание №4
            System.out.println();
            System.out.println("Задание 4");
            // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
            // Написать к ним конструктор, сеттеры, геттеры.
            // Создать экземпляры этих двух животных.
                Dog tuzik = new Dog("Tuzik", 3, "small", "grey");
                Cat pushok = new Cat ("Pushok", 5, "medium", "white");
                System.out.println(tuzik.getDogName());
                System.out.println(tuzik.getDogAge());
                System.out.println(pushok.getCatName());
                System.out.println(pushok.getCatColor());
            // Продвинутый уровень
            System.out.println();
            System.out.println("Задание 1 Продвинутое");

            // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
            // пока не получиться больше 1_000_000.
            // Дано:
            double increment = 0.01123;
            double result = 0;
            // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
            // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
            // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

            int counter = 0;
            for (int i = 0; (increment > 0) && (result <= 1_000_000); i++) {
                if (increment <= 0) {
                    System.out.println("increment меньше или равен 0");
                    break;
                }   else if (result <= 1_000_000){
                    result = result + increment;
                    counter++;
                }
            }
            System.out.println(counter + " итераций до 1_000_000");
            System.out.println();

            System.out.println("Задание 2 Продвинутое");
            // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
            // Например, дано: [1,1,1,1,1]
            // Ожидаемый результат: [0,1,0,1,0]
            // Подсказка: прочитай про операнд "%".

            int [] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int i : a ) {
                System.out.print(i + " ");
            }
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    a [i] = 0;
                }
            }
            System.out.println();
            for (int i : a ) {
                System.out.print(i + " ");
            }

            System.out.println("\n");
            System.out.println("Задание 3 Продвинутое");
            // Задание №3:
            // Дано:
            boolean hasFuel = true;
            boolean hasElectricsProblem = true;
            boolean hasMotorProblem = false;
            boolean hasTransmissionProblem = false;
            boolean hasWheelsProblem = true;
            // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
            // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
            // Если у машины проблема с двигателем, то чинят и берут 10 000.
            // Если у машины проблема с электрикой, то чинят и берут 5000.
            // Если у машины проблема с коробкой передач, то чинят и берут 4000.
            // Если у машины проблема с колесами, то чинят и берут 2000.
            // Если две детали сломаны, то на общий счет идет скидка 10%.
            // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
            // Если нет бензина и что-то сломано, то за консультацию денег не берут.
            // Ситуации, что бензин есть и ничего не сломано - быть не может.
            // Ожидаемый результат: выведен на экран счет клиенту.

            double price = 0;
            int br = 0;
            if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
                price = price + 1000;
            }
            if (hasElectricsProblem) {
                price = price + 5_000;
                br++;
            }
            if (hasMotorProblem) {
                price = price + 10_000;
                br++;
            }
            if (hasTransmissionProblem) {
                price = price + 4000;
                br++;
            }
            if (hasWheelsProblem) {
                price = price + 2000;
                br++;
            }
            if (br >= 2 && (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem))) {
                price = price * 0.8;
            } else if (br >= 2) {
                price = price * 0.9;
            }
            System.out.println(price);
            System.out.println();

            // Задание №4:
            // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
            // (написать геттеры на все аттрибуты).
            // Количество работников минимум 3.
            // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
            // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
            // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
            // У склада есть только одна позиция - Водка.
                Storage storage = new Storage();
                storage.setProductCountStorage(120);
                Worker w1 = new Worker(storage);
                Worker w2 = new Worker(storage);
                Worker w3 = new Worker(storage);
                w1.poteryaPoter();
                System.out.println(w1.getProductDestroyed());
                w2.poteryaPoter();
                w2.poteryaPoter();
                w2.poteryaPoter();
                w3.poteryaPoter();
                System.out.println(w2.getProductDestroyed());
                System.out.println(w3.getProductDestroyed());
                System.out.println(storage.getProductCountStorage());
            // Экспертный уровень:
            // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
            // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
            // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
            // К474СЕ178 - где 178 регион

            // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
            // Не повторяющиеся

            //Входящие данные
            // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
            // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
            // { 1 : {
            //      "out" : ["К474СЕ178"],
            //      "input": ["А222РТ178"]
            //    },
            //   2 : {
            //        "out" : ["К722АВ12", "А222РТ178"],
            //        "input" : ["М001АВ01", "А023РВ73"],
            //   }
            // ..
            //  }

            //Список технологий:
            // Set (HashSet) - узнать что это, set.contains(), set.put()
            // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
            // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
            // Регулярные выражения - вытащить регион авто
    }
}

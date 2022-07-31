package HW3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;

public class HW3 {
        public static void main(String[] args) throws IOException, URISyntaxException {
            //Базовый уровень
            //Задача №1
            //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
            //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
            //Необходимо:
            // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
            // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
            // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
            // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них
            System.out.println("Задание 1");
            Toyota toyota = new Toyota("Camry");
            Zhiga zhiga = new Zhiga("devyatka");
            toyota.go();
            zhiga.light();
            zhiga.breakOut();
            toyota.music();
            //Задача №2
            //Необходимо:
            // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
            // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
            // Ожидаемый результат: "Моя бабушка читает газету жизнь"
            System.out.println("Задание 2");
            String filename = "C:\\Users\\Skywolf\\Desktop\\Java_core2\\hw3.txt";
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write("Моя бабушка\n");
            fileWriter.write(" читает газету жизнь");
            fileWriter.close();
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                line.replace("\n" , " ");
                System.out.print(line);
            }
            fileReader.close();
            bufferedReader.close();
            //Задача №3
            //Необходимо:
            // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
            // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
            // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
            // 4. Записать в файл "report.txt" данные из объекта класса.
            // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
            System.out.println("Задание 3");
            financialRecord finRec = new financialRecord(0, 0);
            finRec.setIncomes(500);
            finRec.setOutcomes(300);
            String repName = "C:\\Users\\Skywolf\\Desktop\\Java_core2\\report.txt";
            FileWriter repWriter = new FileWriter(repName);
            repWriter.write("доходы = " + finRec.getIncomes() + ", расходы = " + finRec.getOutcomes());
            repWriter.close();

            //Продвинутый уровень
            //Задача №1
            // Сделать задачу №1 (1 и 2 пункты) из базовой.
            // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
            // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
            // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
            // и вызвать характерные для нее методы.
            Car[] cars = new Car [40];
            for (int i = 0; i < 20; i++) {
                cars[i] = CarFactory.makeToyota();
                cars[i + 20] = CarFactory.makeZhiga();
            }
            for (Car car : cars) {
                if (car instanceof Toyota) {
                    Toyota toyota1 = (Toyota) car;
                    toyota1.music();
                } else if (car instanceof Zhiga) {
                    Zhiga zhiga1 = (Zhiga) car;
                    zhiga1.breakOut();
                }
            }

            Random random = new Random(1);

            //Задача №2
            // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
            // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
            // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
            // 4. Записать в файл "report.txt" все данные из отчетов.
            // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
            // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
            financialRecord[] finRec1 = new financialRecord[10];
            for (int i = 0; i < 10; i++) {
                finRec1[i] = new financialRecord(random.nextInt(10_000), random.nextInt(10_000));
            }
            String path = "C:\\Users\\Skywolf\\Desktop\\Java_core2\\rep.txt";
            FileWriter repWrite = new FileWriter(path);
            for (financialRecord record : finRec1) {
                repWrite.write(record.result());
            }
            repWrite.close();

            int sumIn;
            int sumOut;
            FileReader fileReader2 = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader2);


            //Экспертный уровень
            // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
            // Внутри файла следующий формат:
            // pyterochka;122300.20;100312.10;20/01/2012
            // pyterochka;299922.00;323333.02;21/01/2012
            // perekrestok;9920.20;28200.01;21/01/2012
            // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

            //Читать файлы нужно через
            //Прочитать все файлы из папки
            //       String path1 = "путь до файла";
            //      Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));


            // Задача №1
            // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
            // Формат ожидаемого результат:
            // Прибыль по магазину pyterochka по месяцам
            // 01.2012: 20000.00
            // 02.2012: -100332.00
            // и тд


            // Задача №2
            // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
            // Формат ожидаемого результата:
            // Расходы pyterochka за весь период: 20032220.00
            // Расходы perekrestok за весь период: 1734220.00
            // .. и тд
        }
    }

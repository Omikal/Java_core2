package HW3;

public class CarFactory {
    //создать жигули
    public static Zhiga makeZhiga() {
        return new Zhiga("devyatka");
    }
    //создать тойоту
    public static Toyota makeToyota() {
        return new Toyota("Camry");
    }
    //создать по 20 штук, сложить в массив
}

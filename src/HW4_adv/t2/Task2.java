package HW4_adv.t2;

public class Task2 {
    //Задача №2
    //2. Создать следующую структуру из классов и интерфейсов
    // магазин (обладает работниками)
    // работник (обладает часами - (часы одни))
    // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
    // Бренд (обладает массивом магазинов)
    // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
    // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
    // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
    // обработать ошибку сломанных часов.
    // Ожидание вывода на экран:
    // Часы тикают
    // Ошибка: Часы сломались.
    public static void main(String[] args) {
        Clock clock1 = new Clock(true);
        Clock clock2 = new Clock(false);
        Worker worker1 = new Worker(clock1);
        Worker worker2 = new Worker(clock2);
        Worker[] wShop1 = {worker1};
        Worker[] wShop2 = {worker2};
        Shop shop1 = new Shop(wShop1);
        Shop shop2 = new Shop(wShop2);
        Shop[] shops = {shop1, shop2};
        Brand brand = new Brand(shops);
        for (Shop shop : brand.getShops()) {
            for (Worker sWorker : shop.getWorkers()) {
                Clock workerClock = sWorker.getClock();
                try {
                    workerClock.tickaut();
                } catch (WatchBrokenExeption e) {
                    System.out.println("Ошибка: часы сломались");
                }
            }
        }
    }
}

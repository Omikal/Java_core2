package HW4_adv.t1;

public class Paporotnik extends Plant implements Bloomable{
    @Override
    public void bloom() {
        System.out.println("Папоротник: умеет цвести");
    }
}

package HW4_adv;

public class Paporotnik extends Plant implements Bloomable{
    @Override
    public void bloom() {
        System.out.println("Папоротник: умеет цвести");
    }
}

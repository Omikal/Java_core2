package HW4_adv;

public class Rose extends Plant implements Smellable, Bloomable{
    @Override
    public void smell() {
        System.out.println("Роза: умеет пахнуть");
    }
    @Override
    public void bloom() {
        System.out.println("Роза: умеет цвести");
    }
}

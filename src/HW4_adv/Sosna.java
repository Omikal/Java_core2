package HW4_adv;

public class Sosna extends Tree implements Smellable {
    public Sosna(boolean hasCones) {
        super(hasCones);
    }

    @Override
    public void smell() {
        System.out.println("Сосна: умеет пахнуть");
    }
}

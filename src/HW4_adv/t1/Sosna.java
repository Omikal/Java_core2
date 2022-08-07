package HW4_adv.t1;

public class Sosna extends Tree implements Smellable {
    public Sosna(boolean hasCones) {
        super(hasCones);
    }

    @Override
    public void smell() {
        System.out.println("Сосна: умеет пахнуть");
    }
}

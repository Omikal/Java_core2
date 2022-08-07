package HW4_adv.t1;

public class El extends Tree implements Smellable {
    public El(boolean hasCones) {
        super(hasCones);
    }
    @Override
    public void smell() {
        System.out.println("Ель: умеет пахнуть");
    }
}

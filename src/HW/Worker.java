package HW;

public class Worker {
    private int productDestroyed = 0;
    private Storage storage;
    public Worker(Storage storage) {
        this.storage = storage;
    }
    public int getProductDestroyed () {
        return productDestroyed;
    }
    public void productDestroyed (int productDestroyed) {
        this.productDestroyed = productDestroyed;
    }
    public void poteryaPoter () {
        if (storage.getProductCountStorage() > 0) {
            storage.setProductCountStorage(storage.getProductCountStorage() - 1);
            productDestroyed = productDestroyed + 1;
            System.out.println("Ура, я испортил водку!");
        } else {
            System.out.println("Больше нет водки, чтобы испортить!");
        }
    }
}

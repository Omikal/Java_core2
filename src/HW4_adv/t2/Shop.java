package HW4_adv.t2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private Worker[] workers;
    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public Shop(Worker worker1) {
    }

    public Worker[] getWorkers() {
        return workers;
    }
}

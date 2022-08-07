package HW4_adv.t2;

public class Clock {
    private boolean isBroken;
    public Clock(boolean isBroken) {
        this.isBroken = isBroken;
    }
    public void tickaut() throws WatchBrokenExeption {
        if (isBroken) {
            throw new WatchBrokenExeption();
        }
        System.out.println("Часы тикают");
    }
}

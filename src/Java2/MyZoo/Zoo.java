package Java2.MyZoo;

public class Zoo <F extends Flying, S extends  Swimming, B extends Biting>{
    private F flying;
    private S swimming;
    private B biting;

    public Zoo(F flying, S swimming, B biting) {
        this.flying = flying;
        this.swimming = swimming;
        this.biting = biting;
    }

    public F getFlying() {
        return flying;
    }

    public void setFlying(F flying) {
        this.flying = flying;
    }

    public S getSwimming() {
        return swimming;
    }

    public void setSwimming(S swimming) {
        this.swimming = swimming;
    }

    public B getBiting() {
        return biting;
    }

    public void setBiting(B biting) {
        this.biting = biting;
    }
    public void feedFlyable(){
        System.out.println("Летающее животное ест");
    }
    void feedSwimmable(){
        System.out.println("Плавающее животное ест");
    }
    public void  feedBiteable(){
        System.out.println("Кусающееся животное ест");
    }
}

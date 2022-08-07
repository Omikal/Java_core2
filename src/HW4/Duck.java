package HW4;

public class Duck implements Flyable {
    //isInjured
    public boolean isInjured;
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }
    public boolean isInjured () {
        return isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка - утка ранена");
        }
        System.out.println("Утка летит");
    }
}

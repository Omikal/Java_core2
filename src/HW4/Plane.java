package HW4;

public class Plane implements Flyable{
    //countPassengers
    private int cPassengers;
    public Plane (int cPassengers) {
        this.cPassengers = cPassengers;
    }
    public int getcPassengers() {
        return cPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (cPassengers < 0) {
            throw new FlyException("Ошибка - пассажиров меньше 0");
        }
        System.out.println("Самолет летит");
    }
}

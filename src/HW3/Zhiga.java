package HW3;

public class Zhiga extends Car {
    public Zhiga(String name) {
        super(name);
    }
    //ломается
    public void breakOut() {
        System.out.println(this.name + " сломалась");
    }
}

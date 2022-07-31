package HW3;

public class Toyota extends Car {
    public Toyota(String name) {
        super(name);
    }
    //включает музыку
    public void music() {
        System.out.println(this.name + " включает музыку");
    }
}

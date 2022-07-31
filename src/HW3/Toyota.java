package HW3;

public class Toyota extends Car {
    private String name;
    private String color;
    public Toyota(String toyotaName, String toyotaColor) {
        this.name = toyotaName;
        this.color = toyotaColor;
    }
    public String getToyotaColor() {
        return this.color;
    }
    public String getToyotaName() {
        return this.name;
    }
    //включает музыку
    public void music() {
        System.out.println("Тойота включает музыку");
    }
}

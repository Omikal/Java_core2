package HW3;

public class Zhiga extends Car {
    private String name;
    private String color;
    public Zhiga(String zhigaName, String zhigaColor) {
        this.name = zhigaName;
        this.color = zhigaColor;
    }
    public String getZhigaColor() {
        return this.color;
    }
    public String getZhigaName() {
        return this.name;
    }
    //ломается
    public void breakOut() {
        System.out.println("Жигули сломалась");
    }
}

package HW;

public class Dog {
    private static String prefixDog = "Собака";
    private String name;
    private int age;
    private String size;
    public Dog (String nameDog, int ageDog, String sizeDog) {
        this.name = nameDog;
        this.age = ageDog;
        this.size = sizeDog;
    }
    public String getDogName() {
        return prefixDog + this.name;
    }
}

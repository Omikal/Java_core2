package HW;

public class Dog {
    private static String prefixDog = "Собака";
    private String name;
    private int age;
    private String size;
    private String color;
    public Dog (String nameDog, int ageDog, String sizeDog, String colorDog) {
        this.name = nameDog;
        this.age = ageDog;
        this.size = sizeDog;
        this.color = colorDog;
    }
    public String getDogName () {

        return prefixDog + this.name;
    }
    public int getDogAge () {
        return this.age;
    }
    public String getDogSize () {

        return this.size;
    }
    public String getDogColor () {
        return this.color;
    }
}

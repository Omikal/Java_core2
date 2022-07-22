package HW;

public class Cat {
    private static String prefixCat = "Кот";
    private String name;
    private int age;
    private String size;
    private String color;
    public Cat (String nameCat, int ageCat, String sizeCat, String colorCat) {
        this.name = nameCat;
        this.age = ageCat;
        this.size = sizeCat;
        this.color = colorCat;
    }
    public String getCatName () {
        return prefixCat + this.name;
    }
    public int getCatAge () {
        return this.age;
    }
    public String getCatSize () {
        return this.size;
    }
    public String getCatColor () {
        return this.color;
    }
}

package ac.za.cput;

public class Bird {
    /*i. Object Equality
    ii. Object Identity
    iii. Failing Test
    iv.Timeouts
    v. DisablingTest*/
    String color,size,type;
    int age;

    public Bird(String color, String size, String type, int age) {
        this.color = color;
        this.size = size;
        this.type = type;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}

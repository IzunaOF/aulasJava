package Sem02aula06;

public class Pessoa {

    private Double age;
    private Double height;
    private String name;

    public Pessoa(double pAge, double pHeight, String pName) {
        age = pAge;
        height = pHeight;
        name = pName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(double newAge) {
        age = newAge;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age.intValue();
    }

    public double getHeight() {
        return height;
    }
}

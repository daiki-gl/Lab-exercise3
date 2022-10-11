package inheritance.parent;

import inheritance.child.Reptile;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    // Default
    public Animal() {
        this.height = 0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public Animal(int height, int weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAnimaltype(String animalType) {
        this.animalType = animalType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}

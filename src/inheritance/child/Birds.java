package inheritance.child;

import inheritance.parent.Animal;

public class Birds extends Animal {
    String feature;
    String fly;

    public Birds() {
        this.feature = "Animals with feathers";
        this.fly = "Can fly";
    }

    public Birds(int height, int weight, String animalType, String bloodType, String feature, String fly) {
        super(height, weight, animalType, bloodType);
        this.feature = feature;
        this.fly = fly;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }
}

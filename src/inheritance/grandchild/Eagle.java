package inheritance.grandchild;

import inheritance.child.Birds;

public class Eagle extends Birds {

    public Eagle() {
    }

    public Eagle(int height, int weight, String animalType, String bloodType, String feature, String fly) {
        super(height, weight, animalType, bloodType, feature, fly);
    }

    // @Override
    // public String toString() {
    //     return "Eagle \n" + "height:" + getHeight() + ", weight:" + getWeight() + ", animalType:" + getAnimalType()
    //             + ", bloodType:" + getBloodType()
    //             + "\n"
    //             + "feature:" + getFeature() + ", fly:" + getFly();
    // }

    public String showInfo() {
        return "Eagle \n" + "height:" + getHeight() + ", weight:" + getWeight() + ", animalType:" + getAnimalType()
                + ", bloodType:" + getBloodType()
                + "\n"
                + "feature:" + getFeature() + ", fly:" + getFly();
    }

}

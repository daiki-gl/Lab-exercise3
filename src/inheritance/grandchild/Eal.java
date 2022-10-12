package inheritance.grandchild;

import inheritance.child.Fish;

public class Eal extends Fish {
    String feature;

    public Eal() {
        this.feature = "Release electric charge";
    }

    public Eal(int height, int weight, String animalType, String bloodType, String habitat, String gills,
            String feature) {
        super(height, weight, animalType, bloodType, habitat, gills);
        this.feature = feature;
    }

    @Override
    public String toString() {
        return showInfo();
    }

    public String showInfo() {
        return "Eal \n" + "height:" + getHeight() + ", weight:" + getWeight() + ", animalType:" + getAnimalType()
                + ", bloodType:" + getBloodType()
                + "\n"
                + "habitat:" + getHabitat() + ", gills:" + getGills() + ", feature:" + feature;
    }
}

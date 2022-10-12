package inheritance.grandchild;

import inheritance.child.Reptile;

public class Crocodile extends Reptile {

    //Default
    public Crocodile() {
        setSkinType("Hard-shelled Egg");
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
    }

    @Override
    public String toString() {
        return showInfo();
    }

    public String showInfo() {
        return "Crocodile" + "\n" + "skinType:" + getSkinType() + ", bone:" + getBone() + ", eggType:" + getEggType()
                + "\n"
                + "height:" + getHeight() + ", weight:" + getWeight()
                + "\n"
                + "animalType:" + getAnimalType() + ", bloodType:" + getBloodType();
    }
}

package inheritance.child;

import inheritance.parent.Animal;

public class Fish extends Animal {
    private String habitat;
    private String gills;

    // Default
    public Fish() {
        this.habitat = "Live in water";
        this.gills = "Has gills";
    }

    public Fish(int height, int weight, String animalType, String bloodType, String habitat, String gills) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.gills = gills;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGills() {
        return gills;
    }

    public void setGills(String gills) {
        this.gills = gills;
    }
}

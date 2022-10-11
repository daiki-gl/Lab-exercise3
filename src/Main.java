import inheritance.grandchild.Crocodile;
import inheritance.grandchild.Eagle;
import inheritance.grandchild.Eal;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Common
         * int height, int weight, String animalType, String bloodType
         */

        /* Reptile
         * String skinType, String bone, String eggType
         */
        Crocodile crocodile = new Crocodile(100,200,"Reptile","AB","Hard","Backbone","Hard-shelled egg");
        System.out.println("----------------------");
        System.out.println(crocodile.showInfo());
        
        /* Fish
        * String habitat, String gills, String feature
        */
        Eal eal = new Eal(50,65,"Fish","O","Water","Has gills","Release electric charge");
        System.out.println("----------------------");
        System.out.println(eal.showInfo());
        
        
        /* Birds
        * String feature, String fly
        */
        Eagle eagle = new Eagle(80, 55, "Bird", "A","With feather", "Can fly");
        System.out.println("----------------------");
        System.out.println(eagle.showInfo());

    }
}

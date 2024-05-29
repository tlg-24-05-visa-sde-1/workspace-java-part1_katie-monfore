package lickity.split;

/*
Class to model the styles on purpose of Icecream
It has NO main() method - classes like these don't ----iceCreamClient has it
 */

public class Icecream {
    //properties or attributes of icecream
    private String brand; //constraint [ name brands here ]
    private int servings; //[constraint 1-10]
    private String cupOrCone;
    private Flavor flavor; ///this is my enum

    //constructors
    public Icecream() {
        // DEFAULT CONSTRUCTOR
    }

    public Icecream(String brand, Flavor flavor) {
        setBrand(brand);
        setFlavor(flavor);
    }

    public Icecream(String brand, Flavor flavor, int servings) {
        this(brand); //delegate to brand ctor above me for handling brand
        setServings(servings);//handle servings myself by delegating directly to its setter
        setFlavor(flavor);
    }


    //4 argument constructor
    public Icecream(String brand, Flavor flavor, int servings, String cupOrCone) {
        this(brand, flavor, servings);
        setCuporCone(cupOrCone);
    }

    private void setCuporCone(String cupOrCone) {
        this.cupOrCone = cupOrCone;
    }

    public Icecream(String brand) {
        this.brand = brand;
    }

    public static boolean getID() {
        return false;
    }


    // functions or methods (aka behaviors)
    public void eat() {
        System.out.println("Eating up your " + brand + " icecream!");
    }

    public void saveForLater() {
        System.out.println("Saving for later " + servings + " servings of " + brand + " icecream as a bribe!");
    }

    public void useAsBribe() {
        System.out.println("Using as a bribe " + "a " + cupOrCone + " from " + brand + " icecream!");
    }

    //ACCESSOR get/set methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getCupOrCone() {
        return cupOrCone;
    }

    public void CuporCone(String type) {
        this.cupOrCone = cupOrCone;
    }

//    public String toString() {
//        return "Get you an icecream from " + getBrand() + ". "  + servings + " servings" +" in a " + getCupOrCone() + ". TREAT YOSELF!";
//    }

    public void setBribe(String takeMeToKokomo) {
    }

    @Override
    public String toString() {
        return String.format("Icecream{brand='%s', servings=%d, cupOrCone='%s', flavor=%s}", getBrand(), getServings(), getCupOrCone(), getFlavor());
    }
}

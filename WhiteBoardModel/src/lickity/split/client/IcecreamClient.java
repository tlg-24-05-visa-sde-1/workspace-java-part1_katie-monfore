package lickity.split.client;

import lickity.split.Icecream;
import lickity.split.Flavor;

public class IcecreamClient {
    public static void main(String[] args) {
        Icecream icecream1 = new Icecream("Baskin Robbins", Flavor.KEYLIME, 5, "cone");
        System.out.println(icecream1);

        icecream1.eat();
        icecream1.saveForLater();
        System.out.println(icecream1);

        //create another icecream object using the constructor with 4 arguments
        Icecream icecream2 = new Icecream("Cold Stone", Flavor.COOKIEDOUGH, 4, "cone");
        System.out.println(icecream2);

        icecream2.eat();
        icecream2.saveForLater();
        icecream2.useAsBribe();
        System.out.println(icecream2);

        Icecream icecream3 = new Icecream("H-E-B", Flavor.VANILLA, 3, "cup");

        icecream3.eat();
        System.out.println(icecream3);

        System.out.println(Icecream.getID() + " Icecream.");
    }
}
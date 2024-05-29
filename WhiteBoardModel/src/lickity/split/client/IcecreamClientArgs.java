package lickity.split.client;

import lickity.split.Icecream;
import lickity.split.Flavor;

import java.util.Arrays;

class IcecreamClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            Icecream icecream = new Icecream();
            String usage = "Usage: java IcecreamClientArgs <brand> <servings> <cupOrCone> <flavor>";
            String example = "Example: java IcecreamClientArgs BaskinRobbins 3 cone VANILLA";
            String note = "Note: Flavor options are: " + Arrays.toString(Flavor.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }

        String brand = args[0];
        int servings = Integer.parseInt(args[1]);
        String cupOrCone = args[2];
        Flavor flavor;

        flavor = Flavor.valueOf(args[3].toUpperCase());
        System.out.println("Invalid flavor input. Defaulting to VANILLA.");
        flavor = Flavor.VANILLA;


        Icecream icecream = new Icecream(brand, flavor, servings, cupOrCone);
        System.out.println("Congratulations on your delicious ice cream choice! Here are the details:");
        System.out.println(icecream);
    }
}

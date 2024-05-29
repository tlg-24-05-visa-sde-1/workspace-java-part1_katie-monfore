/* I need help with validation tests pleeeeeease

 */

package lickity.split.test;

import lickity.split.Flavor;
import lickity.split.Icecream;



public class IcecreamValidationTest {
    public static void main(String[] args) {
        Icecream i1 = new Icecream();
        System.out.println(i1);
        System.out.println();

        Icecream i2 = new Icecream("H-E-B", Flavor.KEYLIME);
        System.out.println(i2);
        System.out.println();

        Icecream i3 = new Icecream("Coldstone", Flavor.CHOCOLATE, 3);
        System.out.println(i3);
        System.out.println();

        Icecream i4 = new Icecream("H-E-B", Flavor.VANILLA,6, "cup");
        System.out.println(i4);
        System.out.println();

    }
}

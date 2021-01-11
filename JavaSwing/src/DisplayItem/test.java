package DisplayItem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[33m";

    /**
     * Add normal data
     */
    public static void testNormal() {
        Weapon Dark_Sword = new DTOSword(1, 1, "Dark Sword", 2, 15, "darksword.png");
        Weapon wand = new DTOWand(10, "Fire", 500, "Wand of destroy", 10, 20, "wand1.png");

        System.out.println(Dark_Sword.toString());
        System.out.println(Dark_Sword.dealDamage());
        System.out.println(wand.toString());
        System.out.println(wand.dealDamage());
    }

    /**
     * read database without Abstract
     */
    public static void testConnData() {
        BUSWand busWand = null;
        try {
            busWand = new BUSWand();
            busWand.display();
            busWand.dealDamage();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

        BUSSword busSword = null;
        try {
            busSword = new BUSSword();
            busSword.display();
            busSword.dealDamage();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Connect Database With Abstract
     */
    public static void ConnDataWea() {
        BUS list_Weapon = null;
        try {
            list_Weapon = new BUS();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

        list_Weapon.display();
        list_Weapon.dealDamage();
        
        System.out.println(ANSI_RED + "Sorting name inc" + ANSI_RESET);
        list_Weapon.sortingName(true);
        list_Weapon.display();
    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Data cant change" + ANSI_RESET);
        testNormal();
        System.out.println(ANSI_RED + "Read database without abstract class" + ANSI_RESET);
        testConnData();
        System.out.println(ANSI_RED + "Read database abstract class" + ANSI_RESET);
        ConnDataWea();
    }
}

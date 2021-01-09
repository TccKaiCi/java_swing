package SearchTable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

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
        try {
            BUSWand busWand = new BUSWand();
            busWand.display();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BUSSword busSword = new BUSSword();
            busSword.display();
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
    }
            
    public static void main(String[] args) {
        ConnDataWea();
    }
}

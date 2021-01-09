package SearchTable;

import java.util.ArrayList;

public class BUS {

    private ArrayList<Weapon> list_WP;
    private DAO dao;

    public BUS() throws Exception {
        list_WP = new ArrayList<>();
        dao = new DAO();
        list_WP = dao.readDB();
    }

    public void display() {
        for (Weapon weapon : list_WP) {
            weapon.display();
        }
    }
    
    public void dealDamage() {
        for (Weapon weapon : list_WP) {
            System.out.println(
                    weapon.getStrName() + " Deal Damage: "
                    +weapon.dealDamage());
        }
    }
}

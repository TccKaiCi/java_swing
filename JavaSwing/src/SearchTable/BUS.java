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
                    + weapon.dealDamage());
        }
    }

    public String[] getInforImage() {
        String[] arrImage = new String[list_WP.size()];
        int i = 0;

        for (Weapon weapon : list_WP) {
            arrImage[i] = weapon.getStrImage();
            i++;
        }

        return arrImage;
    }
    
    public Weapon[] getInfor() {
        Weapon[] weapons = new Weapon[list_WP.size()];
        int i = 0;

        for (Weapon weapon : list_WP) {
            weapons[i] = weapon;
            i++;
        }

        return weapons;
    }
    
    public int getSize() {
        return list_WP.size();
    }
}

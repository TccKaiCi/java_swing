package DisplayItem;

import java.util.ArrayList;

public class BUSWand {
    private ArrayList<Weapon> list_WPW;
    /**
     * Xử lý các lệnh trong SQL
     */
    private DAOWand wandDAO;

    public BUSWand() throws Exception {
        list_WPW = new ArrayList<>();
        wandDAO = new DAOWand();
        list_WPW = wandDAO.readDB();
    }
    
    public void display() {
        for (Weapon weapon : list_WPW) {
            weapon.display();
        }
    }
    
    public void dealDamage() {
        for (Weapon weapon : list_WPW) {  
            weapon.dealDamage();
        }
    }
    
    public int length() {
        return list_WPW.size();
    }
}

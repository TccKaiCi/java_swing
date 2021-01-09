package SearchTable;

import java.util.ArrayList;

public class BUSSword {
    private ArrayList<Weapon> list_WPS;
    /**
     * Xử lý các lệnh trong SQL
     */
    private DAOSword swordDAO;

    public BUSSword() throws Exception {
        list_WPS = new ArrayList<>();
        swordDAO = new DAOSword();
        list_WPS = swordDAO.readDB();
    }
    
    public void display() {
        for (Weapon weapon : list_WPS) {
            weapon.display();
        }
    }
}

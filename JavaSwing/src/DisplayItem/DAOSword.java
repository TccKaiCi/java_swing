package DisplayItem;

import ConnectDatabase.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOSword {

    MyConnectUnit connect;

    public ArrayList<Weapon> readDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new MyConnectUnit("SearchTableDB");

        ResultSet result = this.connect.Select("tblsword", condition, orderBy);
        ArrayList<Weapon> swords = new ArrayList<>();
        while (result.next()) {
            Weapon sword = new DTOSword(
                    Integer.parseInt(result.getString("sharpness")));
            sword.setiId(Integer.parseInt(result.getString("id")));
            sword.setStrName(result.getString("name"));
            sword.setiDamage(Integer.parseInt(result.getString("damage")));
            sword.setiRange(Integer.parseInt(result.getString("range")));
            sword.setStrImage(result.getString("image"));
            swords.add(sword);
        }
        connect.Close();
        return swords;
    }

    public ArrayList<Weapon> readDB(String condition) throws Exception {
        return readDB(condition, null);
    }

    public ArrayList<Weapon> readDB() throws Exception {
        return readDB(null);
    }
}

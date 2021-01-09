package SearchTable;

import ConnectDatabase.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOWand {

    MyConnectUnit connect;

    public ArrayList<Weapon> readDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new MyConnectUnit("SearchTableDB");

        ResultSet result = this.connect.Select("tblwand", condition, orderBy);
        ArrayList<Weapon> wands = new ArrayList<>();
        while (result.next()) {
            Weapon wand = new DTOWand(
                    Integer.parseInt(result.getString("energy")),
                    result.getString("element"));
            wand.setiId(Integer.parseInt(result.getString("id")));
            wand.setStrName(result.getString("name"));
            wand.setiDamage(Integer.parseInt(result.getString("damage")));
            wand.setiRange(Integer.parseInt(result.getString("range")));
            wand.setStrImage(result.getString("image"));
            wands.add(wand);
        }
        connect.Close();
        return wands;
    }

    public ArrayList<Weapon> readDB(String condition) throws Exception {
        return readDB(condition, null);
    }

    public ArrayList<Weapon> readDB() throws Exception {
        return readDB(null);
    }

}

package SearchTable;

import ConnectDatabase.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

    MyConnectUnit connect;

    public ArrayList<Weapon> readDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new MyConnectUnit("SearchTableDB");

        ResultSet result = this.connect.Select("tblwand", condition, orderBy);
        ArrayList<Weapon> weapons = new ArrayList<>();
        while (result.next()) {
            Weapon wand = new DTOWand(
                    Integer.parseInt(result.getString("energy")),
                    result.getString("element"));
            wand.setiId(Integer.parseInt(result.getString("id")));
            wand.setStrName(result.getString("name"));
            wand.setiDamage(Integer.parseInt(result.getString("damage")));
            wand.setiRange(Integer.parseInt(result.getString("range")));
            wand.setStrImage(result.getString("image"));
            weapons.add(wand);
        }
        
        result = this.connect.Select("tblsword", condition, orderBy);
        while (result.next()) {
            Weapon sword = new DTOSword(
                    Integer.parseInt(result.getString("sharpness")));
            sword.setiId(Integer.parseInt(result.getString("id")));
            sword.setStrName(result.getString("name"));
            sword.setiDamage(Integer.parseInt(result.getString("damage")));
            sword.setiRange(Integer.parseInt(result.getString("range")));
            sword.setStrImage(result.getString("image"));
            weapons.add(sword);
        }
        
        connect.Close();
        return weapons;
    }

    public ArrayList<Weapon> readDB(String condition) throws Exception {
        return readDB(condition, null);
    }

    public ArrayList<Weapon> readDB() throws Exception {
        return readDB(null);
    }
}

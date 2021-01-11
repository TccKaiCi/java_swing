package DisplayItem;

public abstract class Weapon {

    private int iId;
    private String strName;
    private int iRange;
    private int iDamage;
    private String strImage;

    public abstract int dealDamage();
    public abstract void display();

    public Weapon() {
    }

    public Weapon(int iId, String strName, int iRange, int iDamage, String strImage) {
        this.iId = iId;
        this.strName = strName;
        this.iRange = iRange;
        this.iDamage = iDamage;
        this.strImage = strImage;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public int getiRange() {
        return iRange;
    }

    public void setiRange(int iRange) {
        this.iRange = iRange;
    }

    public int getiDamage() {
        return iDamage;
    }

    public void setiDamage(int iDamage) {
        this.iDamage = iDamage;
    }

    public String getStrImage() {
        return strImage;
    }

    public void setStrImage(String strImage) {
        this.strImage = strImage;
    }

    @Override
    public String toString() {
        return "Weopon{" + "iId=" + iId + ", strName=" + strName + ", iRange=" + iRange + ", iDamage=" + iDamage + ", strImage=" + strImage + '}';
    }

    public static int nameInc(Weapon a, Weapon b){
        return a.getStrName().compareTo(b.getStrName());
    }
    public static int nameDesc(Weapon a, Weapon b){
        return b.getStrName().compareTo(a.getStrName());
    }
}

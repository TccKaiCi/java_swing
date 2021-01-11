package DisplayItem;

public class DTOSword extends Weapon {

    private int iSharpness;

    public DTOSword() {
    }

    public DTOSword(int iSharpness) {
        this.iSharpness = iSharpness;
    }
    

    public DTOSword(int iSharpness, int iId, String strName, int iRange, int iDamage, String strImage) {
        super(iId, strName, iRange, iDamage, strImage);
        this.iSharpness = iSharpness;
    }
    
    @Override
    public int dealDamage() {
        return iSharpness * super.getiDamage() / super.getiRange();
    }

    @Override
    public void display() {
        System.out.println(super.toString() + this.toString());
    }

    @Override
    public String toString() {
        return "DTOSword{" + "iSharpness=" + iSharpness + '}';
    }

    public int getiSharpness() {
        return iSharpness;
    }

    public void setiSharpness(int iSharpness) {
        this.iSharpness = iSharpness;
    }
    
}

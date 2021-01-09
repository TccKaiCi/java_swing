package SearchTable;

public class DTOWand extends Weapon {

    private int iEnergy;
    private String strElement;

    public DTOWand() {
    }

    public DTOWand(int iEnergy, String strElement) {
        this.iEnergy = iEnergy;
        this.strElement = strElement;
    }
    
    @Override
    public int dealDamage() {
        if (iEnergy <= 0) {
            return 0;
        }
        if (strElement.equalsIgnoreCase("Fire") == true) {
            return 5 * super.getiDamage() / super.getiRange();
        } else if (strElement.equalsIgnoreCase("Water") == true) {
            return 3 * super.getiDamage() / super.getiRange();
        } else {
            return 1 * super.getiDamage() / super.getiRange();
        }

    }

    public DTOWand(int iEnergy, String strElement, int iId, String strName, int iRange, int iDamage, String strImage) {
        super(iId, strName,iRange, iDamage, strImage);
        this.iEnergy = iEnergy;
        this.strElement = strElement;
    }

    @Override
    public void display() {
        System.out.println(super.toString() + this.toString());
    }

    @Override
    public String toString() {
        return "DTOWand{" + "iEnergy=" + iEnergy + ", strElement=" + strElement + '}';
    }

    public int getiEnergy() {
        return iEnergy;
    }

    public void setiEnergy(int iEnergy) {
        this.iEnergy = iEnergy;
    }

    public String getStrElement() {
        return strElement;
    }

    public void setStrElement(String strElement) {
        this.strElement = strElement;
    }
    
    
}

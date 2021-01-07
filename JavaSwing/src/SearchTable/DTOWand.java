package SearchTable;

public class DTOWand extends Weopon {

    private int iEnergy;
    private String strElement;

    public DTOWand() {
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

    public DTOWand(int iEnergy, String strElement, int iId, String strName, int iPrice, String strInfor, int iRange, int iDamage, String strImage, boolean blReq2Hand) {
        super(iId, strName, iPrice, strInfor, iRange, iDamage, strImage, blReq2Hand);
        this.iEnergy = iEnergy;
        this.strElement = strElement;
    }

}

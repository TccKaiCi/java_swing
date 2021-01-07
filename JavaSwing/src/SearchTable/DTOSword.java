package SearchTable;

public class DTOSword extends Weopon {

    private int iSharpness;

    public DTOSword() {
    }

    public DTOSword(int iSharpness, int iId, String strName, int iPrice, String strInfor, int iRange, int iDamage, String strImage, boolean blReq2Hand) {
        super(iId, strName, iPrice, strInfor, iRange, iDamage, strImage, blReq2Hand);
        this.iSharpness = iSharpness;
    }
    
    @Override
    public int dealDamage() {
        return iSharpness * super.getiDamage() / super.getiRange();
    }

}

package SearchTable;

public abstract class Weopon {

    private int iId;
    private String strName;
    private int iPrice;
    private String strInfor;
    private int iRange;
    private int iDamage;
    private String strImage;
    private boolean blReq2Hand;

    public abstract int dealDamage();

    public Weopon() {
    }

    public Weopon(int iId, String strName, int iPrice, String strInfor, int iRange, int iDamage, String strImage, boolean blReq2Hand) {
        this.iId = iId;
        this.strName = strName;
        this.iPrice = iPrice;
        this.strInfor = strInfor;
        this.iRange = iRange;
        this.iDamage = iDamage;
        this.strImage = strImage;
        this.blReq2Hand = blReq2Hand;
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

    public int getiPrice() {
        return iPrice;
    }

    public void setiPrice(int iPrice) {
        this.iPrice = iPrice;
    }

    public String getStrInfor() {
        return strInfor;
    }

    public void setStrInfor(String strInfor) {
        this.strInfor = strInfor;
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

    public boolean isBlReq2Hand() {
        return blReq2Hand;
    }

    public void setBlReq2Hand(boolean blReq2Hand) {
        this.blReq2Hand = blReq2Hand;
    }

    @Override
    public String toString() {
        return "Weopon{" + "iId=" + iId + ", strName=" + strName + ", iPrice=" + iPrice + ", strInfor=" + strInfor + ", iRange=" + iRange + ", iDamage=" + iDamage + ", strImage=" + strImage + ", blReq2Hand=" + blReq2Hand + '}';
    }

}

package SearchTable;

public class DTOSword extends Weopon {

    private int iSharpness;

    @Override
    public int dealDamage() {
        return iSharpness * super.getiDamage() / super.getiRange();
    }

}

package noulis;

public class Security extends Buildings {
    private boolean IsBuildingSecurityProtected;

    public Security(String name) { super.setName(name);
    IsBuildingSecurityProtected = true; }

    public boolean isBuildingSecurityProtected() { return IsBuildingSecurityProtected; }

    public void setBuildingSecurityProtected(boolean buldingSecurityProtected) { IsBuildingSecurityProtected = buldingSecurityProtected; }

    public String toString() {
        return super.toString();
    }

}

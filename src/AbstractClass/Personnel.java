package AbstractClass;

public abstract class Personnel {

    static final String companyName="Eren Holding";
    static final String companyAddress="Istanbul / TURKEY";

    protected String name="Değer girilmemiş";
    protected String lastName="Değer girilmemiş";
    protected String identityNo="Değer girilmemiş";
    protected String phoneNo="Değer girilmemiş";
    protected String toStartWorkingDate="Değer girilmemiş";
    protected String insuranceNo="Değer girilmemiş";
    static int personnelCounter=1000;

    protected String personelNo;

    protected String personelNo(){
        personnelCounter++;
        String no=personnelCounter+"";
        return no;
    }

}

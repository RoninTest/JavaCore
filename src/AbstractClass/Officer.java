package AbstractClass;

public class Officer extends Accounting {
    @Override
    protected int hourlyWage() {
        return 15;
    }

    @Override
    protected int montlyWorkingTime() {
        return 200;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "hourlyWage=" + hourlyWage +
                ", montlyWorkingHours=" + montlyWorkingHours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityNo='" + identityNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", toStartWorkingDate='" + toStartWorkingDate + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Officer officer1=new Officer();
        officer1.hourlyWage=officer1.hourlyWage();
        officer1.montlyWorkingHours=officer1.montlyWorkingTime();
        officer1.salary= officer1.salary(officer1.hourlyWage, officer1.montlyWorkingHours);
        officer1.name="Alieren";
        officer1.lastName="Dasdemir";
        System.out.println(officer1);
    }
}

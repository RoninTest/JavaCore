package AbstractClass;

public class Worker extends Accounting{
    @Override
    protected int hourlyWage() {
        return 10;
    }

    @Override
    protected int montlyWorkingTime() {
        return 200;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "company name= " + companyName+
                "company address= " +  companyAddress+
                "hourlyWage= " + hourlyWage +
                ", montlyWorkingHours= " + montlyWorkingHours +
                ", salary= " + salary +
                ", name='" + name + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", identityNo=' " + identityNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", toStartWorkingDate=' " + toStartWorkingDate + '\'' +
                ", insuranceNo=' " + insuranceNo + '\'' +
                ", personelNo=' " + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.hourlyWage=worker.hourlyWage();
        worker.montlyWorkingHours=worker.montlyWorkingTime();
        worker.salary= worker.salary(worker.hourlyWage, worker.montlyWorkingHours);
        worker.name="Alieren";
        worker.lastName="Dasdemir";
        System.out.println(worker);

    }
}

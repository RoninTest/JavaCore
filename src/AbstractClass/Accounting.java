package AbstractClass;

public abstract class Accounting extends Personnel {

    protected int hourlyWage; //obj.
    protected int montlyWorkingHours; //obj.
    protected int salary; //obj.

    protected abstract int hourlyWage();  //It can change according to that class so ıt is abstract.
    protected abstract int montlyWorkingTime(); //It can change according to that class so ıt is abstract.

    protected int salary(int hourlyWage,int montlyWorkingHours){  // It's same method in all.
        int salary=hourlyWage*montlyWorkingHours;
        System.out.println("Worker Salary : " + salary);
        return salary;
    }
}

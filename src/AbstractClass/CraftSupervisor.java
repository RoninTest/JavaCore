package AbstractClass;

public class CraftSupervisor extends Worker {

    @Override
    protected int hourlyWage() {
      //  return super.hourlyWage(); // bir değer vermezsen parentakini döner.
        return 20;
    }

    @Override
    protected int montlyWorkingTime() {
      //  return super.montlyWorkingTime(); // bir değer vermezsen parentakini döner.
        return 200;
    }

    public static void main(String[] args) {
        CraftSupervisor craftSupervisor=new CraftSupervisor();

    }
}

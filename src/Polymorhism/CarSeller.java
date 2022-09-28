package Polymorhism;

public class CarSeller {
    public static void main(String[] args) {

        CarSeller obj1=new CarSeller();
        obj1.fuel();
        obj1.fuel(2020);
        obj1.fuel(4.5);

        Toyota obj2=new Toyota();
        obj2.fuel();

        Toyota obj3=new ToyotaGasoline();
        obj3.fuel();
        Toyota obj4=new ToyotaDiesel();
        obj4.fuel();
        Toyota obj5=new ToyotaElectrical();
        obj5.fuel();

    }


    public void motor(){
        System.out.println("There are 1.2 - 1.4 - 1.6 Toyota Vehicles");
    }

    public void fuel(){
        System.out.println("There are fuel - electrical - diesel Toyota Vehicles.");
    }

    public void fuel(double maxConsumption){
        System.out.println(maxConsumption + "lt consumption");

    }
    public void fuel(int year){
        System.out.println("What do you want model year = "+year+" we can");
    }
    public void fuel(int year,double maxConsumpiton){

    }
}

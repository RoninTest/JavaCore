package Polymorhism;

public class ToyotaGasoline extends Toyota{
    public void motor (){
        System.out.println("Gasoline Toyotoa vehicles have 1.4 motor capacity.");
    }
    public void fuel () {
        System.out.println("Gasoline Toyota vehicles have E10 standarts");
    }
    public void fuel (double maxTuketim) {
        System.out.println("Gasoline Toyota vehicles consume 1.6 in average.");

        if (maxTuketim <1.6 ){
            System.out.println("You can buy a gasoline Toyota.");
        }else{
            System.out.println("You can not find a Toyota car.");
        }
    }
}

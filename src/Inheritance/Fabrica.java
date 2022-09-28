package Inheritance;

class Personel{
    public String name;
    protected String surname;
    protected  String address;
}

class AccountDepertment extends Personel{

    protected int saatUcreti;
    protected String statu;
    protected int maas;

    public void setSaatUcreti(int saatUcreti) {
        this.saatUcreti = saatUcreti;
    }

    public int getMaas() {
        int maas =saatUcreti*8*30;
        return maas;
    }

    protected int maasHesapla(){

        return maas;
    }


}

class Worker extends AccountDepertment{

}



public class Fabrica {
    public static void main(String[] args) {

        Worker worker1=new Worker();
        worker1.name="Alieren";
        worker1.surname="Dasdemir";
        worker1.address="Maltepe";
        worker1.statu="Tester";
        worker1.setSaatUcreti(500);
        System.out.println(worker1.getMaas());




    }
}

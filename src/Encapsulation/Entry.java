package Encapsulation;

import com.company.Main;

import java.util.Scanner;

class Urun_Miktari{

    public int Cola_Miktarı;
    public int Ayakkabı_Miktarı;

    public int setCola_Miktarı(int cola_Miktarı) {  //int yerine void vardı.
        this.Cola_Miktarı = cola_Miktarı;
        return Cola_Miktarı;
    }

    public int setAyakkabı_Miktarı(int ayakkabı_Miktarı) {
        this.Ayakkabı_Miktarı = ayakkabı_Miktarı;
        return Ayakkabı_Miktarı;
    }
}

class Rapor  {

    Urun_Miktari urun_miktari=new Urun_Miktari();
    /*------------------------
    It's here. I wanted to get the urun_miktari.Cola.Miktari ???? but I couldn't it
    ------------------------*/



    private int satisTutari;
    private int satisToplami;

    public int getSatisTutari() {

        return satisTutari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari * urun_miktari.Cola_Miktarı;
    }

    public int getSatisToplami() {
        return satisToplami;
    }

    public void setSatisToplami(int satisToplami) {
        this.satisToplami = satisToplami;
    }
}


public class Entry   {
    public static void main(String[] args) {

        Urun_Miktari urun_miktari=new Urun_Miktari();
        System.out.println("Guncel Kola Miktarini giriniz : ");
        int cole_Miktari=new Scanner(System.in).nextInt();
        System.out.println("Guncel Ayakkabı Miktarını giriniz : ");
        int ayyakkabi_Miktari=new Scanner(System.in).nextInt();

        urun_miktari.setCola_Miktarı(cole_Miktari);
        urun_miktari.setAyakkabı_Miktarı(ayyakkabi_Miktari);

        Rapor rapor=new Rapor();
        rapor.setSatisTutari(100);
        System.out.println(rapor.getSatisTutari());


    }


}

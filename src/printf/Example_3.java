package printf;

public class Example_3 {
    public static void main(String[] args) {


        String product[]={"Domates","biber","patlican","elma","biber"};
        double brCost[]={2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};

        System.out.println(" Urun " +" "+ "  miktar " +" "+" br_fiyat " +" "+ "urun_top ");

        for (int i=1;i<13;i++){
            System.out.print("===");
        }
        System.out.print("\n");

        for (int i=0;i<product.length;i++){
            System.out.printf("%-8s  %05.2fkg $%05.2f $%05.2f\n",product[i],miktar[i],brCost[i],miktar[i]*brCost[i]);
        }

        for (int i=1;i<13;i++){
            System.out.print("===");
        }

        double toplamUrunMiktari=0;
        for (int i = 0; i < miktar.length; i++) {
            toplamUrunMiktari+=miktar[i];
        }

        double toplamOdenecekMiktar=0;
        for (int i = 0; i < miktar.length; i++) {
            toplamOdenecekMiktar+=miktar[i]*brCost[i];
        }
        System.out.print("\n");
        System.out.printf("GenelToplam:%2.1fkg   %10.2f$",toplamUrunMiktari,toplamOdenecekMiktar);
    }
}

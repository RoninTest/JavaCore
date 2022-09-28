package Arrays;
//Data Type
//Çoklu eleman store edebileceğimiz data türü
//First in, first out
//Hangi tür
//İçine kaç tane elemean koyacağzı. Declare şart
//Default değerler sayisal datalar "0", boolean false, char "" , Stirng null
// Bir uzunluk belirlersen o kalıcıdır.
//Bir arrayi elemanaına ulaaşmak ve update etmek iiçin index kullanılır.
// Stack ve Hype Memory . Non primitivler direk ysazdırılamazlar objedirler.
// Non primiti data türleri Hype memory'de tutulutor referansları da Stack Memory'de olur.

import java.util.Arrays;

public class Entry {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2[]={5,6,8,10};
        int sayi5[]=new int[4];

        System.out.println(sayi2);
        System.out.println(Arrays.toString(sayi5));
        System.out.println((sayi2[2]));

        //Arry String'e çevirmek
        String str="JAVA";
        String[] kelimeler=str.split("");

        System.out.println(Arrays.toString(kelimeler));
        System.out.println(Arrays.toString(new String[]{kelimeler[2]}));


    }
}

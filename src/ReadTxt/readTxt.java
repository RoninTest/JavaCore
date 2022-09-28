package ReadTxt;

import java.awt.event.KeyAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readTxt {
    public static void main(String[] args) throws IOException {

        //Listede kac baslik ve bu basliklar altinda kac urun olduğunu bulalim.
        String path="src/ReadTxt/product.txt";
        FileInputStream fis=new FileInputStream(path); //It needs declaraiton.
        fis.read();

        int control=0;
        String metin="";
        while ((control= fis.read()) != -1){
            metin+=(char)control;
        }
        System.out.println(metin);

        int productNumber=0;
        String arr[]=metin.split("-");
        System.out.println("Product count : " + (arr.length - 1));


        int baslikSayisi=0;
        for (int i=0;i<metin.length();i++){
            char karakter=metin.charAt(i);
            if (i==0){
                if (Character.isDigit(karakter)){
                    baslikSayisi++;
                }
            }else{
                char oncekiKarakter=metin.charAt(i-1);
                if (Character.isDigit(karakter) && (!Character.isDigit(oncekiKarakter))){
                    baslikSayisi++;
                }
            }
        }
        System.out.println("Baslik sayisi : " + baslikSayisi);
    }
}

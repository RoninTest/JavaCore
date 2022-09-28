package DataCasting;

public class WrapperClass {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.toUpperCase());


        Integer number=30;
        System.out.println(Integer.MAX_VALUE);

        char charcP='a';
        Character charcW='b';

        System.out.println(Character.isDigit(charcP)); //false
        System.out.println(Character.isLowerCase(charcW)); //true

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3);

        System.out.println(Integer.valueOf(str2)+Integer.valueOf(str3));

        System.out.println("*****************************");

        int sayi=10;
        Integer sayiW=20;
        System.out.println(Integer.max(sayi, sayiW));

        boolean control=true;
        Boolean cont=false;
        String cnt="false";
        boolean result=Boolean.valueOf(cnt);
        System.out.println(result);

        System.out.println("*****************************");

        int number1=10;

        int c=number1++;
        System.out.println(c);
        System.out.println(number1);

        System.out.println("*****************************");

        int number2=10;

        ++number2;
        System.out.println(number2);
        number2++;
        System.out.println(number2);
        int f=number2++ + 1;
        System.out.println(number2);
        System.out.println(f);


    }
}

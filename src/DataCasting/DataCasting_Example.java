package DataCasting;

import java.util.Scanner;

public class DataCasting_Example {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a char");
        char charachter=scanner.next().charAt(0);

        System.out.println("Charachter : " + charachter);
        System.out.println("Charachter : " + (charachter+1));
        System.out.println("Charachter : " + (char)(charachter+1));





    }
}

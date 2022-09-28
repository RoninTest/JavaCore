package CreatMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnMethod {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter name : ");
        String name = scanner.next();
        System.out.println("Enter surname : ");
        String surname=scanner.next();

        String nameSurname=nameEdit(name,surname);
        System.out.println(nameSurname);
    }

    private static String nameEdit(String name,String surname) {

        String nameEdited=name.substring(0,1).toUpperCase() +name.substring(1).toLowerCase();
        String surnameEdited=surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();

        return nameEdited +" "+surnameEdited;
    }


}

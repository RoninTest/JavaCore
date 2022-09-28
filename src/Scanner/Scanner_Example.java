package Scanner;

import java.util.Scanner;

public class Scanner_Example {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name= String.valueOf(scanner.nextLine().charAt(0));
        System.out.println("Enter your surname :");
        String surname=scanner.nextLine();
        System.out.println("Enter your age : ");
        int nameAge=scanner.nextInt();

        System.out.println(name+" "+surname+" , "+nameAge);

    }
}

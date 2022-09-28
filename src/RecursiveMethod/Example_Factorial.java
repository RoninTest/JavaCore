package RecursiveMethod;

public class Example_Factorial {
    public static void main(String[] args) {

        int input=5;
        int result=faktorial(input);
        System.out.println(result);
    }

    private static int faktorial(int input) {

        if (input ==1){
            System.out.println(input);
            return 1;
        }else {
            System.out.println(input);
            return input*faktorial(input-1);
        }
    }
}

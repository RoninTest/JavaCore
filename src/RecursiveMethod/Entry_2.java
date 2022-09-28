package RecursiveMethod;

public class Entry_2 {
    public static void main(String[] args) {

        int input =5;
        int result= toplam(input);
        System.out.println(result);

    }

    private static int toplam(int input) {

        if (input==1){
            return 1;
        }else {
            return input+toplam(input-1);
            //topla(5+topla(4+topla(3+topla(2+topla(1))))))
        }

    }
}

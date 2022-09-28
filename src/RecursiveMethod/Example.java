package RecursiveMethod;

public class Example {
    public static void main(String[] args) {

        String input="ey edip adanada pide ye";
        boolean result=palindromeKontrolEt(input);

        System.out.println(input.substring(0,1) + "\n"+input.substring(input.length()-1) + "\n"+ input.substring(1,(input.length()-1)) );

        //System.out.println(result);


        
    }

    private static boolean palindromeKontrolEt(String input) {
        if (input.length()==0 || input.length()==1){
            return true;
        }else {
            if (input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1))){
                return palindromeKontrolEt(input.substring(1,(input.length()-1)));
            }else {
                return false;
            }
        }

    }


}

package RecursiveMethod;

public class Entry {
    public static void main(String[] args) {

        Recrusion recrusion=new Recrusion();
        System.out.println(recrusion.sonuc);

    }

    public static class Recrusion{

        int input=5;
        int sonuc = topla(input);

        private int topla(int input) {
            int sonuc=0;
            for (int i =0; i<=input ; i++) {
                sonuc=sonuc + i;
            }
            return sonuc;

        }

    }
}


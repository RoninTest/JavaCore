package printf;

public class Entry {
    public static void main(String[] args) {


        int number=123;  //digitlerde sıfırlama olmaz.
        String str="Alieren Daşdemir";
        double dob=1.025030456;  // %.3f  %4.f (uzunluk "." dahil.)

        // %-10x or %10x --> sağa veya sola dayalı.
        // %.10x --> uzunluk
        // %s %S --> Buyuk küçük harf


        System.out.printf("number : %10d , str : %-10.10S, dou : %.3f",number,str,dob);



    }
}

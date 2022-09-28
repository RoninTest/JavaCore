package Inheritance;



public class Entry {
    public static void main(String[] args) {

    }

    public class BaseClass{
        protected static int sayi=10;  //static'lerin hepsine ulaşabiliriz.

        protected String str="Ali";

        protected static void method1(){ //staticlere doğrudan oluşabiliriz.

        }

        protected void method2(){

        }
    }

    public class ChildOfBaseClass1 extends BaseClass{
        public void main(String[] args) {
            sayi=20;
            method1();

            ChildOfBaseClass1 obj=new ChildOfBaseClass1(); //Child class'tan Parent'ın bilgilerine ulaştık.
            obj.str="Can";
            obj.method2();
        }


    }

}



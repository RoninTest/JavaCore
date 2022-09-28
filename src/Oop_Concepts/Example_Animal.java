package Oop_Concepts;

public class Example_Animal {

    public static void main(String[] args) {

        Fish fish=new Fish();
        fish.BreatheInSea();
        fish.Run();
//Sor ben extend aldığım tüm methodlarını implement etmek zorundamyım.
        //Eğer zorundaysamda kullanmak istemediklerimi hangi Access Modifer ile Parent class'ta belirtmeliyim.

    }
}

   abstract class Animal{

               abstract void Run();
               abstract void Fly();
               abstract void Feed();
               void BreatheInSea(){
                    System.out.println("Animal/BreatheInSea");
                }
    }

    class Fish extends Animal{


        @Override
        void Run() {

        }

        @Override
        void Fly() {

        }

        @Override
        void Feed() {

        }

        @Override
        void BreatheInSea() {
            System.out.println("Fish/BreatheInSea");
        }
    }



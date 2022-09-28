package Polymorhism;

public class ToyotaDiesel extends Toyota {

    public void motor(){
        System.out.println("Toyota : 1.4 - 1.6");
    }

    public void fuel(){
        System.out.println("Toyota : EuroDiesel");
    }

    public void fuel(String color){
        System.out.println("Toyota Diesel Vehicles have 3 color.");
        if (color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("Blue")) {

            System.out.println("Yes, you can choose a vehicle which being white-blue-black");
        }  else {
            System.out.println("I'm sorry, I won't help you.");
        }
    }
}

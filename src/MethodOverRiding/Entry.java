package MethodOverRiding;


class Animal{

    protected boolean canSee=true;

    protected void breeding(){
        System.out.println("All Animals reproduce");
    }

    protected void nutrition(){
        System.out.println("All animals feed");
    }
    protected void act(){
        System.out.println("All animals act");
    }
    protected void respiration(){
        System.out.println("All animals breath");
    }

}

class Birds extends Animal{
    protected boolean haveAbeak=true;
    protected boolean haveAwing=true;

    protected void breeding(){
        System.out.println("Kuslar yumurta ile çoğalır");
    }
    protected void respiration(){
        System.out.println("Kuslar akciger solunumu yapar");
    }


}

class Fowl extends Birds{
    protected void act(){
        System.out.println("Kumes Kuslari Ucamazlar,yururler");
    }
}

public class Entry {
    public static void main(String[] args) {

        Animal bird1=new Birds(); //kus hayvanların özelliğini alır kusların alamaz
        System.out.println(bird1.canSee);
        System.out.println(((Birds) bird1).haveAbeak);
        bird1.breeding(); // en guncel override edilen methodu çalıştırır.
        Birds bird3=new Birds();
        bird3.breeding();
        Fowl fowl1=new Fowl();
        fowl1.breeding();
        fowl1.act();
        Animal fowl2=new Animal();
        fowl2.breeding();






    }
}

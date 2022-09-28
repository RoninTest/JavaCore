package School_Project;

import java.util.Scanner;

public class Storage {

    static Scanner scanner=new Scanner(System.in);


    public static void mainMenu() throws InterruptedException {

        String tercih="";

        do {
            System.out.println("========X KOLEJ =======" +
                    "\n"+"========MAIN MENU======" +"\n"+
                    "1 - Okul Bilgileri Görüntüle" +"\n"+
                    "2 - Ogretmen Menu" +"\n"+
                    "3 - Ogrenci Menu" +"\n"+
                    "Q - EXIT");
            System.out.println("Lutfen menuden tercih yapiniz : ");
            tercih=scanner.nextLine();

            switch (tercih){
                case "1" :
                Storage.schoolInfoWrite();
                    break;
                case "2":
                    Teacher.teacherMenu();
                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen geçerli bir tercih giriniz.");
            }
        }
        while (!tercih.equalsIgnoreCase("Q"));
        Storage.stopProject();
    }

    public static void schoolInfoWrite() throws InterruptedException {
        System.out.println("School Name : "+School.schoolName+"\n"+
                "School Adsress : "+School.schoolAddress+"\n"+
                "School Phone : " +School.schoolPhone);
        Thread.sleep(1000);
    }

    public static void stopProject() {
        System.out.println("Okul projesinden çıkışı seçtiniz");
    }
}

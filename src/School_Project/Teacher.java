package School_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {
    static Scanner scan=new Scanner(System.in);
    static Map<String , String> teacherMap=new HashMap<>();

    public static void feykTeacherAdd(){
        teacherMap.put("1231231","Ali, Can, 1980, Math");
        teacherMap.put("1231232","Veli, Kan, 1980, Chemistry");
        teacherMap.put("1231233","Osman, Man, 1982, Math");
        teacherMap.put("1231234","Ahmet, San, 1981, Math-1");
        teacherMap.put("1231235","Alp, Tan, 1980, Math-2");
    }

    public static void teacherMenu() throws InterruptedException {
        String tercih="";
        do {

            System.out.println("========X KOLEJ =======" +
                    "\n"+"========TEACHER MENU======" +"\n"+
                    "1 - Ogretmenleri yazdir" +"\n"+
                    "2 - Soyisimden ogretmen bul" +"\n"+
                    "3 - Branstan Ogretmen bul" +"\n"+
                    "4 - Bilgileri girerek Ogretmen Ekleme" +"\n"+
                    "5 - Kimlik No ile kayit silme" +"\n"+
                    "A - MAIN MENU" +"\n"+
                    "Q - EXIT");
            System.out.println("Lutfen menuden tercih yapiniz : ");
            tercih= scan.nextLine();

            switch (tercih){
                case "1" :
                    teacherListWrite();
                    break;
                case "2" :
                    findAtSurname();
                    break;
                case "3" :
                    findAtBranch();
                    break;
                case "4" :
                    teacherAdd();
                    break;
                case "5" :
                    System.out.println("Silinecek öğretmen kimlink no:");
                    String silinecekOgretmen= scan.nextLine();
                    String silinecekValue=teacherMap.get(silinecekOgretmen);
                    String sonucValue=teacherMap.remove(silinecekOgretmen);
                    if (sonucValue.equalsIgnoreCase(silinecekValue)) {
                        System.out.println("Istenen ogretmen silindi");
                    }else {
                        System.out.println("Istenilen ogretmen bulunamadı");
                    }
                    break;
                case "A" :
                case "a":
                    Thread.sleep(2000);
                    Storage.mainMenu();
                    break;
                case "q":
                case"Q":
                    break;
                default:
                    System.out.println("Lutfen geçerli bir tercih giriniz");

            }

        }while(!tercih.equalsIgnoreCase("Q")); //q 'ya eşit olmadığı müddetçe çalış çıkma.
        Storage.stopProject();
    }



    public static void teacherAdd() {
        System.out.println("Tc No : ");
        String tcNo=scan.nextLine();
        System.out.println("isim : ");
        String name=scan.nextLine();
        System.out.println("Soyisim No : ");
        String surname=scan.nextLine();
        System.out.println("Dogum Yili : ");
        String birthDay=scan.nextLine();
        System.out.println("Branch : ");
        String branch=scan.nextLine();

        String addedValue= name + ", "+surname+", "+birthDay+", "+branch;
        teacherMap.put(tcNo,addedValue);

    }

    public static void findAtBranch() throws InterruptedException {
        System.out.println("Ogretmenin branch giriniz : ");
        String istenenBranch=scan.nextLine();

        Set<Map.Entry<String,String>> teacherEntrySet=teacherMap.entrySet();
        System.out.println("====== Teacher Surname======" +"\n"+
                "TcNo    Isım   Soyisim   D.Yili   Brans");
        for (Map.Entry<String,String> each: teacherEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValueArr[]=eachValue.split(", ");
            if(istenenBranch.equalsIgnoreCase(eachValueArr[3])){
                System.out.printf("%11s %-6s %-8s %4s %s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }
        }
        Thread.sleep(2000);
    }

    public static void findAtSurname() throws InterruptedException {
        System.out.println("Ogretmenin soyismi giriniz : ");
        String istenenSurname=scan.nextLine();

        Set<Map.Entry<String,String>> teacherEntrySet=teacherMap.entrySet();
        System.out.println("====== Teacher Surname======" +"\n"+
                "TcNo    Isım   Soyisim   D.Yili   Brans");
        for (Map.Entry<String,String> each: teacherEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValueArr[]=eachValue.split(", ");
            if(istenenSurname.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%11s %-6s %-8s %4s %s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }
        }
        Thread.sleep(2000);
    }


    public static void teacherListWrite() throws InterruptedException {

        Set<Map.Entry<String,String>> teacherEntrySet=teacherMap.entrySet();
        System.out.println("====== Teacher List======" +"\n"+
                "TcNo    Isım   Soyisim   D.Yili   Brans");
        for (Map.Entry<String,String> each: teacherEntrySet
             ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValueArr[]=eachValue.split(", ");
            System.out.printf("%11s %-6s %-8s %4s %s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
        }
        Thread.sleep(2000);
    }
}

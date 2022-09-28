package Constructor;


import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {

        Scanner id =new Scanner(System.in);
        System.out.println("Type id  : ");
        int id1= id.nextInt();

        Scanner name =new Scanner(System.in);
        System.out.println("Type name  : ");
        String name1= name.next();

        Scanner branch =new Scanner(System.in);
        System.out.println("Type branch  : ");
        String branch1= branch.next();

          CreateTeacher teacher=new CreateTeacher(id1,name1,branch1);
            teacher.setId(5);
             System.out.println(teacher.getId());

    }

   public static class CreateTeacher{

        int id;
        String name;
        String branch;

        private CreateTeacher(int id,String name,String branch){
            this.id=id;
            this.name=name;
            this.branch=branch;

            System.out.println("Teacher id : "+  id + "\n" + "Teacher name : "  +name +"\n"+ "Teacher branch : " +branch);
        }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getBranch() {
           return branch;
       }

       public void setBranch(String branch) {
           this.branch = branch;
       }
   }


}

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    public static void main(String[] args) {

        /*
        int [] arr={3,4,5,6};

        int [] yeniArr=new int[arr.length+1];

        for (int i=0 ; i < arr.length; i++){
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=7;
        arr=yeniArr;

        System.out.println(arr[4]);

         */

        List<String> isimler=new ArrayList<>();
        isimler.add("Eren");
        isimler.add("Dasdemir");
        isimler.add(0,"Mustafa");


        System.out.println(isimler);
        System.out.println(isimler.size());
        System.out.println(isimler.contains(2));


        /*arrey'i arrey liste çevirmek. */
        String [] arrnames={"ali","muge","mustafa","zeynep","okan"};

        List<String> names=new ArrayList<>();
        for (String each:arrnames){
            names.add(each);
        }
        System.out.println(names);



    }
}

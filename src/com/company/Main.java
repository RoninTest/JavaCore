package com.company;

public class Main {

    public static void main(String[] args) {

        int bas=20;
        int bitis=61;

        for (int i=bas; i<bitis;i+=3){
            System.out.print(i+" ");
        }

        System.out.println(" ");

        int intput=100;
        for(int i=intput; i>1;i--){
            if(i%3==0){
                System.out.print(i + " ");
            }
        }
    }


}

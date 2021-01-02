package com.wencelmichael;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ar [] = {1,2,3,4,5};
        reverse(ar);
    }

    private static void reverse(int ar[]){
        String arrStr ="";
        for(int i = 0; i< ar.length;i++){
            System.out.print(ar[i] +" ");
            arrStr = "Array = [" + ar[i] + " ";
        }
        System.out.println(arrStr);
        System.out.println("");
        System.out.print("Reversed array = ");
        int [] temp = new int [ar.length];
        int count = 0;
        for(int i = ar.length - 1; i >= 0 ;i--){
            temp [count] = ar[i];
            count++;
        }

        for(int i = 0; i< temp.length;i++){
            System.out.print(+ temp[i] +" ");
        }

    }
}

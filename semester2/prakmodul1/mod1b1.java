package com.semester2.prakmodul1;
import java.util.Scanner;

public class mod1b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int b;
        System.out.print("Masukkan Bilangan: ");
        b = input.nextInt();
        if(b==1){
            System.out.println("Nilai Variabel b adalah 1");
        } else if(b==2){
            System.out.println("Nilai Variabel b adalah 2");
        } else {
            System.out.println("Nilai variabel tidak sama dengan 1 atau 2.");
        }
    }
}

package com.semester2.prakmodul1;
import java.util.Scanner;

public class tugas1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i, jum, n, x;
        float rata;
        System.out.print ("Banyaknya Deret Angka: ");
        n = input.nextInt();
        System.out.println();
        jum = 0;
        i = 1;
        while(i <= n){
                System.out.print ("Angka ke-" + i + ": ");
                x = input.nextInt ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println("");
        System.out.println ("Jumlah Deret : " + jum);
        System.out.println ("Rata-rata    : " + rata);
   }
}

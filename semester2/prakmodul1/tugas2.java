package com.semester2.prakmodul1;
import java.util.Scanner;

public class tugas2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.print ("Gaji kotor: ");
        x = input.nextInt();
        System.out.println();
        y = (x * 5)/100;
        System.out.println ("Total potongan pajak 5% : Rp"+y);
        z = x -y;
        System.out.println ("Gaji bersih             : Rp"+z);
   }
}

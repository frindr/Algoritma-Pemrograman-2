package com.semester2.prakmodul1;
import java.util.Scanner;

public class mod1a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,tambah,kurang;
        System.out.print("Bilangan Pertama  : ");
        a = input.nextInt();
        System.out.print("Bilangan Kedua    : ");
        b = input.nextInt();
        tambah = a+b;
        kurang = a-b;
        System.out.println();
        System.out.println("Hasil Penjumlahan : "+tambah);
        System.out.println("Hasil Pengurangan : "+kurang);
    }
}
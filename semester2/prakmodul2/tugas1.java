package com.semester2.prakmodul2;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int A[][]=new int[2][3];
        int B[][]=new int[2][3]; //2 baris, 3 kolom (matriks 2x3)
        int C[][]=new int[2][3];
         
        System.out.println("Masukkan Nilai Matriks A");
        System.out.println("=======================");
        for(int i = 0; i < 2; i++){ //mengulang looping kedua ketika telah selesai
            for(int j = 0; j < 3; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "] : ");
                A[i][j]=input.nextInt(); //menerima input array dengan indeksnya
            }
        }
      
        System.out.println("\nMasukkan Nilai Matriks B");
        System.out.println("==========================");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "] : ");
                B[i][j]=input.nextInt();
            }
        }
      
        // Melakukan penjumlahan matriks
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                C[i][j]=A[i][j]+B[i][j]; //penjumlahan biasa array dengan indeksnya
            }
        }
      
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(+(C[i][j])+" ");
            }
            System.out.println(" ");
        } 
    } 
}

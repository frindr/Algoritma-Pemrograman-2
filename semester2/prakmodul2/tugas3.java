package com.semester2.prakmodul2;
import java.util.Scanner;
import java.util.Arrays;

public class tugas3 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data: "); n = input.nextInt();
        int[] data = new int[n];
        for(int a = 0; a < n; a++) {
            System.out.print("Masukkan data ke - " + (a+1) + " : "); data[a] = input.nextInt();
        }
        System.out.println("\nDeret data sebelum sorting: " + Arrays.toString(data));
        System.out.println("\nDivide");
        for(int b = 0; b < data.length; b++){
            System.out.println("Iterasi ke - " + (b+1));
                for(int c = 0; c < data.length; c++){
                    if(c == 0 || c <= b){
                        System.out.print("| " + data[c] + " ");
                    } else {
                        System.out.print(" " + data[c]);
                    }
                    if(c == b){
                        System.out.print("|");
                    }
                }
            System.out.println("\n");
        }
            
        System.out.println("Merge/Combine/Conquer");
        for(int d = 0; d < data.length-1; d++){
            System.out.println("Iterasi ke - " + (d+1));
            for(int e = d + 1; e > 0; e--){
                if(data[e] < data[e-1]){
                    int temp = data[e];
                    data[e] = data[e-1];
                    data[e-1] = temp;
                }
            }
            for(int f = 0; f < data.length; f++){
                if(f <= d + 1){
                    System.out.print(data[f] + " ");
                } else {
                    if (d == data.length-1){
                        System.out.print(data[f]); 
                    } 
                    System.out.print("| " + data[f] + " ");
                    if(f == data.length-1){
                        System.out.print("|");
                    }
                }
                
            }
            System.out.println("\n");
        }
    }
}
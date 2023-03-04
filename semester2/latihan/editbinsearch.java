package com.semester2.latihan;
import java.util.Arrays;

public class editbinsearch {
    public static void main(String[] args) {
        int A [] = {5,2,9,7,1,6,8,3};
        Arrays.sort(A);
        int cari = 5;
        int res = Arrays.binarySearch(A, cari);

        if (res >= 0){
            System.out.println(cari + " ditemukan pada index ke - " + res);
        } else {
            System.out.println(cari + " tidak ditemukan.");
        }    
    }
}
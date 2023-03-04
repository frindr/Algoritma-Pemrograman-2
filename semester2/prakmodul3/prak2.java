package com.semester2.prakmodul3;

public class prak2 {
    public static void main(String[] args) {
        int N = 8;
        int A [] = {5,2,9,7,1,6,8,3};
        int BatasAtas, BatasBawah, Tengah;
        int cari = 3;
        BatasAtas = 0;
        BatasBawah = N - 1;
        Tengah = 0;
        boolean ketemu;
        ketemu = false;

        /*for(int d = 0; d < BatasBawah; d++){
            for(int e = d + 1; e > 0; e--){
                if(A[e] < A[e-1]){
                    int temp = A[e];
                    A[e] = A[e-1];
                    A[e-1] = temp;
                }
            }
        }
        {1,2,3,5,6,7,8,9}*/

        while((BatasAtas <= BatasBawah) && (ketemu == false)){
            Tengah = (BatasAtas + BatasBawah) / 2;
            if (A[Tengah] == cari){
                ketemu = true;
            } else if (A[Tengah] <= cari){
                BatasAtas = Tengah + 1;
            } else {
                BatasBawah = Tengah - 1;
            }
        }
        if (ketemu) {
            System.out.println ("Angka : " + cari + "\nData berada di index nomor " + Tengah);
        } else {
            System.out.println ("Angka : " + cari + "\nData tidak ditemukan");
        }
    }
}

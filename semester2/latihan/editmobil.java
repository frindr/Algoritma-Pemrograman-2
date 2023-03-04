package com.semester2.latihan;
import java.util.Scanner;

public class editmobil {
    
    static void pilihanpertama(String[] jenismobil, long[] hargamobil){
        System.out.println("============================================================");
        System.out.println("                     DAFTAR HARGA MOBIL");
        System.out.println("============================================================");
        System.out.println("NO \t PRODUK \t \t HARGA");
        System.out.println("============================================================");
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-8s %-21s %d", i+1, jenismobil[i], hargamobil[i]));
	    }
    }
        
	static void pilihankedua(String[] jenismobil, long[]hargamobil){
        String cari = "Audi";
        int i;
        boolean ketemu = false;

        for(i = 0; i < jenismobil.length; i++){
            if (jenismobil[i] == cari){
                ketemu = true;
                hargamobil[i] = hargamobil[i];
                break;
            }
        }
        if (ketemu) {
            System.out.println("Jenis Mobil: " + cari + "\nHarga Mobil: " + hargamobil[i] + "\nDitemukan Pada Index : " + i + ".");
        } else {
            System.out.println("Data tidak ditemukan");
        }
	}
        
    static void urutkan(long[] harga, String[] jenis) {
        for (int i = 0; i < harga.length; i++) {
            for (int j = 0; j < harga.length - 1; j++) {
                if (harga[j] > harga[j + 1]) {
                    long temp = harga[j];
                    String tem = jenis[j];
                    harga[j] = harga[j + 1];
                    jenis[j] = jenis[j + 1];
                    harga[j + 1] = temp;
                    jenis[j + 1] = tem;
                }
            }
        }
    }
        
    static void pilihanketiga(String[] jenismobil, long[] hargamobil){    
        System.out.println("Daftar Harga Mobil dari yang Termurah ke yang Paling Mahal");
        urutkan(hargamobil, jenismobil);
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-8s %-21s %d", i+1, jenismobil[i], hargamobil[i]));
        }
    }

    static void pilihankeempat(String[] jenismobil, long[] hargamobil){
        System.out.println("Daftar Harga Mobil dari yang Termurah ke yang Paling Mahal");
        urutkan(hargamobil, jenismobil);
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-8s %-21s %d", i+1, jenismobil[i], hargamobil[i]));
        } 
        int cari = 169000000;
        int i;
        boolean ketemu = false;
        for (i = 0; i < hargamobil.length; i++) {
            if (hargamobil[i] == cari) {
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println("Harga Produk Termurah ke-2 adalah : " + cari + ", mobil jenis " +
            jenismobil[i] + "\nDitemukan Pada Index Ke- " + i);
        } else {
            System.out.println("Harga Tidak Ditemukan");
        }
    }

	public static void main(String[] args){
        String[] jenismobil;
        jenismobil = new String[10];
        jenismobil[0] = "Jaguar";
        jenismobil[1] = "Lambhorgini";
        jenismobil[2] = "Honda";
        jenismobil[3] = "Audi";
        jenismobil[4] = "Suzuki";
        jenismobil[5] = "Mazda";
        jenismobil[6] = "Daihatsu";
        jenismobil[7] = "Ford";
        jenismobil[8] = "Hyundai";
        jenismobil[9] = "Mitsubishi";

        long[] hargamobil;
        hargamobil = new long[10];
        hargamobil[0] = 1340000000;
        hargamobil[1] = 34500000000L;
        hargamobil[2] = 350000000;
        hargamobil[3] = 2000000000;
        hargamobil[4] = 245000000;
        hargamobil[5] = 500000000;
        hargamobil[6] = 169000000;
        hargamobil[7] = 789000000;
        hargamobil[8] = 122900000;
        hargamobil[9] = 278100000;

        Scanner inputan = new Scanner(System.in);
        int pilihan;
        System.out.println("============================================================");
        System.out.println("==                       MENU UTAMA                       ==");
        System.out.println("============================================================");
        System.out.println("== 1. Tabel Harga Produk                                  ==");
        System.out.println("== 2. Mobil Audi dan Lokasinya pada Array                ==");
        System.out.println("== 3. Urutan Harga Produk dari Termurah Hingga Termahal   ==");
        System.out.println("== 4. Harga Produk Termurah Ke - 2                        ==");
        System.out.println("============================================================");
        System.out.print("Masukkan Pilihan Anda: ");
        pilihan = inputan.nextInt();
        switch(pilihan){
            case 1: 
                pilihanpertama(jenismobil, hargamobil);
                break;
            case 2: 
                pilihankedua(jenismobil, hargamobil);
                break;
            case 3: 
                pilihanketiga(jenismobil, hargamobil);
                break;
            case 4: 
                pilihankeempat(jenismobil, hargamobil);
                break;       
            default: 
                System.out.println("MENU YANG DIPILIH TIDAK TERSEDIA.");
        }

    }
}

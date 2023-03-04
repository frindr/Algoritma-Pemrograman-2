package com.semester2.prakmodul2;

public class tugas2c{
    public static void main(String[] args){
        tugas2a input1 = new tugas2a(); //membuat objek
        tugas2b dataKar = new tugas2b();
        System.out.print("Berapa jumlah karyawan: ");
        dataKar.setJmlKaryawan(input1.bacaInt()); //memberi nilai berdasarkan input1.bacaInt
        System.out.println();
        for (int I = 0; I < dataKar.n; I++){
            System.out.println("Karyawan ke - " + (I+1));
            System.out.print("Masukan NIK        : ");
            dataKar.setNIK(I, input1.bacaString());
            System.out.print("Masukan Nama       : ");
            dataKar.setNama(I, input1.bacaString());
            System.out.print("Masukan Gaji Pokok : ");
            dataKar.setGapok(I, input1.bacaInt());
            System.out.println();
        }
        dataKar.tampilData();
    }
}
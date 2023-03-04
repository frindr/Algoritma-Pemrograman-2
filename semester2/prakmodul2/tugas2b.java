package com.semester2.prakmodul2;

public class tugas2b{
    private final String[] nik = new String[100];
    private final String[] nama = new String[100]; 
    private final int[] gapok = new int[100];
    //private artinya variabel hanya bisa diakses pada class itu saja
    /* final artinya nilai variabel tidak bisa diubah lagi atau dalam konteks ini anggota array
    tidak bisa diubah nilainya pada saat inisialisasi */
    public int n;

    public void setNIK(int i, String x){ //method setter
        this.nik[i] = x; //this digunakan sebagai referensi dari class itu sendiri
    }
    public void setNama(int i, String x){
        this.nama[i] = x;
    }
    public void setGapok(int i, int x){
        this.gapok[i] = x;
    }
    public float rerataGapok(){
        int sum = 0, i;
        for (i = 0; i < this.n; i++){
            sum += this.gapok[i];
        }
        return sum/this.n;
    }
    public void setJmlKaryawan(int x){
        this.n = x;
    }
    public void tampilData(){        
        System.out.println("========================================================");
        System.out.println("NIK                      NAMA                       GAJI");
        System.out.println("========================================================");
        for (int i = 0; i < this.n; i++){
            //method format
            System.out.println(String.format("%-25s %-25s Rp %2d", nik[i], nama[i], gapok[i]));
        }
        System.out.println("===================================");
        System.out.println("Rata-rata gaji pokok dari " + this.n + " karyawan di atas adalah Rp " + this.rerataGapok());
    }
}

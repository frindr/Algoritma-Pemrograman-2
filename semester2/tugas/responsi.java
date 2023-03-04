package com.semester2.tugas;

import java.util.Scanner;

public class responsi{
    static Scanner input = new Scanner(System.in);
    static String nama[] = new String[50];
    static int mhs[][] = new int[50][5];
    static int buku1[][] = new int[50][2];
    static String buku2[][] = new String[50][2];
    static int peminjam[][] =  new int[50][2];
    static int banyak, jmlpinjam, jmlmhs;

    public static void inputBuku(){
        System.out.println("\t\t\t\n-- PROSES MENGINPUT BUKU --");
        int jml, no = 1;
        System.out.print("\nMasukkan jumlah buku : "); jml = input.nextInt();        
        for(int i = banyak; i < banyak + jml; i++){
            System.out.println("\nBuku ke - " + no);
            System.out.print("Kode Buku (angka)  : "); buku1[i][0] = input.nextInt();
            input.nextLine();
            System.out.print("Judul Buku         : "); buku2[i][0] = input.nextLine();
            System.out.print("Nama Pengarang     : "); buku2[i][1] = input.nextLine();
            System.out.print("Tahun Terbit Buku  : "); buku1[i][1] = input.nextInt(); 
            no++;
        }
        banyak += jml;
        System.out.println("\nDaftar buku yang dimasukkan berhasil disimpan.");
    }

    public static void daftarBuku(){
        System.out.println("============================================================");
        System.out.println("                  DAFTAR BUKU YANG TERSEDIA");
        System.out.println("============================================================");
        System.out.println("KODE BUKU     JUDUL BUKU     NAMA PENGARANG     TAHUN TERBIT");
        System.out.println("============================================================");
        int tkode, ttahun;
        String tjudul,tpengarang;
        for(int i = 0; i < banyak; i++){
            for(int j = i + 1; j < banyak; j++){
                if(buku1[i][0] > buku1[j][0]){
                    tkode = buku1[i][0];
                    buku1[i][0] = buku1[j][0];
                    buku1[j][0] = tkode;
                    ttahun = buku1[i][1];
                    buku1[i][1] = buku1[j][1];
                    buku1[j][1] = ttahun;
                    tjudul = buku2[i][0];
                    buku2[i][0] = buku2[j][0];
                    buku2[j][0] = tjudul;
                    tpengarang = buku2[i][1];
                    buku2[i][1] = buku2[j][1];
                    buku2[j][1] = tpengarang;
                }
            }
            System.out.println(String.format("%6d %16s %15s %16d", buku1[i][0], buku2[i][0],
                                              buku2[i][1], buku1[i][1]));
        }
    }

    public static void cari(){
        int pilih2;
        char jawab;
        do{         
            System.out.println("\nCARI BUKU BERDASARKAN: ");
            System.out.println("1. Kode Buku");
            System.out.println("2. Pengarang");
            System.out.print("Masukkan Pilihan       : "); pilih2 = input.nextInt();
            switch(pilih2){
                case 1:{
                    int kode, a = 0;
                    String pesan = "";
                    boolean ketemu = false;
                    System.out.print("\nMasukkan Kode Buku     : "); kode = input.nextInt();
                    System.out.println("\nHASIL PENCARIAN\t: ");
                    for(int i = 0; i < banyak; i++){
                        if(buku1[i][0] == kode){
                            System.out.println("Kode Buku       : " + buku1[i][0]);
                            System.out.println("Judul Buku      : " + buku2[i][0]);
                            System.out.println("Nama Pengarang  : " + buku2[i][1]);
                            pesan = "";
                            ketemu = true;
                            break;
                        }
                    }
                    if(ketemu == false){
                        pesan = "Buku yang anda cari tidak ditemukan!\n";
                    }
                    System.out.print(pesan);
                    break;
                }
                case 2:{
                    boolean ketemu = false;
                    String karangan;
                    String pesan = "";
                    input.nextLine();
                    System.out.print("\nMasukan Nama Pengarang : "); karangan = input.nextLine();
                    System.out.println("\nHASIL PENCARIAN : ");
                    for(int i = 0; i < banyak; i++){
                        if(buku2[i][1].equalsIgnoreCase(karangan)){
                            System.out.println("Kode Buku      : " + buku1[i][0]);
                            System.out.println("Judul Buku     : " + buku2[i][0]);
                            System.out.println("Nama Pengarang : " + buku2[i][1]);
                            pesan = "";
                            ketemu = true;
                            break;
                        }
                    }
                    if(ketemu == false){
                        pesan = "Buku yang anda cari tidak ditemukan!\n";
                    }
                    System.out.print(pesan);
                    break;
                }
            }
                System.out.print("\nUlangi Pencarian? [Y/T] : "); jawab = input.next().charAt(0);
            } while(jawab == 'y' || jawab == 'Y');
    }

    public static void pinjamBuku(){
        System.out.println("\n\t\t    -- PEMINJAMAN BUKU --");
        daftarBuku();
        boolean ketemu = false;
        int jml, no = 1;
        input.nextLine();
        System.out.print("\nMasukkan Nama Anda : "); nama[jmlmhs] = input.nextLine();
        System.out.print("Masukkan NIM  Anda : "); mhs[jmlmhs][0] = input.nextInt();
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Teknik Sipil");
        System.out.println("3. Teknik Pertambangan");
        System.out.println("4. Arsitektur");
        System.out.print("Jurusan : "); mhs[jmlmhs][1] = input.nextInt();
        String pesan = "";
        do{
            System.out.print("Masukan Tanggal Peminjaman [1-31] : "); mhs[jmlmhs][2] = input.nextInt();
            if(mhs[jmlmhs][2] <= 0 || mhs[jmlmhs][2] > 31){
                System.out.println("Masukan Salah!");
            }   
        } while(mhs[jmlmhs][2] <= 0 || mhs[jmlmhs][2] > 31);
        if(mhs[jmlmhs][2] < 25){
            mhs[jmlmhs][3] = (mhs[jmlmhs][2]) + 7;
        } else {
            mhs[jmlmhs][3] = ((mhs[jmlmhs][2]) + 7) - 30;
        }
        System.out.print("Jumlah Buku yang Ingin Dipinjam   : "); jml = input.nextInt();
        for(int i = jmlpinjam; i < jmlpinjam + jml; i++){
            System.out.println("\nBuku ke - " + no);
            System.out.print("Masukan kode buku: "); peminjam[i][0] = input.nextInt();
            for(int j = 0; j < banyak; j++){
                ketemu = false;
                mhs[jmlmhs][4] = jml;
                if(peminjam[i][0] == buku1[j][0]){
                    System.out.println("Anda meminjam " + buku2[j][0]);
                    pesan = "";
                    ketemu = true;
                    break;
                }
            }
            if(ketemu == false){
                pesan = "Tidak terdapat buku dengan kode yang dimasukkan.\nMasukkan Ulang.\n";
                i = jmlpinjam;
                no = no - 1;
            }
            System.out.print(pesan);
            no++;
            peminjam[i][1] = mhs[jmlmhs][0];   
        }
        jmlpinjam += jml;
        jmlmhs = jmlmhs + 1;
    }

    public static void pengembalian(){
        if(jmlpinjam == 0){
            System.out.println("\nBelum ada yang meminjam buku...");
        } else {        
            for(int i = 0; i < jmlmhs; i++){
                System.out.println("\nNIM             : " + mhs[i][0]);
                System.out.println("NAMA            : " + nama[i]);
                System.out.print("JURUSAN         : ");
                if(mhs[i][1] == 1){
                    System.out.print("Teknik Informatika\n");
                }
                else if(mhs[i][1] == 2){
                    System.out.print("Teknik Sipil\n");
                }
                else if(mhs[i][1] == 3){
                    System.out.print("Teknik Pertambangan\n");
                }
                else{
                    System.out.print("Arsitektur\n");
                }
                System.out.println("JUMLAH PINJAM   : " + mhs[i][4] + " buku");
                System.out.println("TANGGAL PINJAM  : " + mhs[i][2]);
                System.out.println("TANGGAL KEMBALI : " + mhs[i][3]);
            }
            int nim;
            int ts;
            System.out.print("\nMasukan NIM                     : "); nim = input.nextInt();
            for(int i = 0; i < jmlmhs; i++){
                if(nim == mhs[i][0]){
                    do{
                        System.out.print("Masukan Tanggal Sekarang [1-31] : "); ts = input.nextInt();
                        if(ts <= 0 || ts > 31){
                            System.out.print("Masukan tidak tepat.\n");
                        }
                    } while(ts <= 0 || ts > 31);
                    if(ts > mhs[i][3]){
                        System.out.println("\nAnda didenda Rp. 500 karena telat mengembalikan.");
                    }
                    for(int j = 0; j < jmlpinjam; j++){
                        if(peminjam[j][1] == mhs[i][0]){
                            if(mhs[jmlmhs-1][0] == nim){
                                jmlmhs -= 1;
                                break;
                            }
                            else{
                                for(int x=0;x < jmlmhs; x++){
                                    mhs[x][0] = mhs[x + 1][0];
                                    nama[x] = nama[x + 1];
                                    mhs[x][1] = mhs[x + 1][1];
                                    mhs[x][2] = mhs[x + 1][2];                    
                                    mhs[x][3] = mhs[x + 1][3];
                                    mhs[x][4] = mhs[x + 1][4];
                                    peminjam[j][1] = peminjam[j + 1][1];
                                    peminjam[j][0] = peminjam[j + 1][0];
                                }
                                jmlmhs -= 1;
                                break;
                            }
                        }
                    }
                    System.out.print("\nSilakan mengembalikan buku yang dipinjam... \nTerima Kasih!\n");
                }
            }
        }
    }
    
    public static void main(String[] args){
        char back;
        int pilih;
        do{
            System.out.println("\t\t\t-- MENU UTAMA --");
            System.out.println("1. Input Buku");
            System.out.println("2. Daftar Buku");
            System.out.println("3. Pencarian Buku");
            System.out.println("4. Peminjaman Buku");            
            System.out.println("5. Pengembalian Buku");
            System.out.println("6. Keluar\n");
            System.out.print("Pilih Menu : "); pilih = input.nextInt();
            switch(pilih){
                case 1:
                    inputBuku();
                    break;
                case 2:
                    System.out.println();
                    daftarBuku();
                    break;
                case 3:
                    cari();
                    break;
                case 4:
                    pinjamBuku();
                    break;
                case 5:
                    pengembalian();
                    break;
                case 6:
                    System.out.println("Program Selesai!");
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak tersedia.");
            }
            if(pilih == 6){
                back ='T';
            } else {
                System.out.print("\nKembali ke Menu Utama? [Y/T] : ");
                back = input.next().charAt(0);  
                System.out.println("-----------------------------------------------------------------");
            }   
        } while(back != 'T' && back != 't');
    }
}
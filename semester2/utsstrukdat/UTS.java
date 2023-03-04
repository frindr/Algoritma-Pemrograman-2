package com.semester2.utsstrukdat;

import java.util.Scanner;

public class UTS{
    public static void daftar(){
        System.out.println("\n\t\t\t\t\t\t    DAFTAR MATA KULIAH");
        System.out.println("\t\t\t\t\t\tJURUSAN TEKNIK INFORMATIKA");
        System.out.println("==============================================================================================================================");
        System.out.println("= Kalkulus 1, Kalkulus 2, Pengantar Teknik Informatika, Sistem Operasi, Aljabar Vektor dan Matriks, Struktur Data,           =");
        System.out.println("= Metode Numerik, Logika Diskrit, Teori Bahasa dan Otomata, Algoritma dan Pemrogaramn 1, Algoritma dan Pemrograman 2,        =");
        System.out.println("= Grafika Komputer, Multimedia, Spasial, Sistem Digital, Arsitektur dan Organisasi Komputer, Basis Data 1, Basis Data 2      =");
        System.out.println("= Technopreneurship, Pemrograman Berorientasi Objek, Pemrograman Web, Komunikasi Data, Jaringan Komputer, Keamanan Jaringan, =");
        System.out.println("= Data Mining, Rekayasa Perangkat Lunak, Manajemen Proyek, Kecerdasan Buatan, Jaringan Syaraf Tiruan, Deep Learning,         =");
        System.out.println("= Program Profesional, Kerja Praktik, Metode Penelitian, Tugas Akhir.                                                        =");
        System.out.println("==============================================================================================================================\n");
    }

    public static void main(String[] args){
        Graf graf = new Graf();
        graf.tambahSimpul("Kalkulus 1");
        graf.tambahSimpul("Kalkulus 2");
        graf.tambahSimpul("Pengantar Teknik Informatika");
        graf.tambahSimpul("Sistem Operasi");
        graf.tambahSimpul("Aljabar Vektor dan Matriks");
        graf.tambahSimpul("Metode Numerik");
        graf.tambahSimpul("Logika Diskrit");
        graf.tambahSimpul("Teori Bahasa dan Otomata");
        graf.tambahSimpul("Algoritma dan Pemrograman 1");
        graf.tambahSimpul("Algoritma dan Pemrograman 2");
        graf.tambahSimpul("Grafika Komputer");
        graf.tambahSimpul("Multimedia");
        graf.tambahSimpul("Spasial");
        graf.tambahSimpul("Sistem Digital");
        graf.tambahSimpul("Arsitektur dan Organisasi Komputer");
        graf.tambahSimpul("Struktur Data");
        graf.tambahSimpul("Basis Data 1");
        graf.tambahSimpul("Basis Data 2");
        graf.tambahSimpul("Data Mining");
        graf.tambahSimpul("Pemrograman Berorientasi Objek");
        graf.tambahSimpul("Pemrograman Web");
        graf.tambahSimpul("Komunikasi Data");
        graf.tambahSimpul("Jaringan Komputer");
        graf.tambahSimpul("Keamanan Jaringan");
        graf.tambahSimpul("Rekayasa Perangkat Lunak");
        graf.tambahSimpul("Manajemen Proyek");
        graf.tambahSimpul("Technopreneurship");
        graf.tambahSimpul("Kecerdasan Buatan");
        graf.tambahSimpul("Jaringan Syaraf Tiruan");
        graf.tambahSimpul("Deep Learning");
        graf.tambahSimpul("Program Profesional");
        graf.tambahSimpul("Kerja Praktik");
        graf.tambahSimpul("Metode Penelitian");
        graf.tambahSimpul("Tugas Akhir");
            
        graf.tambahSisi("Kalkulus 2", "Kalkulus 1");    
        graf.tambahSisi("Sistem Operasi", "Pengantar Teknik Informatika");   
        graf.tambahSisi("Metode Numerik", "Aljabar Vektor dan Matriks");  
        graf.tambahSisi("Teori Bahasa dan Otomata", "Logika Diskrit");       
        graf.tambahSisi("Algoritma dan Pemrograman 2", "Algoritma dan Pemrograman 1");
        graf.tambahSisi("Grafika Komputer", "Algoritma dan Pemrograman 2");
        graf.tambahSisi("Multimedia", "Grafika Komputer");
        graf.tambahSisi("Spasial", "Multimedia");
        graf.tambahSisi("Arsitektur dan Organisasi Komputer", "Sistem Digital");
        graf.tambahSisi("Basis Data 1", "Struktur Data");
        graf.tambahSisi("Basis Data 2", "Basis Data 1");
        graf.tambahSisi("Data Mining", "Basis Data 2");
        graf.tambahSisi("Pemrograman Berorientasi Objek", "Algoritma dan Pemrograman 2");
        graf.tambahSisi("Pemrograman Web", "Pemrograman Berorientasi Objek");
        graf.tambahSisi("Jaringan Komputer", "Komunikasi Data");
        graf.tambahSisi("Keamanan Jaringan", "Jaringan Komputer");
        graf.tambahSisi("Manajemen Proyek", "Rekayasa Perangkat Lunak");
        graf.tambahSisi("Technopreneurship", "Manajemen Proyek");
        graf.tambahSisi("Jaringan Syaraf Tiruan", "Kecerdasan Buatan");
        graf.tambahSisi("Deep Learning", "Jaringan Syaraf Tiruan");
        graf.tambahSisi("Kerja Praktik", "Program Profesional");
        graf.tambahSisi("Basis Data 2", "Basis Data 1");
        graf.tambahSisi("Tugas Akhir", "Metode Penelitian");
        
        Scanner input = new Scanner(System.in);
        String matkul;
        while(true){
            daftar();
            System.out.println("Ambil Mata Kuliah");
            System.out.print("Masukkan Mata Kuliah yang Ingin Diambil : ");
            matkul = input.nextLine();
            if(graf.mapNamaIndeks.get(matkul) == null){
                System.out.println("Input Salah atau Mata Kuliah yang Dimasukkan Tidak Tersedia");
                continue;
            }
            System.out.println("-----------------------------------\nUrutan matkul yang harus diambil : ");
            TopologicalSort.topologicalSort(graf, matkul);
            System.out.println();
        }     
    }
}
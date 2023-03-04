package com.semester2.prakmodul2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas2a{
    public String bacaString(){ //function
        //Membuat objek BufferedReader
        /*Fungsi dasar dari BufferedReader adalah membaca file dari input stream. Lebih spesifik
        lagi bahwa class ini digunakan sebagai buffer dari karakter-karakter dengan tujuan membuat
        penanganan yang lebih efisien untuk string, character, dan array.*/
        BufferedReader bfr = new BufferedReader (new InputStreamReader (System.in));
        //Membuat objek BufferedReader
        String string = " ";
        try{ //mencoba membaca input user
            string = bfr.readLine(); //input user
        }
        //mencegah berakhirnya program karena error ketika user memasukkan input
        //menangkap exception
        catch(IOException ex){ 
            System.out.println(ex); //dia akan mencetak
        }
        return string; //mengembalikan nilai
    }
    public int bacaInt(){
        return Integer.parseInt(bacaString()); //bacaString dikonversi dan dikembalikan nilainya
    }
}
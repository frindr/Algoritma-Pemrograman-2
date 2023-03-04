package com.semester2.prakmodul1;

public class tugas3dowhile {
    public static void main(String args[]){
        int jum=0, x=1;
        do{
        System.out.println(x);
        jum += x;
        x++;
        } while (x<16);
        System.out.println("Total: "+jum);
    }
}

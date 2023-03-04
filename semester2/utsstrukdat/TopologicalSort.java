package com.semester2.utsstrukdat;

import java.util.*;

public class TopologicalSort{
    static ArrayList<LinkedList<Integer>> simpul;
    static HashMap<String, Integer> mapNamaIndeks;
    static ArrayList<String> namaSimpul;
    static Boolean[] apakahSudahDikunjungi;

    public static void topologicalSort (Graf graf, String tujuan){
        simpul = graf.simpul;
        mapNamaIndeks = graf.mapNamaIndeks;
        namaSimpul = graf.namaSimpul;
        int indexTujuan = mapNamaIndeks.get(tujuan);
        apakahSudahDikunjungi = new Boolean[simpul.size()];
        for (int i = 0; i < simpul.size(); i++){
            apakahSudahDikunjungi[i] = false;
        }
        /*System.out.println(mapNamaIndeks);
        System.out.println(simpul);
        System.out.println(namaSimpul);*/
        proses(indexTujuan);
    }

    public static void proses(int index){
        if(apakahSudahDikunjungi[index])
            return;
        Iterator<Integer> it = simpul.get(index).iterator();
        apakahSudahDikunjungi[index] = true;
        while(it.hasNext()){
            proses(it.next());
        }
        System.out.println("- " + namaSimpul.get(index));
    } 
}
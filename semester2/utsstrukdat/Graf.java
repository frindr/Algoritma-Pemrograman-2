package com.semester2.utsstrukdat;

import java.util.*;

public class Graf{
    ArrayList<LinkedList<Integer>> simpul = new ArrayList<>();
    ArrayList<String> namaSimpul = new ArrayList<>();
    HashMap<String, Integer> mapNamaIndeks = new HashMap<>();

    public void tambahSimpul(String nama){
        mapNamaIndeks.put(nama, simpul.size());
        simpul.add(new LinkedList<>());
        namaSimpul.add(nama);
    }

    public void tambahSisi(String asal, String tujuan){
        int indexAsal = mapNamaIndeks.get(asal);
        int indexTujuan = mapNamaIndeks.get(tujuan);
        simpul.get(indexAsal).add(indexTujuan);
    }    
}

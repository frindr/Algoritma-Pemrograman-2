package com.semester2.prakmodul5;

public class RabinKarp{
    public final static int d = 10;

    static void search(String pattern, String txt, int q){
        int h = 1, i, j, m = pattern.length(), n = txt.length(), p = 0, t = 0;
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;
        // hitung nilai hash untuk pattern and text
        for (i = 0; i < m; i++){
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        // Cari kecocokan
        for (i = 0; i <= n - m; i++){
            if (p == t){
                for (j = 0; j < m; j++){
                    if (txt.charAt(i + j) != pattern.charAt(j))
                    break;
                }
                if (j == m)
                    System.out.println("Pattern ditemukan pada posisi: " + (i + 1));
            }
            if (i < n - m){
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }
    }
    public static void main(String[] args){
        String txt = "ABCCDDAEFG";
        String pattern = "CDD";
        int q = 13;
        search(pattern, txt, q);
    }
}

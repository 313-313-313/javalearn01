package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "0mer"));
        ArrayList<String> aOlmayanlistIsim = new ArrayList<>();//boş list

        for (int i = 0; i < listIsim.size(); i++) {

            if (!listIsim.get(i).toLowerCase().contains("a")) { // listin her elemanı a bulundurmuyorsa
                aOlmayanlistIsim.add(listIsim.get(i)); //yeni list e olmayan eleman eklendi
            }
        }
        System.out.println("aOlmayanlistIsim");

        listIsim.clear(); //list isim boşaltıldı

        listIsim.addAll(aOlmayanlistIsim);
        System.out.println("listIsim = " + listIsim); //[Veli, 0mer]
    }
}

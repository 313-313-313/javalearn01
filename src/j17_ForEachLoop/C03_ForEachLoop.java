package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //task -> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz.
        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","çiğdem"};
        String arr2[]={"musty","gülsüm","ayse","enise","cüneyt","çiğdem"};
        List<String> ortakIsim=new ArrayList<>(); //boş isimlerin atanacağı boş list

        for(String str1:arr1){
            for(String str2:arr2){
                if(str2.equalsIgnoreCase(str1)){ //her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if(ortakIsim.isEmpty()){ //ortak isim list boşluk kontrol
            System.out.println( "arrlerinizde ortak isim yok"+ortakIsim);
        }else System.out.println(ortakIsim);

    }
}

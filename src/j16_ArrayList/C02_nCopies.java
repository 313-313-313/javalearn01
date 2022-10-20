package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere","İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","LosAngeles","Londra","Stockholm"));

        //nCopies(int,Obj);-> int elemanlı bir obj den oluşan list ataması yapıyor
        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("yeniList = " + yeniList);

        // addAll(); -> bir Liste diğer listi olduğu gibi ekler

        listUlke.addAll(listSehir); // ülke list sonuna şehir list tamamen eklendi.
        System.out.println("listUlke = " + listUlke);

        listSehir.addAll(3,listUlke); // 3. indexten itibaren ülke listi şehir liste tamamen eklendi

        System.out.println("listSehir = " + listSehir); //

        //TASK -> 1den 10 kadar sayıları bir liste atayıp print eden code create ediniz..

        ArrayList<Integer> listSayi=new ArrayList<>(); // boş integer list

        for(int i=1; i<=10;i++){
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}

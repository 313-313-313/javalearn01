package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        //remove();--> list'ten istenen elemanı siler
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));

        System.out.println("listSehir.remove(\"angara\") = " + listSehir.remove("angara")); //false
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra")); //true
        System.out.println("listSehir.remove(1) = " + listSehir.remove(1)); //LosAngeles
        System.out.println("listSehir = " + listSehir); //listSehir = [Münih, Stockholm]
      //  System.out.println("listSehir.remove(11) = " + listSehir.remove(11));// IndexOutOfBoundsException yani RTE verir.

        listSehir.add("Münih"); //münih ekle
        listSehir.add("Ankara"); //ankara ekle
        listSehir.add("Münih"); //münik ekle
        System.out.println("listSehir = " + listSehir); //[Münih, Stockholm, Münih, Ankara, Münih]
        listSehir.remove("Münih"); //münih i silll
        System.out.println("listSehir = " + listSehir); //[Stockholm, Münih, Ankara, Münih]


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "Ingiltere", "isvec"));

        listSehir.addAll(listUlke); //ülke list eklendi

        System.out.println("listSehir = " + listSehir); //listSehir = [Stockholm, Münih, Ankara, Münih, Alamanya, Amerigonya, Ingiltere, isvec]

        listSehir.removeAll(listUlke); //ülke list cıkarıldı
        System.out.println("listSehir = " + listSehir); // listSehir = [Stockholm, Münih, Ankara, Münih]


    }
}

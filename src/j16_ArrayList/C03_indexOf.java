package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf(); -->list içinde istenen elemanın index değerin return eder.
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere","İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("Londra")); //2
        System.out.println("listSehir.indexOf(\"londra\") = " + listSehir.indexOf("londra")); //2
        System.out.println("listSehir.indexOf(\"Angara\") = " + listSehir.indexOf("Angara"));
        System.out.println("listSehir.indexOf(\"muğla\") = " + listSehir.indexOf("muğla")); //listte olmayan eleman index i -1

        listUlke.add("Amerigonya");
        System.out.println(listUlke); //[Alamanya, Amerigonya, İngiltere, İsveç, Amerigonya]
        System.out.println(listUlke.indexOf("Amerigonya")); //1 --> tekrarlı elemanlarda soldan ilk bulduğu eleman index i return eder
        System.out.println(listUlke.lastIndexOf("Amerigonya")); // 4--> sağdan bulduğu ilk elemanı getirir

    }

}

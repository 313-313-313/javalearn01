package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        cifKarePrint(sayi); //576 1444 1764 4356 2116 256
        System.out.println("\n   ***   ");
        System.out.println("sayi = " + sayi);
        System.out.println("\n   ***   ");
        küpPrint(sayi); //117650 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n   ***   ");
        ciftKarekökPrint(sayi); //4.898979485566356 6.164414002968976 6.48074069840786 8.12403840463596 6.782329983125268 4.0


    }//main sonu

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void cifKarePrint(List<Integer> sayi) {
        sayi.
                stream(). //list elelmanlar akısa alındı
                filter(C01_LambdaExpression::ciftMi). //akıstaki cift elemanlar filtrelendi
                map(t -> t * t). //akısta filtrelenen cift elemanlar karesi alınarak update edildi akısa sokuldu
                forEach(C01_LambdaExpression::yazdir); //akısta filtrelenmişş cift elemanlar karesi alınıp işaretlenen akıstan print edildi.

    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void küpPrint(List<Integer> sayi) {
        sayi.
                stream(). //list elelmanlar akısa alındı
                filter(C01_LambdaExpression::tekMi). //akıstaki tek elemanlar filtrelendi
                //  map(t -> t * t * t + 1). //akısta filtrelenen tek elemanlar küpünün bir fazlası alınarak update edildi akısa sokuldu

                //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
                        map(t -> (int) Math.pow(t, 3) + 1).
                forEach(C01_LambdaExpression::yazdir);

    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarekökPrint(List<Integer> sayi) {
        sayi.
                stream(). //list elelmanlar akısa alındı
                filter(C01_LambdaExpression::ciftMi). //akıstaki çift elemanlar filtrelendi


                        map(Math::sqrt). //akısta filtrelenen çift elemanların karekönünü update eder
        forEach(t->System.out.print(t+" "));//akışta filtrelenmiş çift elemanların kökü alınıp akıştan print edildi.


    }
}

package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        List<String> menu =new ArrayList<String>(Arrays.asList("küşleme","soğanlı","triliçe","bicibici","buryan","buryan","melemen","cacix","kokoreç","yaglama","güveç","arabaşı","tantuni"));

        alfBkTkszPrint(menu);
        System.out.println("\n   ***   ");
        chrSysTersSıraPrint(menu);
        System.out.println("\n   ***   ");
        chrSysBkSıraPrint(menu);
        System.out.println("\n   ***   ");
        sonHrfTrsPrint(menu);
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        

    }//main sonu
    //Task:list elemanlarını alfabetik buyuk harf ve tekrarsız print ediniz.

    public static void alfBkTkszPrint(List<String>menu){
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t-> System.out.print(t+ " "));

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    }
    //Task:list elemanlarının character sayısını ters sıralı olarak tekrarsız  print ediniz.

    public static void chrSysTersSıraPrint(List<String>menu){
        menu.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().forEach(t-> System.out.print(t+" "));
    }
    //TASK :List elemanlarını character sayısına göre küçükten büyüğe göre print ediniz.
    public static void chrSysBkSıraPrint(List<String >menu){
        menu.
                stream().
                sorted(Comparator.
                        comparing(String::length)). //akıstaki string elemanların length'ine göre doğal sıra
                forEach(t-> System.out.print(t+" "));
    }
    //TASK:list elemanlarının son harfine göre ters sıralı print ediniz...
    public static void sonHrfTrsPrint(List<String>menu){
        menu.
                stream().
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).
                        reversed()).
                forEach(t-> System.out.print(t+" "));
    }
}

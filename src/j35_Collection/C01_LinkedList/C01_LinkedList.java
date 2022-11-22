package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList....
        1- LinkedList te elemanlar "data" ve "adress" olmak iki kısımdan oluşur ve eleman yerine node olarak tanımlanır..
        2-LinkedList te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3-LinkedList te son node adres kısmı null olan sadec data bulunduran tail node tanımlanmştır.
        4-ArrayList searcing LinkedList node ekleme ve silmede daha avantajlıdır.
        LinkedList eleman bulmada index yapısı olmadığı için
        5-LinkedList-> tren vagon ilişkisi baglantısı gibi düşünülebilir.
        6-Collection obj tanımlanırken cons Class (LinkedList,ArrayList...) olmalı interface(List, Queue..) olmamasına dikkat edilmeli
            Ancak obj  DataType olarak parent interface tanımlanabilir.
            7-LinkedList class iki tane paren interface den(List,Queue implement etmiştir.
         */

        LinkedList<String> ll1=new LinkedList<> (Arrays.asList("Ebubekir", "Gülsüm", "Adem", "İlker", "Merve"));

        //LinkedList print etme
        System.out.println("ll1 = " + ll1); //ll1 = [Ebubekir, Gülsüm, Adem, İlker, Merve]

        //LinkedList add();
        ll1.add("ugur ");
        System.out.println("ll1 = " + ll1); //ll1 = [Ebubekir, Gülsüm, Adem, İlker, Merve, ugur ]
        ll1.add(2,"abdulaziz");
        System.out.println("ll1 = " + ll1); //ll1 = [Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur ]
        ll1.addFirst("Javacan");
        System.out.println("ll1 = " + ll1); //ll1 = [Javacan, Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur ]
        ll1.addLast("Javatar");
        System.out.println("ll1 = " + ll1); //ll1 = [Javacan, Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur , Javatar]
        List<String> ll2=new LinkedList<>(Arrays.asList("Fatih","Erol","Nur")); //DataType interface List olan LinkedList
        ll1.addAll(ll2);
       // ll1.addAll("Agam") //CTE -> parametre Col olmazsa// DataType interface List  olan LinkedList

        System.out.println("ll1 = " + ll1); //ll1 = [Javacan, Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur , Javatar, Fatih, Erol, Nur]
     ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1); //ll1 = [Javacan, Ebubekir, Gülsüm, Fatih, Erol, Nur, abdulaziz, Adem, İlker, Merve, ugur , Javatar, Fatih, Erol, Nur]

    }
}

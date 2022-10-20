package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {

        ArrayList<String>listsehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","stockholm"));
        System.out.println("listsehir = " + listsehir); //listsehir = [Münih, Losangeles, Londra, stockholm]

        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty()); //false

        listsehir.clear();// list temizlendi

        System.out.println("listsehir = " + listsehir); // []

        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty()); //true

    }
}

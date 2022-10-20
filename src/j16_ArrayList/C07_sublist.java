package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {

    public static void main(String[] args) {

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm","Angara","patagonya"));

        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5)); // [stockholm, Angara] 3.ve 4. index elemanları listi verir

        ArrayList<String> city = new ArrayList<>(listSehir.subList(2,5));
        System.out.println("city = " + city); //city = [Londra, stockholm, Angara]
    }

}

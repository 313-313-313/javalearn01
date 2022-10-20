package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

        //list i Array e çevirme -> toArray();
        //1.yöntem -> toArray(); parametre olarak String[0] olarak yapılır.

        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere","isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]); //ulkeList elemanları arrulke olarak atandı

        System.out.println("listUlke = " + listUlke); // [Alamanya, Amerigonya, İngiltere, isvec]

        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke)); //[Alamanya, Amerigonya, İngiltere, isvec]


        // 2.YÖNTEM -> olusturulan Array in data type Object olarak atanır
        //TRİCK -> Object class java da class ların parent(atası:HZ ADEM )
        //Object Class javada parent i olmayan tek Class'tır(tum vgonları çeken ama çekilemez lokomotif)
        ////String Integer Class'lar Object Class child'i oldugu için istene durumlarda data type olarak object class kullanılabilir

        Object arrUlkeler[]=listUlke.toArray(); //Object -> Hz.Adem Class ına atandı.
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler)); // [Alamanya, Amerigonya, İngiltere, isvec]


    }
}

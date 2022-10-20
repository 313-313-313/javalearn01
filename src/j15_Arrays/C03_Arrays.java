package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //stringi array a çevirmek..
        String str="javacanlara selam olsun en kısa zamanda bolcana offer sonrası TUZLABALIK :)" ;

        //task-> striing bir  ifadeyi kelimelere sayısını print eden code create ediniz.
        String strArr[]=str.split(" ");

        System.out.println(Arrays.toString(strArr)); // [javacanlara, selam, olsun, en, kısa, zamanda, bolcana, offer, sonrası, TUZLABALIK, :)]
        System.out.println(strArr.length);

        //task-> string ifadedeki her harfi print eden code create ediniz.
        String harfArr[]= str.split("");
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length); //75

    }
}

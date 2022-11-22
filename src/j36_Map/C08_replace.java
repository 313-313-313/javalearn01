package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.replace();-> Girilen value değeri ilgili key'de update edilir

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Media Markt","183 Euro");

        System.out.println("hm = " + hm); //{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, Media Markt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro")); //296 Euro->oldvalue return edildi
        System.out.println("hm = " + hm); //hm = {Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, Media Markt=183 Euro, Amazon=314 Euro, Vatan=111 Euro}
        System.out.println("hm.replace(\"sefil\",\"haluk\") = " + hm.replace("sefil", "haluk")); //null-1 olmayan key için NULL çakar


    }
}

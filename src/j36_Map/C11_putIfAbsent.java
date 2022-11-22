package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.putIfAbsent();-> Girilen key map'te yoksa entry(key,value) map'e ekler ve null return eder,
      //  Girilen key map'te var ise key'e ait value return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Media Markt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.putIfAbsent(\"ebik\",\"gabık\") = " + hm.putIfAbsent("ebik", "gabık")); //null
        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaNAZ\") = " + hm.putIfAbsent("Ebay", "javaNAZ")); //234 Euro->
        // Ebay key olduğu için ebay key'e ait value return edildi.

        System.out.println("hm = " + hm);


    }
}

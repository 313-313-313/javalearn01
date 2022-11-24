package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
  /*
        Task ->
         Key:isim ,email,adres,telefon
         Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz.
         */

        Map<String, String> nazımKrtvzt = new HashMap<>();
        nazımKrtvzt.put("isim", "Nazım");
        nazımKrtvzt.put("email", "ebik@gabık.com");
        nazımKrtvzt.put("adres", "buyuk dut agacının altı");
        nazımKrtvzt.put("telefon", "1453571622");

        Map<String, String> mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "mehmet");
        mehmetKrtvzt.put("email", "ebik@gabık1.com");
        mehmetKrtvzt.put("adres", "buyuk elma agacının altı");
        mehmetKrtvzt.put("telefon", "12345678");

        Map<String,Map<String,String>>kartvizit=new HashMap<>();
        kartvizit.put("QA Nazım",nazımKrtvzt);
        kartvizit.put("Dev Mehmet",mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);

        System.out.println("kartvizit.get(\"Dev Mehmet\").get(\"telefon\") = " + kartvizit.get("Dev Mehmet").get("telefon")); // kartvizit.get("Dev Mehmet").get("telefon") = 12345678       System.out.println("kartvizit.get(\"Dev Mehmet\").get(\"telefon\") = " + kartvizit.get("Dev Mehmet").get("telefon")); //


        Map<Integer,Kartvizit> krt=new HashMap<>();
        Kartvizit k1=new Kartvizit("Enise","enise@tester.com","google company","1905");
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//k1.id key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'
        System.out.println("krt.get(k1.id) = " + krt.get(101));//101 key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'

    }
}

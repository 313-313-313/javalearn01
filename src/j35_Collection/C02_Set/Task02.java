package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static <ts> void main(String[] args) {
        //hashSet ve treeSet tanımlayıp run sürelerini karşılaştrınız.
        //Trick run süresi için System.currenTimeMillis() meth call ediniz.
        long tsBasla=System.currentTimeMillis();

        TreeSet<String>ts =new TreeSet<>();
        ts.add("Salim");
        ts.add("Alim");
        ts.add("Talim");
        ts.add("Ahvalim");
        ts.add("Hayalimm");
        ts.add("Melalim");
        ts.add("Yallnnn");

        long tsBitir=System.currentTimeMillis();
        System.out.println("(tsBitir-tsBasla) = " + (tsBitir - tsBasla));

        long hsBasla=System.currentTimeMillis();

        HashSet<String>hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("eyyy");
        hs.add("neyyy");
        hs.add("beheyyy");
        hs.add("heyheyyy");
        hs.add("ayyy");

        long hsBitir=System.currentTimeMillis();
        System.out.println("(hsBitir-hsBasla) = " + (hsBitir - hsBasla));
    }
}

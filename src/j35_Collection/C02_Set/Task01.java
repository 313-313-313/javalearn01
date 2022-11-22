package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        Değer ataması yapılan Array'i arrayList'e çeviren method create ediniz.
        main içerisinde meth return ettiği arrList'i hasSet, LinkedHashSet ve TreeSett'e atayınız.
         */
        String arr[]={"Muharrem","Umit","Sinan","Nihan"};

        arrayListeCevir(arr);
        HashSet<String>hs=new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String>lhs=new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts=new TreeSet<>(arrayListeCevir(arr));


        System.out.println("hurra set = " + hs); //hurra set = [Muharrem, Sinan, Nihan, Umit]
        System.out.println("erken gelen girer set = " + lhs); //erken gelen girer set = [Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıra set = " + ts); //alfabetik sıra set = [Muharrem, Nihan, Sinan, Umit]
    } //main sonu

    private static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String>arLst=new ArrayList<>(List.of(arr));

        return arLst;
    }
}

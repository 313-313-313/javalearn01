package j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object>list=new LinkedList<>(); //DataTypeObject(HzAdem) -> ne olursan ol gel

        list.add("Nazım");
        list.add('$');
        list.add(1453);

        System.out.println("list = " + list); //list = [Nazım, $, 1453]
    }
}

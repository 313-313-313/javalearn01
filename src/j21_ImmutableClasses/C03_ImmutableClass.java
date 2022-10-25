package j21_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {


        String name ="Merve";
        System.out.println(name); //merve
        name.concat("javacan");
        System.out.println("name = " + name); //merve-> String name variable meth sonrası aynı değerde kaldı:ımmutable

        List< String > isimList = new ArrayList<>();//boşS tring list

        System.out.println("isimList = " + isimList);// []

        isimList.add("Fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.remove(1);
        isimList.set(1,"javacan");

        System.out.println("isimList = " + isimList);// [Fatih, javacan]-> list boş iken methodlar sonrası değişti :mutable ArrayList de Mutable (değişebilir
    }
}


















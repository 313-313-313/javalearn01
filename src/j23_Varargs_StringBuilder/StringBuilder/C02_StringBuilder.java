package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder obj create etme ...
        //1. yol
        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16

        sb1.append("JAVATAR"); //javatar sb1 eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16

        sb1.append(" selam ").append(" olsun ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1); //sb1 = JAVATAR selam  olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity()); //34

        sb1.append("basarı gayrete asıktır:)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity()); //70

        //2. yol
        StringBuilder sb2=new StringBuilder("kevser hanıma selamlar"); // ilk değer ataması yapılmış sb1 STBuild obj
        System.out.println("sb2.capacity() = " + sb2.capacity());
        //Trim ()-> fazladan ayrılan capacity silinir.
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize(); //fazlasını siliyor
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //3. yol
        StringBuilder sb3=new StringBuilder(11); //hafızada 11 karakterlik yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length()); //karakter sayısı sıfırdır
        System.out.println("sb3.capacity() = " + sb3.capacity()); //11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity()); //24

        //istenen bir karakter index i alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12)); //m

        //Belirli bir aralıktaki karakterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13)); //ATAR selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17)); //sun 24 truebasarı gayrete asıktır:)
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13)); // ATAR selam

        //belirli bir indexteki karakteri silme...
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3)); //3. index A karakteri silindi //JAVTAR selam  olsun 24 truebasarı gayrete asıktır:)
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7)); //JAVselam  olsun 24 truebasarı gayrete asıktır:)

        //istenen karakter veya karakterleri ekleme
        System.out.println("sb3.insert(4,:)) = " + sb3.insert(4, ":)"));
        String s="güzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s)); //ebub:)ekigüzel insanr bey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));

        StringBuilder sb4=new StringBuilder("Nihan hanım ");
        System.out.println("sb4.insert(5,\"QA team lead\",0,2) = " + sb4.insert(5, "QA team lead", 0, 2));

   //istenen index deki karakteri değiştirme ..
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),' ');
        System.out.println("sb4 = " + sb4); //NihanQA hanım
        System.out.println("sb4.insert(5,\"\") = " + sb4.insert(5, " "));

        //İstenen index karakter yerine birden çok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sb obj String e çevirme
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase()); //EEL İBUB:)EKİGÜZEL İNSANR BEY -> sb3 SB stringe cevrilerek toUpperCase method çalıştı

        //String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String  str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        // sb6.compareTo((str1)//CTE-> elam armut kıyası olamazzz

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false-> SB equals == gibi çalışır -> hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//True


        StringBuilder strB = new StringBuilder("aspendos");

        strB.insert(0,"K");

        System.out.println(strB);







    }
}

package j02_DataTypes_WrapperClass;

public class DersTekrarı {
    public static void main(String[] args) {
        //Task -> 1999 yılında doğan bir kişinin yaşını yazdırınız...
        int dogum=1999;
        int sonyıl=2022;
                int yasss=sonyıl-dogum;
        System.out.println(yasss);

        float f1=1.2f;
        float f2=3.6F;
        double boy=1.68;
        System.out.println(f1*f2); // 1.2*3.6=4.32

        //TASK -> iki farklı byte tanımlayıp toplam ve farkı print ediniz...

        byte a=23,b=44;
        System.out.println(a+b); //67
        System.out.println(a-b); //-21

        // TASK-> İki farklı tam sayı türünde sayı tanımlayıp toplam farkını print ediniz..

        int c= 1453;
        byte d=34;
        System.out.println(c+d); //1487

        // TASK -> Tam sayı ve ondalıklı sayı tanımlayıp toplamını bulunuz.
        int n=33;
        double m=14.53;
        System.out.println(n+m); // 47.53 --> 33.00+14.53=47.53

        // TASK --> Tam sayı ve char data type iki variable tanımlayıp toplamı print ediniz.

        int numberr=63;
        char para= '$';
        System.out.println(numberr+para); // 63+36=99 $=36 ASCII DEĞERİ


        //TASK --> Adınızı soyadınızı ve yaşınızı print ediniz.
        String ad= "Nihan ";
        String soyad= "Aydın ";
        int yasın= 30;
        System.out.println(ad+" "+soyad+" "+yasın);

        //CONCATENATİON








    }
}

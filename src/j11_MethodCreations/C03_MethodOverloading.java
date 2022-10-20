package j11_MethodCreations;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        String str = "javaCAN'lara selam olsun";
        System.out.println(str.indexOf("C"));
        System.out.println(str.indexOf('C'));
        System.out.println(str.indexOf("C", 3));

topla('a','b');
topla(3,14);
topla(3.14,34);
topla(3,5);
topla(35,3.14);
topla(3.5,8.9);





    } //main sonu

    public static void topla(int sayi1, int sayi2) {
        System.out.println("int type method çalıştı:" + (sayi1 + sayi2));
    }


    public static void topla(double sayi1, int sayi2) {
        System.out.println("double-int type method çalıştı:" + (sayi1 + sayi2));
    }


    public static void topla(int sayi1, double sayi2) {
        System.out.println("int-double type method çalıştı:" + (sayi1 + sayi2));
    }


    public static void topla( double sayi1, double sayi2){
        System.out.println("double-double type method çalıştı:" + (sayi1 + sayi2));
    }


   }





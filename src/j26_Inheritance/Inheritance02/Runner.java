package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance01.Koyun;
import j26_Inheritance.Inheritance01.Paluk;

public class Runner {

    public static void main(String[] args) {
        //DataType
        Kedi k1=new Kedi();

        System.out.println("k1.a = " + k1.a); //k1.a = 0 //Hayvancık Class call
        System.out.println("k1.c = " + k1.c); //k1.c = 2//Kedi Class call
        System.out.println("k1.d = " + k1.d); //k1.d = 5 //Kedi Class call
        System.out.println("k1.m = " + k1.m); //k1.m = 1 //Mammal Class call
        /*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        k1.mA(); //Hayvancık class call
        k1.mC(); //Kedi Class call
        k1.mM(); //Mammal Class call

        /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */


       Mammal k2=new Kedi("Kevser"); ////DataType-> Parent Mammal Class Cons->p'li Kedi
        System.out.println(k2.c); //4
        System.out.println(k2.a); //0
        System.out.println(k2.m); //1
       // k2.d -> CTE k2 obj Data type Mammal Class d variable yok call edilemezzzzz.
        k2.mA(); //mA-> HAYVANCIK class method call
        k2.mC(); //mC-> Kedi class meth call
        k2.mM(); //mM-> Mammal class meth call

       Hayvancık k3=new Kedi();
        System.out.println(k3.m); //3
        System.out.println(k3.a); //0
        //k3.c DataType Hayvancık Class oldugu için Class'da olmayan
        k3.mA(); //mA-> HAYVANCIK class method call
        k3.mM(); //mM-> Mammal class meth call

        Mammal m1=new Mammal('$');
        System.out.println(m1.m);//1
        System.out.println(m1.a);//0
        System.out.println(m1.c);//4
      //  m1.d-> Parent Mammal Class child kedi Class'dan variable call edemezzz.'
        m1.mA(); //Hayvancık Class call
        m1.mC(); //Mammal Class call
        m1.mM();//Mammal Class call




    }
}
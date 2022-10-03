package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class ScannerClassDersTekrarı {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

         // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        //System.out.print("adınızı giriniz :");

        //3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        //String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //System.out.println("isim = " + isim);


        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        // Scanner sc = new Scanner(System.in);//1. adım
       // System.out.println("karenin bir kenarını giriniz:");
       // Scanner scan;
       // int kenar=sc.nextInt();
       // //System.out.println("alan: "+kenar*kenar");
       // //  System.out.print("karenin kenarı giriniz : ");// 2. adım
       // //  int kenar=sc.nextInt();//3. adım
       // System.out.println("alan:"+(kenar*kenar)+"çevre:"+(4*kenar));
// /*
//         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
//         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
//         1 seker = 1.7 gr */

        Scanner scan=new Scanner(System.in) ;
        //System.out.println("günlük içtiğiniz çay sayısını giriniz");
        //int çaysayısı=sc.nextInt();
        //System.out.println("şeker sayınızı giriniz");
        //int şekersayısı=sc.nextInt();
        //System.out.println("yıllık şeker tüketiminiz:" + (çaysayısı * şekersayısı * 1.7 * 365) / 1000 + "kg");
       // Scanner sc=new Scanner(System.in) ;
        System.out.println("isminizi giriniz:");
        String isim=scan.next();
        System.out.println("isim = " + isim);
        //char ch=sc.nextLine().charAt (0);
        //System.out.println("isminizin ilk karakteri:" + ch);



    }
}

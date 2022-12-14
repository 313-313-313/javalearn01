package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu = " + str.indexOf('o')); //1
        System.out.println("d nin yeri index nosu = " + str.indexOf("d")); // 3
        System.out.println("D nin yeri index nosu = " + str.indexOf("D")); // -1
       // TRICK --> olmayan karakter indexi sorgulanırsa -1 return eder
        System.out.println("od nin yeri index nosu = " + str.indexOf("od")); // 3

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim="mustafa nizamoğlu";
        System.out.println(isim.indexOf('a')); //4
        System.out.println(isim.lastIndexOf("fa")); //5

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("kafi mikta bir cümle  giriniz : ");

        String cumle = sc.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java icermiyor");
        }else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else System.out.println("Girilen cumlede birden fazla java var");



    }
}

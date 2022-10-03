package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun
        System.out.print("Aldiginiz urunun fiyatini giriniz: ");
        double fiyat = scanner.nextDouble();

        System.out.print("Aldiginiz urunun adetini giriniz: ");
        int adet = scanner.nextInt();

        System.out.print("Musteri kartiniz var mi? Var ise V yok ise Y yaziniz");
        char musteriKarti = scanner.next().toUpperCase().charAt(0);


        //Distaki if musteri kartini kontrol eder
        if(musteriKarti == 'V'){

            //Icteki ifler urun adeti kontrolunu saglar
            if(adet >= 10){
                System.out.println("%20 indirim kazandiniz. Odeyeceginiz tutar = " + (adet*fiyat)*0.8);

            }else{
                System.out.println("%15 indirim kazandiniz. Odeyeceginiz tutar = " + (adet*fiyat)*0.85);
            }
        }else {

            //Icteki ifler urun adeti kontrolunu saglar
            if (adet >= 10) {
                System.out.println("%15 indirim kazandiniz. Odeyeceginiz tutar = " + (adet * fiyat) * 0.85);
            } else {
                System.out.println("%10 indirim kazandiniz. Odeyeceginiz tutar = " + (adet * fiyat) * 0.9);
            }
        }
    }
}
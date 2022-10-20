package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //task-> girilen sayı 17 den küçük ise "kazandınız" büyük ise "kaybettiniz" print eden code create ediniz.
        // do while loop ile print eden code create ediniz.

        Scanner scanner=new Scanner(System.in);


       int sayi= 0;

       do{
          System.out.println("bir sayı giriniz:");
           sayi= scanner.nextInt();
           System.out.println(sayi+"için kazandınız..:)");
           sayi++;

       } while (sayi<=17);

       System.out.println(sayi+ "için kaybettiniz...:( ");

       // int i;
       // do{
       //     System.out.print("Bir sayı giriniz :");
       //     i = scanner.nextInt();
       //     System.out.println(i<17?"Kazandınız":"Kaybettiniz");
       // }while(i!=17);
//

    }
}

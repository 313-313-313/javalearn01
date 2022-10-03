package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int not= sc.nextInt();
        if(not<0||not>100) {
            System.out.println("agam negatif ve 100den büyük not olmaz\nadam gibi bişeyler gir:(\n" + "gelmiim oraya");
        } else if(not<50) { //50den küçük alma kontrolü
            System.out.println("D");
        }else if (not<60) { //60den küçük alma kontrolü
            System.out.println("C");
        }else if(not<80) { //80den küçük alma kontrolü
            System.out.println("B");
        }else { //80 ve 80 den büyük alma
            System.out.println("A");

        }

    }
}

package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str="java bilen sırtı yere gelmez";
        System.out.println(str.substring(10));

        // str datasının son on karakterini yazdırınız.
        System.out.println(str.substring(str.length() - 10));

        //TASK--> str datasının ilk on karakterini print ediniz.
        System.out.println(str.substring(0, 10)); //0,1,2,....,9

        //TASK---> str datasının karakterini print ediniz.
        System.out.println(str.substring(0, 1)); // j

        // girilen dört harfli kelimeyi sondan tersten yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("dört harfli kelime giriniz");

        String kelime= scan.next();
        if (kelime.length()!=4) {
            System.out.println("agam sana dört harfli kelime gir demedik mi:(");
        }else {
            System.out.print(kelime.substring(kelime.length() - 1));//e
            System.out.print(kelime.substring(2,3));//l
            System.out.print(kelime.substring(1,2));//a
            System.out.print(kelime.substring(0,1));//k


        }


    }
}

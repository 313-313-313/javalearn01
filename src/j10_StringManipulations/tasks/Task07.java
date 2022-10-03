package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
     /*   Girilen string içindeki istenen indexteki karakteri print eden code create ediniz.*/

        Scanner scan=new Scanner((System.in));

        System.out.println("Bir metin giriniz");

        String str =scan.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=scan.nextInt();
        if (str.length()>index){
            // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");

    }
}

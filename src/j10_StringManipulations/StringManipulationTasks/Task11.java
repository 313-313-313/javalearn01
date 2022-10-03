package j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");//sümeyra yolcu
        String a=sc.nextLine();
        String ad=a.substring(0,a.indexOf(" "));
        String soyad=a.substring(a.indexOf(" ")+1);
        System.out.println("Adınız : "+ad.toUpperCase()+"\nSoyadınız : "+soyad.toUpperCase());


    }
}

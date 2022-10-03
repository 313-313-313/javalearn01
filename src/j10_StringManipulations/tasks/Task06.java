package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
 /* Girilen Stringin son karakterini silen code create ediniz.
  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String s=scan.next();

        System.out.println(s.substring(0,s.length()-1));

    }
}

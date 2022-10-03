package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner sc = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=sc.nextLine();
        String bosluk=" ";
        System.out.println(kelime.contains(" ") ? "boşluk var" : "boşluk yok");

    }
}


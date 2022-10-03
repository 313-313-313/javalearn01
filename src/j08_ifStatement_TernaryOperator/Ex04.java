package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
          /*
        TASK-> Girilen bir karakterin harf olup olmadığını kontrol eden code creat ediniz...
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("bir karakter giriniz:");

        char krktr=scan.nextLine().charAt(0);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("girdiğiniz karakter harftir:");
        }else System.out.println("girdiğiniz harf karakter değildir:");
    }





    }


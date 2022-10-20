package j12_Loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        //girilen iki sayı arasındaki çift sayıları yan yana print eden code create ediniz.
        Scanner scanner=new Scanner(System.in);

        System.out.println("sayi1 giriniz:");
        int sayi1= scanner.nextInt();

        System.out.println("sayi2 giriniz:");
        int sayi2=scanner.nextInt();

        if(sayi1<sayi2){

            for(int i=sayi1; i<sayi2; i++){

                if(i%2==0) {
                    System.out.print(i+" ");
                }
            }
        }


    }
}
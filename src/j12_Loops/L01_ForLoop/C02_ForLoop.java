package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //task-> girilen sayıdan 100e kadar 4un katı olan tam sayıları print eden code create ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz:");
        int sayı = scanner.nextInt();


        if(sayı>100){
            System.out.println("sayıyı 100den küçük giriniz");

        }else{
            for(int i= sayı; i<100; i++){
                if(i%4==0){
                    System.out.print(i+ " ");
                }
            }
        }


    }
}

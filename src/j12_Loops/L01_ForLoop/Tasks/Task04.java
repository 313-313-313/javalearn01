package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //girilen iki sayı arasındaki çift sayıları print eden code create ediniz.
        Scanner scanner=new Scanner(System.in);

        System.out.println("sayi1 giriniz:");
        int sayi1=scanner.nextInt();

        System.out.println("sayi2 giriniz:");
        int sayi2=scanner.nextInt();


        if(sayi1<sayi2){
            for(int i= sayi1; i<sayi2; i++){
                if(i%2==0){ // döngü içindeki sayıların çiftlik kontrolü
                    System.out.println(i+ " ");

                }
            }

        } else System.out.println("hatalı giriş yatınız");

    } //main dışı


    }

    /* derste cüneyt beyin çözümü

    for (int i=(a<b?a:b);i<=(a>b?a:b);i++ ){
            System.out.print(i%2==0?i:" ");
        }

     */


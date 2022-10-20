package j12_Loops.Tekrarlarımmm;

import java.util.Scanner;

public class Task04Tekrar {
    public static void main(String[] args) {
        // girilen iki sayı arasındaki tek sayıları yan yana print eden code create ediniz

        Scanner scanner=new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int x=scanner.nextInt();

        System.out.println("bir sayı giriniz");
        int y=scanner.nextInt();

        if (x<y){

            for(int i=x;i<y;i++){

                if(i%2==1) { // döngü içindeki sayıların teklik kontrolü

                    System.out.println(i+" ");
            }
        }

    }
}
}

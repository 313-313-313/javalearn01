package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;



public class Tas10_Nested {
    public static void main(String[] args) {

        /*
        Girilen bir ifadenin istenen harf sayısını print eden code create ediniz.

        input: selam javacanlar
        output: a sayısı : 3

         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir cümle giriniz");
        String str= scanner.nextLine();

        System.out.println("Bir harf giriniz");
        char harf=scanner.next().toLowerCase().charAt(0);

        int harfSayisi=0; //ilk değer sıfır girildiki saymaya etki etmesin
        for( int i=0 ; i<=str.length()-1 ; i++ ) {
            if(harf==(str.charAt(i))) {
                harfSayisi++;
            }
        }
        System.out.println(harfSayisi);

    }
}

package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_Faktöriyel {
    public static void main(String[] args) {
        /*
        Task--> Girilen sayının faktöriyelini hesaplayan method create ediniz.
        sayi!=1*2*...*sayi
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println(faktöriyel(sayi)); //int parametreli method call

    } //main dışı

    private static int faktöriyel(int sayi) {
        int faktöriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktöriyel *= i;
        }
        return faktöriyel;
    }
}








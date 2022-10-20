package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task-> Girilen beş sayının 10 ile 20 arası hariç diğerlerinin toplamını hesap eden code create ediniz

         */
        Scanner scanner=new Scanner(System.in);
        int toplam=0; // ilk değeri sıfır olan yani toplama etki etmeyecek bir variable oluşturuldu.

        for(int i=1; i<=5; i++) {
            System.out.println(i + ". sayıyı giriniz:");
            int sayı= scanner.nextInt();

            if(sayı>=20 || sayı<=10) {
                toplam+=sayı;

            } //if sonu

        } //for sonu

        System.out.println("girdiğiniz sayının istenen şartta toplamı:"+ toplam);


    }
}

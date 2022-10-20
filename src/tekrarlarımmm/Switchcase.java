package tekrarlarımmm;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("gun no giriniz : ");

        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1:

                System.out.println("pazar");



            case 2:

                System.out.println("pazartesi");



            case 3:

                System.out.println("sali");



            case 4:

                System.out.println("carsamba");



            case 5:

                System.out.println("persembe");



            case 6:

                System.out.println("cuma");



            case 7:

                System.out.println("cumartesi");

                break;

            default:

                System.out.println("hata");

        }
    }
}

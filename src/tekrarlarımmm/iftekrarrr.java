package tekrarlarımmm;

import java.util.Scanner;

public class iftekrarrr {
    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi giriniz : ");

        int sayi = scan.nextInt();



        if (sayi % 2 == 0) {

            if (sayi % 3 == 0) {

                System.out.println("hem 2 ye hem 3 e bolunur");

            } else {

                System.out.println("sadece 2 ye bolunur");

            }

        } else {

            if (sayi % 3 == 0) {

                System.out.println("sadece 3 e bolunur");

            } else

                System.out.println("3 e bolunmez");

        }

    }
}



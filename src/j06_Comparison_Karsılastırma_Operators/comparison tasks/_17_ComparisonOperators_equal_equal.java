package j06_Comparison_Karsılastırma_Operators.comparison;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayı giriniz:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println(num1 == num2); // EŞİT GİRİNCE TRUE, EŞİT DEĞİLSE FALSE VERDİ


    }
}

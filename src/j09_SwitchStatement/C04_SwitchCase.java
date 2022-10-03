package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        //TASK Girilen ayın hangi mevsim olduğunu ifade eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir ay numarası giriniz  : ");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            case 1:
            case 2:
            case 12:

                System.out.println("girilen ay KIŞ");
                break;
            case 3:
            case 4:
            case 5:

                System.out.println("girilen AY BAHAR");
                break;
            case 6:
            case 7:
            case 8:

                System.out.println("girilen ay YAZ");
                break;
            case 9:
            case 10:
            case 11:

                System.out.println("girilen ay YAZ");
                break;
            default:
                System.out.println("GİRİLEN RAKAM AY BELİRTMEZ :( ");
        }
    }
}

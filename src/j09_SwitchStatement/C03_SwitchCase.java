package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        //TASK Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println(" Ayların kaç çektiğini anlamak için ay numalarını giriniz:");
        int rakam = scan.nextInt();
        switch (rakam) {
            case 1:
                System.out.println("OCAK 31 ");
                break;
            case 2:
                System.out.println("ŞUBAT 28 (Artık yıllarda 29)");
                break;
            case 3:
                System.out.println("MART 31");
                break;
            case 4:
                System.out.println("NİSAN 30");
                break;
            case 5:
                System.out.println("MAYIS 31");
                break;
            case 6:
                System.out.println("HAZİRAN 30");
                break;
            case 7:
                System.out.println("TEMMUZ 31");
                break;
            case 8:
                System.out.println("AĞUSTOS 31");
                break;
            case 9:
                System.out.println("EYLÜL 30");
                break;
            case 10:
                System.out.println(" EKİM 31");
                break;
            case 11:
                System.out.println("KASIM 30");
                break;
            case 12:
                System.out.println("ARALIK 31");
                break;
            default:
                System.out.println("girilen rakam bir AY belirtmez:");
                break;
        }
        //2. YOL
        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.print("yılınızı giriniz : ");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girilen ay subat ayı 29 gün içerir ");
                } else System.out.println("girilen ay subat ayı 28 gün içerir");
                break;
            default:
                System.out.println("adam gibi bişey gir :( ");
        }


    }
}



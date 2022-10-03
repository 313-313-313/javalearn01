package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        //TASK Kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println(" Herhangi bir ay için rakam giriniz:");
        int rakam = scan.nextInt();
        switch (rakam) {
            case 1:
                System.out.println("girilen ay OCAK");
                break;
            case 2:
                System.out.println("girilen rakam ŞUBAT");
                break;
            case 3:
                System.out.println("girilen rakam MART");
                break;
            case 4:
                System.out.println("girilen rakam NİSAN");
                break;
            case 5:
                System.out.println("girilen rakam MAYIS");
                break;
            case 6:
                System.out.println("girilen rakam HAZİRAN");
                break;
            case 7:
                System.out.println("girilen rakam TEMMUZ");
                break;
            case 8:
                System.out.println("girilen rakam AĞUSTOS");
                break;
            case 9:
                System.out.println("girilen rakam EYLÜL");
                break;
            case 10:
                System.out.println("girilen rakam EKİM");
                break;
            case 11:
                System.out.println("girilen rakam KASIM");
                break;
            case 12:
                System.out.println("girilen rakam ARALIK");
                break;
            default:
                System.out.println("girilen rakam bir AY belirtmez:");
                break;
        }
    }
}

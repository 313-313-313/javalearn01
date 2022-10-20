package j13_Break_Continue_Statement;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
//TASK--> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("PİN giriniz:");

        String dogruPin= "JavaCAN";

        String pin= scanner.nextLine();
        int girisHakki=3;
        while (true){
            System.out.println("PİN giriniz");
            String agaPin=scanner.nextLine();
            if(agaPin.equals(dogruPin)){
                System.out.println("başarılı");
                break;

            }else {
                System.out.println("tekrar deneyiniz");
                girisHakki--;
                System.out.println("kalan hakkınız"+ girisHakki);
                if(girisHakki==0) {
                    System.out.println("hakkınız bitti");
                    break;
                }
            }
        }
    }
}

package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop -> önce sart kontrol edilir true alınırsa body action çalışır.
        do-While loop-> önce body action çalışır sonra şart kontrol edilir. Sart true ise döngü devam eder.
        Şart false ise döngü kırılır ve döngüden sonraki ilk satır calısır.

        do-while loop-> game app de daha çok kullanılır.

        TRICK: While loop şart saglanmazsa hiç çalışmayabilir ama do While sart sağlasın sağlamasın en az bir kez çalışır.

         */

    int yas=31;

        while (yas<33){
            System.out.println("agam yas"+ yas+" gayet basarılı:) ");
            System.out.println("while body action...");
            yas++;

    }
        do {
            System.out.println("agam yas 33 gayet basarılı:) ");
            System.out.println("do while body action ");
            yas++;

        } while(yas<33);

    }
}

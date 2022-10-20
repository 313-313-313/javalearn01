package j12_Loops.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Eger bir döngünün badisinde başka bir döngü bulunuyorsa bu tür döngülere nested*loop->içiçe döngü denir
        İç döngü dış döngünün her adımında tekrar çalışır.
        iç içe döngülerde en içteki döngü en önce çalışır.
      */
        for(int apt=0;apt<=10;apt++){
            System.out.println("apt döngü:"+apt);

            for (int daire=1;daire<6;daire++){
                System.out.println("apt "+apt+ "için daire döngü dire: "+daire );;
            }
        }

    }
}

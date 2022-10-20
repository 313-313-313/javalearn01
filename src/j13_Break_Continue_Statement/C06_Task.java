package j13_Break_Continue_Statement;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden

        Scanner scanner=new Scanner(System.in);
        System.out.println("bişeyler yazınız:");

        String bişeyler=scanner.nextLine();
        int aSayısı=0;
        for(int i=0; i<bişeyler.length(); i++) {
            if(bişeyler.charAt(i)=='a') {
                aSayısı++;
            } else if (bişeyler.charAt(i)=='c') {
                break;
            }
            System.out.println("döngüde işleme gire karakterler"+bişeyler.charAt(i));

    }
        System.out.println("a sayısı"+aSayısı+"tane");
}
}

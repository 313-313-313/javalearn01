package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(m) : ");

        double boy =scan.nextDouble();
        System.out.print("Kilonuzu yazınız (kg) : ");
        double kilo = scan.nextDouble();
        double bmi = kilo / (boy*boy);
        if (bmi<=20) {
            System.out.println("zayıf");
        }else if (bmi <= 25) {
            System.out.println("Normal ");
        }else if (bmi <= 30) {
            System.out.println("Sisman");
        }else {
            System.out.println("Obez ");
        }
    }

}

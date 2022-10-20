package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task  girilen int array elemanları toplamını print eden code create ediniz..

        Scanner scanner=new Scanner(System.in);

        System.out.println(" agam kaç elemanlı array istirsen ");

       // int arrBoyut=scanner.nextInt();
        int arr[]=new int[scanner.nextInt()];

        for(int i=0;i<arr.length;i++) {
            System.out.println(i+".index elemanını giriniz");
            arr[i]=scanner.nextInt();
        }
        System.out.println("agam istediğin array:"+ Arrays.toString(arr));

        int arrToplam=0; //local variable

        for( int i=0;i<arr.length;i++) {
            arrToplam+=arr[i];

        }
        System.out.println("array toplamları:"+ arrToplam);


    }
}

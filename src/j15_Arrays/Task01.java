package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> Kullanıcıdan alınan değerlerle bir int array elemanlarını buyukten kucuge prnt eden code create ediniz.


        Scanner scanner=new Scanner(System.in);

        System.out.println(" agam kaç elemanlı array istirsen ");

        int arrBoyut=scanner.nextInt();
        int arr[]=new int[arrBoyut];

        for(int i=0;i<arrBoyut;i++) {
            System.out.println(i+".index elemanını giriniz");
            arr[i]=scanner.nextInt();
        }
        System.out.println("agam istediğin array:"+ Arrays.toString(arr));
        Arrays.sort(arr); // arr k->b sortingen yapıldı :)
         for (int i=arr.length-1; i>=0;i--) { //en büyük sondaki elemandan başlar döngü
             System.out.print(arr[i] + " ");


         }
    }
}

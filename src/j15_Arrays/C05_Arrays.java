package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //ARRAY COPY.. copy0f(arr,newlength); -->

        int sayi[]={63,21,47,27,35,12,36,31,46,24};

        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan 5 eleman kopyalanan yeni arr:" +Arrays.toString(yeniArr)); //[63, 21, 47, 27, 35]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,8);
        System.out.println("sayı arr den özel kopyalanan baska Arr:" + Arrays.toString(baskaArr)); //[27, 35, 12, 36, 31]

        //Array in belirli bir eleman ile update (set) etme.. fill(arr, value);

        Arrays.fill(sayi,99); //
        System.out.println("sayı arr ı 99 ile fullenmiş hali :"+ Arrays.toString(sayi)); //[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);

        System.out.println("sayı arr i 3 ile 7 index arası 33 ile fullenmiş hali"+ Arrays.toString(sayi)); // [99, 99, 99, 33, 33, 33, 33, 99, 99, 99]



    }
}

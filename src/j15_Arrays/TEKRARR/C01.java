package j15_Arrays.TEKRARR;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
       int sayıArr[]=new int[5];

        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;

        System.out.println(sayıArr.length);

        String isimArr[]={"maho","eno","cebo","nazo","özo"};

        System.out.println(isimArr.length);
        System.out.println(isimArr[isimArr.length - 1]);

        //ARRAY ELEMANLARI PRİNT ETME
        for(int i=0; i< isimArr.length; i++) {
            System.out.print(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr=" +isimArr); //isimArr=[Ljava.lang.String;@2c6a3f77 referans değeri

        System.out.println(Arrays.toString(isimArr));

        //sayıArr elemanlarından değeri tek olanları print eden code create ediniz.

        for(int i=0;i< sayıArr.length;i++){
            if(sayıArr[i]%2==1) {
                System.out.println(sayıArr[i]+" ");
            }
        }
        // sayıArr elemanlarından değeri çift olanları print eden code


    }
}

package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        //get(); --> listte istenen index  elemanı return eder / arr[3]-> arr nin 3. indexdeki elemanı ver

        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir.get(1) = " + listSehir.get(1)); //listSehir.get(1) = LosAngeles
        System.out.println("listSehir.get(1) = " + listSehir.get(11)); //olmayan eleman RTE verir
    }
}

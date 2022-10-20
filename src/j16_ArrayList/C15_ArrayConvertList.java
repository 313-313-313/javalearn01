package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //King of TRICK -> Arraydan çevrilen List array kaynaklı olduğu için Array davranışı gösterir
        //Boyut sabitti dolayısıyla remove add method çalışmaz

        String arrJavacan[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String> listJavaTar= Arrays.asList(arrJavacan); //arrJavaCan değerleri list eleman
        System.out.println("listJavaTar = " + listJavaTar); //listJavaTar = [Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size()); //4
       // listJavaTar.add("sefilCan Haluk"); //array a eleman eklenmez :(
                                            //RTE -> UnsupportedOperationException
        // KİNG OF TRICK -> list data type ArrayList tanımlanırsa RTE vermez.
        //Kaynağı array de olsa list davranır boyut esnekliği yapar.

        ArrayList<String> lisJavaTar1= new ArrayList<>(Arrays.asList(arrJavacan));
        lisJavaTar1.add("sefil haluk");
        System.out.println("lisJavaTar1 = " + lisJavaTar1); ;//[Akif, Gamze, Musty, SevdeNur, sefil haluk]


    }
}

package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {/*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
     //Lambda->Stream API
        System.out.println("\n   ***   ");
        ciftKareMaxPrint(sayi);

    } //MAİN sonu
    //Task: List'in cift elemanlarının karelerinin en buyugunu print ediniz.
    public static void ciftKareMaxPrint(List<Integer>sayi){
   // Optional<Integer> maxEleman= sayi.
   //            stream(). //list elemanları akısa alındı
   //            filter(C01_LambdaExpression::ciftMi). //akıstaki list elemanları cift filtrelendi
   //            map(t->t*t). //filtrelenen cift akıs elemanları karesi ile update edildi
   //            reduce(Math::max);//cift filtrelenen ve karesi alınan akıs elemanları maksimum elemana göre reduce-> azaltıldı.
   //    System.out.println(maxEleman);
        System.out.println(sayi.
                stream(). //list elemanları akısa alındı
                filter(C01_LambdaExpression::ciftMi). //akıstaki cift elemanlar filtrelendi
                map(t -> t * t). //filtrelenen cift akıs elemanları karesi ile update edildi
              //  reduce(Math::max));
                reduce(Integer::max));//spesifik class daha hızlı calısır



    }
}

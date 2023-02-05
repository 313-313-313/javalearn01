package j38_Debugger;

public class C02_Debıgger01 {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir..


İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
    public static void main(String[] args) {

    }

    private static void method01() {
        System.out.println("  ***  method01 çalışıyro   ***   ");
        for (int i=1 ; i< =10; i++){
            System.out.println(i+" ");
        }
        System.out.println();

        System.out.println("  ***  method02 call ediliyor   ***   ");

        method02();
        System.out.println("  ***  method03 call ediliyor   ***   ");
        method03();
    }

    private static void method03() {
    }

    private static void method02() {
    }
}

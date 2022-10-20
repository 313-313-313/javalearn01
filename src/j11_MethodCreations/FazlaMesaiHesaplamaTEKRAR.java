package j11_MethodCreations;

import java.util.Scanner;

public class FazlaMesaiHesaplamaTEKRAR {
    public static void main(String[] args)
 {

/*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0 */


        Scanner scanner=new Scanner(System.in);
        System.out.println("mesai başlama saatinizi yazınız:");
        double start= scanner.nextDouble();

        System.out.println("mesai bitiş saatinizi yazınız:");
        double finish=scanner.nextDouble();

        System.out.println("mesai saat ücretinizi yazınız:");
        double saatUcreti=scanner.nextDouble();

        System.out.println("fazla mesai ücret katsayısını yazınız:");
        double ucretKatsayısı=scanner.nextDouble();

        ucretHesapla(9.0,20.0,40.0,1.8);


    } //main dışı

    private static double ucretHesapla(double baslama,double bitis, double saatUcreti, double ucretKatsayısı)
    {
        double yevmiye1=(17-baslama)*(saatUcreti);
        double yevmiye2=(bitis-17)*saatUcreti*ucretKatsayısı;
        return yevmiye1+yevmiye2;


    }




}

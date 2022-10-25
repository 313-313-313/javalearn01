package j20_PassByValue_Pass_By_Reference;

public class C02_PassByValue {
    public static void main(String[] args) {
        // //  task -> verilen fiyat için %11 %22 ve %33  indirimlim  fiyatı print eden methodlar  create ediniz.
        double fiyat= 100;

        System.out.println("method call öncesi fiyat değeri ="+ fiyat); //100
        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println("method call sonrası fiyat değeri ="+ fiyat); //100

    }//main sonu
    private static  double indir11(double fiyat) {

        return fiyat*=0.89;
    }
    private static  double indir22(double fiyat) {

        return fiyat*=0.78;
}
    private static  double indir33(double fiyat) {

        return fiyat *= 0.67;

    }}

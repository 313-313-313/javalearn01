package day01;

public class Q07_Converting {
    public static void main(String[] args) {
        /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/
        int gallon=1000;
        double Liters=gallon*3.785;
        String result1=gallon+"gallon degeri"+Liters+"litredir";
        System.out.println("result1 = " + result1);

    double litre=100;
    double galon=litre/3.785;
    String result2 = litre + " litre degeri " + galon + " galona esittir";
    System.out.println("result2 = " + result2);
    }
}

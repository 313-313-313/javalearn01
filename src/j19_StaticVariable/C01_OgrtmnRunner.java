package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

        C01_Ogrtmn hc1=new C01_Ogrtmn("cüneyt",11);
        System.out.println(hc1.tecrube); //11
        System.out.println("hc1.isim = " + hc1.isim); //cuneyt
       // hc1.okul="kabadaş"; //"kabatas" ; // static var obj ile call edilmez.
        System.out.println("hc1.okul = " + hc1.okul);

        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";

        C01_Ogrtmn hc2=new C01_Ogrtmn("bekir",7);
        System.out.println("hc2 = " + hc2.tecrube); //7
        System.out.println("hc2.isim = " + hc2.isim);//bekir
      //  hc2.okul="kabatas"";
        System.out.println("hc2.okul = " + hc2.okul);//

        C01_Ogrtmn hc3=new C01_Ogrtmn("nazım",13);
        System.out.println(hc3.tecrube); //13
        System.out.println("hc3.isim = " + hc3.isim); //nazım
        //hc3.okul="gabatas";
        System.out.println("hc3.okul = " + hc3.okul);
        hc1.evlilikYıldonumu(); // obje ile non static meth call
      C01_Ogrtmn.maasHesapla();// ClassName ile static method call edildi.
        hc2.maasHesapla();// obj ile static meth call --> BAD PRACTİCE
    }

}

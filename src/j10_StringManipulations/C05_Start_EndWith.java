package j10_StringManipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));
        System.out.println(sehir.startsWith("is"));
        System.out.println(sehir.startsWith("s"));

        sehir.startsWith("a",3);
        sehir.startsWith("a",3);
        sehir.startsWith("b",6);
        sehir.startsWith("l",7);

        System.out.println(sehir.endsWith("l"));
        System.out.println(sehir.endsWith("bul"));
        System.out.println(sehir.endsWith("bu"));

        String str="bul";
        System.out.println(sehir.endsWith(str));

        int yas=48;
       // System.out.println(sehir.endsWith(yas)); // CTE

        //TASK--> Girilen e-mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gail.com içeriyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code creat ediniz.

    }
}

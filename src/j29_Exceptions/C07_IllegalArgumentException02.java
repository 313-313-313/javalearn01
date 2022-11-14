package j29_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {
        try {
            System.out.println("Agam try blok başından selam :)");
            hata();
            System.out.println("Agam try blok sonundan selam :)");

        }catch (IllegalArgumentException e){

            System.out.println("Agam catch blok başından selam :)");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Agam catch blok sonundan selam :)");


        }
        System.out.println("Agam sorun handle edildi DEWAMKEE:)"); // BU KOD ÇALIŞMIŞSA PR SORUNSUZ KIRILMADAN RUN OLMUŞTUR




    }//main sonu
    public static void hata(){
        throw new IllegalArgumentException("Agam nettin yine hata :( ");
    }
}

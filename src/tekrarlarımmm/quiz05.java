package tekrarlarımmm;

import static j11_MethodCreations.denemeee.toplama;

public class quiz05 {

    public static void main(String[] args) {

        convert("kilogram",2);

    }



    public static void convert(String birim, int miktar) {

        switch(birim) {

            case "saat":

                System.out.println(miktar*60*60);

                break;

            case "mil":

                System.out.println(miktar*1.6);

                break;

            case "kilogram":

                System.out.println(miktar*1000);

                break;

            default:

                System.out.println("saat, mil ve kilogram dışında bir birim girmeyiniz");

        }}}
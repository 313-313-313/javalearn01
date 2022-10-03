package j10_StringManipulations.StringManipulationTasks;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String s10= "apple";
        System.out.println("s10.equalsIgnoreCase(\"apple\") = " + s10.equalsIgnoreCase("apple"));


        String s="Apple";
        System.out.println(s.equalsIgnoreCase("apple"));


        String s1 = "apple";
        if (s1.equalsIgnoreCase("apple")) {
            System.out.println(s1+" apple'a eşit");//apple apple'a eşit
        }else System.out.println(s1+" apple'a eşit değil");

        String c="apple";
        System.out.println(c.equalsIgnoreCase("apple"));
    }
}

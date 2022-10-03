package j10_StringManipulations;

public class C01_Cocatenation {
    public static void main(String[] args) {
        /**Concat methodu içine aldığı string variable ı çalıştığı stringin sonuna ekler...
         *Java da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */
        String name="Nur";
        String meslek="Qa tester";
        System.out.println(name.concat(meslek)); // Nur Qa tester
        System.out.println(name);
        // TASK--> String methotları variable gecici değişiklik yapar
        // Ama değişken atama yapılırsa kalıcı değişir
        name=meslek.concat(name);
        System.out.println("name = " + name);


        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder



    }
}

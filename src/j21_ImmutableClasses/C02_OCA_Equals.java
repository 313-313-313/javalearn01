package j21_ImmutableClasses;

public class C02_OCA_Equals {

    public static void main(String[] args) {
        String a = ""; // immutable class variable
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") { //sart saglamaz if çalışmaz -> a referansı "2cfalse" atama olmadığı için ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        String b="2cfalse";
        if(a==b) {
            System.out.println("ahanda referansları aynı havuzda a ve b eşit ==");
        }
    }
}
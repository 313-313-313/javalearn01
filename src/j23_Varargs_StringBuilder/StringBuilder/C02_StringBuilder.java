package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder obj create etme ...
        //1. yol
        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16

        sb1.append("JAVATAR"); //javatar sb1 eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16

        sb1.append(" selam ").append(" olsun ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1); //sb1 = JAVATAR selam  olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity()); //34

        sb1.append("basarı gayrete asıktır:)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity()); //70

    }
}

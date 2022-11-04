package j26_Inheritance.task01;

public class Runner {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.mesaj); //Agam'a A classtan hürmetler // a obj ile static
        System.out.println(A.mesaj);

        B b=new B();
        System.out.println(b.mesaj); //static variable inheritance da ClassName olmadan call edilir
    }
}

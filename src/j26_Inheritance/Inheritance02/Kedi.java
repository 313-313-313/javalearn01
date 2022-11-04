package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal { //Mammal parent class Mammal child-torun
/*
Chil class obj olmadan parent class variable ve methotlara ulaşabilir.
 */
    public Kedi(){
        super();
        System.out.println("Agam ahan da kedi p'siz cons...");

    }
    public Kedi(String str){ //parametreli cons.
        this(); //Bu class ın parametresiz cons'udur.
        System.out.println(super.c);
        System.out.println("Agam ahan da kedi p'siz cons...");

    }
    int c=2;
    int d=5;

    @Override
    public void mC() { //Mammal parentten ezen method
        System.out.println("mC-> Kedi class meth call");
    }
} //Class sonu


package j11_MethodCreations;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name="haluk";
        System.out.println("car car " + name);
        C04_MethodDepo.gecmeNotu(24); //diğer depo classtan class name ile method call edildi.
        C04_MethodDepo.topla(3,5); //8 diğer köy amelesi

      /* farklı classtan method call etmek için ..
      1. method static--1 gökteki güneşş gibi
      2. Classname.methodName() şeklinde call edilir.
      aynı classdaki method doğrudan methodName ile call edilir.*/

        selamVer(); //aynı classtan methodName ile call edildi


    } //main dışı
 public static  void  selamVer(){
     System.out.println("agam selamlar devamkee");
 }

    }


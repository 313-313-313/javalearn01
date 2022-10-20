package j11_MethodCreations;

public class C04_MethodDepo {

    //main method olmayacak -->motor olmayacak--> malzeme taşıyon römork
    /* her class da main method mecburiyeti yoktur belirli aksiyonalara özel classlar tanımlanabilir*/

    public static void gecmeNotu(int not){

        if(not>=85){
            System.out.println("agam tebrik çok basarılısın");
        }else if(not>=70){
            System.out.println("agam basarılı");
        }else if(not>=60){
            System.out.println("agam sadece gectin");
        }else if(not>=45){
            System.out.println("agam ucuz yırttın");
        }else System.out.println("agam fena caktın");


    }
public static void topla(int a, int b){
    System.out.println(a+b);
}

}

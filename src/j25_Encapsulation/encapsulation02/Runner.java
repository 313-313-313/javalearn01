package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("umit","K",33,"umitK33"); //obj
        obj1.ad="Güzel insan Umit Bey";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyad = " + obj1.soyad);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());
    }
}

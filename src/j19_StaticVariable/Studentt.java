package j19_StaticVariable;

public class Studentt {

    int id;

    public  Studentt() {

        id++;
        System.out.println("id = " + id);
    }

    public static void main(String[] args) {
        Studentt s1=new Studentt();
        Studentt s2=new Studentt();
    }
}

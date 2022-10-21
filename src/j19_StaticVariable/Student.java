package j19_StaticVariable;

public class Student {

    static  int a;
    int b;

    public Student() {
        a+=3;
        b++;
    }
    public  static  int kareAl() {
        return  a*a;

    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        int c=s1.kareAl();

        System.out.println("-a"+c+"-b"+s2.b);
    }

}

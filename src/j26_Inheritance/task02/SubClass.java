package j26_Inheritance.task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
       SubClass obj=new SubClass();
       obj.my_method();
    }
    int num=10;
    public void my_method(){

        goster(); //sub class call
        super.goster(); //superClass call
        System.out.println("sub class num="+num);
        System.out.println("SuperClass num="+super.num);
    }

    @Override
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }
}

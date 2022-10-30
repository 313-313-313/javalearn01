package j23_Varargs_StringBuilder.Varargs;

public class ML_Varargs02 {
    void  m1(int a,int... b){
        System.out.println(b.length);
    }
    void  m1(char c,String... d){
        System.out.println(d.length);
    }

    public static void main(String[] args) {
        ML_Varargs02 vrg=new ML_Varargs02();
        vrg.m1(3,4,5,6,7);

        vrg.m1('d',75,80,90,98);
        vrg.m1('d',"Hello");
    }
}

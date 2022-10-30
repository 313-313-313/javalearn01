package j23_Varargs_StringBuilder;

public class ML_Varargs {
    void o1(int... b){
        System.out.println(b.length);
    }
    void o1(char c,int... d) {
        System.out.println(d[0]);
    }
    public static  void main(String[] args){
        ML_Varargs vrg=new ML_Varargs();
        vrg.o1(1,2,3,4,5,6,7);

    }




}

package tekrarlarımmm;

public class ThisKeyword {

    public static void main(String[] args) {
        String a = "";

        a+=5;

        a+='c';

        a+=true;



        if(a=="5ctrue") {

            System.out.println(a + "<==");

        }

        if(a.equals("5ctrue")) {

            System.out.println("==>" + a);

        }
    }
}

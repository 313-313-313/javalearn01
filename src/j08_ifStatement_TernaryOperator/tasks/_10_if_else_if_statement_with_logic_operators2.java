package j08_ifStatement_TernaryOperator.tasks;

public class _10_if_else_if_statement_with_logic_operators2 {

    public static void main(String[] args) {

/* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/
        //1. Adim -> 60 değerinde bir int oluşturun


        int myInt = 60;



        //2. Adim -> Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın

        // - + * / %
        // myInt % 9 == 0
        // myInt % 5 == 0

        if ((myInt % 9 == 0) && (myInt % 5 == 0)){
            System.out.println("Able to divide by 9 and 5");
        }



        //3. Adim -> Eğer int 4'e bölününce kalan 0 ise ve 15'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        // myInt % 4 == 0
        // myInt % 15 == 0

        if ((myInt % 4 == 0) && (myInt % 15 == 0)){
            System.out.println("Able to divide by 4 and 15");
        }













    }
}

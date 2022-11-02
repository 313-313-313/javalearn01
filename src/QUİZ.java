import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QUİZ {
    public static void main(String[] args) {

        System.out.println(boolMethod(true)); //0
        System.out.println(boolMethod(true,false)); //1
        System.out.println(boolMethod(true,false,true)); //2
        System.out.println(boolMethod(true,false,false,false)); //3
    }

    public static int boolMethod(boolean b1, boolean...b2) {

        return b2.length;

    }



    }











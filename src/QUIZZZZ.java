import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QUIZZZZ {
    public static void main(String[] args) {

        int[][] m = {{3, 2}, {0, 1, 2}};

        System.out.println(b(m));

    }



    public static int b(int[][] b) {

        int sonuc = 0;

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                sonuc += b[i][j];

            }

        }

        return sonuc;



    }}
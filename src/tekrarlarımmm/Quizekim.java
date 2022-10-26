package tekrarlarımmm;

import java.util.Arrays;

public class Quizekim {
    public static void main(String[] args) {

        int[][] m = {{3, 2, 1}, {0, 1, 2}};



        for (int i = 0; i < m.length ; i++) {

            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j]%2 ==0){

                    m[i][j]= m[i][j] +2;

                }else {

                    m[i][j]= m[i][j] *2;

                }

            }

        }

        System.out.println(Arrays.deepToString(m));

    }
}

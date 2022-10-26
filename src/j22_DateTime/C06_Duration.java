package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(0,0);
        LocalTime ogle=LocalTime.of(13,30);

        Duration fark=Duration.between(gece,ogle);
        System.out.println("fark = " + fark);


    }
}

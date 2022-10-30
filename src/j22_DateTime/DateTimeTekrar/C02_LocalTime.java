package j22_DateTime.DateTimeTekrar;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime suAn=LocalTime.now(); //anlık zaman bilgisi atanır
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());
        System.out.println("suAn.getNano() = " + suAn.getNano());

        LocalTime time1=LocalTime.of(13,43,34); //özel bir zamana gidildi //Local Time tipinde adı time 1 olan local time classından of methodu ile ...
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90)); //15:13:34
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150)); //16:13:34
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23)); //14:43:34
        System.out.println("time1.minusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2)); //14:03:34

        LocalTime forBaşı=LocalTime.now();
        System.out.println("forBaşı = " + forBaşı.getNano());
        int sayı=0;
        for (int i=0; i<100000; i++) {
            sayı +=i;

        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu = " + forSonu.getNano());
        System.out.println(forSonu.getNano() - forBaşı.getNano());
    }
}

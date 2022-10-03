package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk kelimenizi yaziniz");
        String kelime1=scan.nextLine();
        System.out.println("Lutfen ikinci kelimenizi yaziniz");
        String kelime2=scan.nextLine();

        if (kelime1.length()%2==0){
            System.out.println(kelime1.substring(0,kelime1.length()/2)+kelime2+kelime1.substring(kelime1.length()/2));
        }else
            System.out.println("2. kelime, 1.kelimenin içine yerlestirilemez");

    }
}


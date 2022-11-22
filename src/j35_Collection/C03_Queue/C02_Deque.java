package j35_Collection.C03_Queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque: Double Ended Queue -> Queue'larda FİFO DEque'larda hem FİFO hem LİFO geçerli
        LİFO-> last in first out
         */
        Deque<String>dq1=new LinkedList<>(Arrays.asList("Küşleme","önkol","böbrek yatağı","ezme","haydari"));
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari]
        dq1.add("humus");
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari, humus]

        System.out.println("dq1.getFirst() = " + dq1.getFirst()); //dq1.getFirst() = Küşleme
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari, humus]

        System.out.println("dq1.getLast() = " + dq1.getLast()); //dq1.getLast() = humus
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari, humus]

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); //dq1.peekFirst() = Küşleme
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari, humus]

        System.out.println("dq1.peekLast() = " + dq1.peekLast()); //dq1.peekLast() = humus
        System.out.println("dq1 = " + dq1); //dq1 = [Küşleme, önkol, böbrek yatağı, ezme, haydari, humus]
        /*
        ahan da TRİCK : getFirst() meth deque coll. boş ise NoSuchElementException fırlatır
        peekFirst() math. deque boş ise null return eder.
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1); //[]
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); //null
       // System.out.println("dq1.getFirst() = " + dq1.getFirst()); // RTE->.NoSuchElementException
        System.out.println( "agam SElAMETLE app run oldu DEWAMKEE:)");


        Deque<String>dq2=new LinkedList<>(Arrays.asList("havuç dilimi","güllaç","su muhallebi","triliçe","kazan dibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst()); //dq2.pollFirst() = havuç dilimi
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); //dq2.pollLast() = kazan dibi
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); //dq2.removeFirst() = güllaç
        System.out.println("dq2.removeLast() = " + dq2.removeLast()); //dq2.removeLast() = triliçe

        System.out.println("agam SElAMETLE app run oldu DEWAMKEE:)");

        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst()); //null
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); //null
       // System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); //NoSuchElementException
       // System.out.println("dq2.removeLast() = " + dq2.removeLast()); //NoSuchElementException
        System.out.println("agam SElAMETLE app run oldu DEWAMKEE:)");

    }
}

package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue coll. interface old için child class olan LinkedList ve PriorityQueue ile obj üretilir.
        Eczane yemekhane vs belirli şart ile aksiyon olan elemanlar için kullanılır.
        Cons seçimine göre queue obj özellikleri belirlenir.
        FİFO -> first in first out ilk giren ilk çıkar eleman en sona

         */
        Queue<String>q1=new LinkedList<>(Arrays.asList("Cebrail","Sumeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1); //q1 = [Cebrail, Sumeyra, Yakup, Muharrem] -> insertion order
        q1.add("Erol");
        System.out.println("q1 = " + q1); //q1 = [Cebrail, Sumeyra, Yakup, Muharrem, Erol]

        Queue<String>q2=new LinkedList<>(Arrays.asList("JavaCAN","javaSU","javaNAZ","javİYE"));
        System.out.println("q2 = " + q2); //q2 = [JavaCAN, javaSU, javaNAZ, javİYE]
        q2.add("java");
        System.out.println("q2 = " + q2);
        System.out.println("q1.element() = " + q1.element()); //Cebrail - ilk elemanı verdi
        System.out.println("q1.peek() = " + q1.peek()); //Cebrail -
        System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1 = " + q1); //q1 = [Sumeyra, Yakup, Muharrem, Erol]
        System.out.println("q1.poll() = " + q1.poll()); //q1.poll() = Sumeyra

        //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
       // System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true
        /*
ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
 add meth Exception fırlatır.offer ise true-false return eder.

*/
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);

        queue.add(5);

        queue.add(7);

        queue.add(9);

        queue.add(11);

        queue.add(13);



        int count = 0;

        while (queue.isEmpty() == false) {

            queue.remove();

            count++;

            if(count == 3) {

                break;

            }

        }

        System.out.println(queue);
    }
}


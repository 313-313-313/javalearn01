public class QUİZZ {
    public static void main(String[] args) {
        methodT(1,2);
        methodT(1,2,3,4,5);
        methodT(1,2,3);

    }public static void methodT(int i, int j, int... k) {

        System.out.println(k.length);

    }
}

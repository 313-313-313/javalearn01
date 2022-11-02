public class QUIZZZ {
    public static void main(String[] args) {
        StringBuilder strB1 = new StringBuilder(2+ "apple" +3 + 8 + "banana");

        String isim = "Elly";

        strB1.append(isim,1,3);

        strB1.delete(3,5);

        System.out.println(strB1);
    }
}

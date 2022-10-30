package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
 */
        String arr1[]={"m","e","r","v","e"} ;
        String arr2[]={"a","l","i"} ;
        strBirleştir(arr1);
        strBirleştir(arr2);

        strBirleştir("javaCAN","Enise","hanım");
    } //main sonu
    public  static  void  strBirleştir(String...str){
        String birlesenStr="";
        for (String w:str){
            birlesenStr=birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }
}

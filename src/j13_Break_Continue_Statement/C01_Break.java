package j13_Break_Continue_Statement;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
break oradan sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("mail hesabı giriniz:");

        String mail=scanner.nextLine();

        for(int i=0; i<mail.length();i++) { // 0 indexten mail son indexe kadar her bir karakteri döngüye
            char c=mail.charAt(i); //döngüdeki her bir karakteri c' ye atar
            if(c=='@'){ // c de @ karakteri varsa if blok run edilir.
                break; //if blok loop u sonlandırır, kırar
            }
            System.out.print(c); //loptaki elde edilen karakterleri c ye atayıp print eder.
        }


    }
}

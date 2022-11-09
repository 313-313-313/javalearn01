package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis =new FileInputStream("/Users/yeni/IdeaProjects/javaLearn/src/j29_Exceptions/ebikGabık");
            int k;
            while (true) {
                try {
                    if ((k=fis.read())!=-1) {
                        System.out.println((char)k);
                    }
                    System.out.println("içteki try bloktan selamlar:)");
                } catch (IOException e) {
                    System.out.println("dosya okunamıyor");
                    System.out.println("içteki catch bloktan selamlar:)");
                }
                System.out.println("agam dıştaki try bloktan selamlar");
            }
        } catch //dosyaya ulaşılamazsa bu catch çalışır
        (FileNotFoundException e) {
            System.out.println("agam dosya ulaşılamıyorr...");
            System.out.println("agam dıştaki catch bloktan selamlar");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE:) ");
    }
}

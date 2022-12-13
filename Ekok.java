/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekok;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Ekok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int ekok = 0;
        int max;
        
        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        max = sayi1 * sayi2;
        /* 2 sayı eger aralarında asal ise ekoku
        çarpımlarıdır. Yanı 2 sayının ekoku maximum çarpımlarıdır.*/
        
        for(int i = max; i > 0; i--)
        {
            if(i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basamaktahmini;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Basamaktahmini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        while(sayi > 0) {
            sayi /= 10; // sayi = sayi / 10;  
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
    }
}

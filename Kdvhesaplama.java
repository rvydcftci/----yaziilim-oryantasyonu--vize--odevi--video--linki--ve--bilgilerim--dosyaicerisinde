/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdvhesaplama;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;

public class Kdvhesaplama {

    /**
     * @param args the command line argumentsp
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scan.nextInt();
        
        double yeni_fiyat = fiyat + (fiyat * 0.18);
        
        System.out.println("KDV'li fiyat = " + yeni_fiyat);
    }
}

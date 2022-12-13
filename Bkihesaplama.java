/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bkihesaplama;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Bkihesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Boyunuzu giriniz (1,75) : ");
        float boy = scan.nextFloat();
        System.out.print("Kilonuzu giriniz: ");
        float kilo = scan.nextFloat();
        
        float bki = kilo / (boy*boy);
        System.out.println("Beden Kitle İndeksiniz = " + bki);
        
        if(bki < 18) {
            System.out.println("Zayıf");
        }
        else if(bki < 25) {
            System.out.println("Normal");
        }
        else if(bki < 30) {
            System.out.println("Hafif şişman");
        }
        else if(bki < 35) {
            System.out.println("Sisman");
        }
        else {
            System.out.println("Obez");
        }
    }
}
    
    


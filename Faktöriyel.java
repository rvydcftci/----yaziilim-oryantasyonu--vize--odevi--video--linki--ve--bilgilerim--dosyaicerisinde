/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktöriyel;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Faktöriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nsayısıtoplam;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Nsayısıtoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            toplam = toplam + i; // toplam += i;
        }
        System.out.println(sayi + " sayisina kadar olan sayiların toplamı = " + toplam);
    }
//sayı dahil olsun istiyorsak ( i <= sayi) yapmalıyız.
}

    
    


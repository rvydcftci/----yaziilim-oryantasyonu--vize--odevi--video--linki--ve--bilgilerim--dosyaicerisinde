/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negatifpozitif;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Negatifpozitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);
         System.out.print("Bir Sayı Girin:");
 
        double sayi = reader.nextInt();
        // sayı 0 dan küçükse negatif
        if (sayi < 0.0)
            System.out.println(sayi + " Negatiftir.");
 
        // 0'dan büyükse pozitif
        else if ( sayi > 0.0)
            System.out.println(sayi + " Pozitiftir.");
 
        // aksi durumda yani 0'a eşitse
        else
            System.out.println(sayi + "  Sıfırdır.");    
    }
    
}

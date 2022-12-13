/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vizefinalnotu;

/**
 *
 * @author ciftc
 */
import java.util.Scanner;
public class Vizefinalnotu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner (System.in);
        
        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fınal = scan.nextInt();
        
        double not = (vize * 0.4) + (fınal * 0.6);
        
        System.out.println("Yıl sonu notunuz = " + not);
        
       
        }
    }

    
    


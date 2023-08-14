
package gelismisnothesaplama;

import java.util.Scanner;

public class Gelismisnothesaplama {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 1. vize notunuzu girin: ");
         int vize1 = scanner.nextInt();
         System.out.println("lutfen 2. vize notunuzu girin: ");
         int vize2 = scanner.nextInt();
         System.out.println("lutfen final notunuzu girin: ");
         int finalnot = scanner.nextInt();
         System.out.println("lutfen okul ortalamanizi girin: ");
        double ortalama  = scanner.nextDouble();
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (toplamnot >= 90) {
        System.out.println("Tebrikler AA aldiniz");
        }
        
        else if(toplamnot >= 85) {
            System.out.println("Tebrikler BA aldiniz");
        }
        
        else if(toplamnot >= 80) {
            System.out.println("Tebrikler BB aldiniz");
        }
        else if(toplamnot >= 75) {
            System.out.println("Tebrikler CB aldiniz");
        }
        else if(toplamnot >= 70) {
            System.out.println("Tebrikler CC aldiniz");
        }
        else if(toplamnot >= 65) {
            System.out.println("Tebrikler DC aldiniz");
        }   
        else if(toplamnot >= 60) {
            System.out.println("Tebrikler DD aldiniz");
            
            if(ortalama <= 2.50 ) {
            System.out.println("DD aldiniz ve not ortalamaniz dusuk. dersi tekrar almayi dusunebilirsiniz");
            
           }
        }                      
        else if(toplamnot >= 55) {
            System.out.println("FD aldiniz ve kaldiniz");
        }
        else {
            System.out.println("FF aldiniz ve kaldiniz");
        }
        
        
        
        
        
        
       
                
        
        
        
        
                 
         
         
         
         
        
        
        
        
        
        
        
       
    }
    
}

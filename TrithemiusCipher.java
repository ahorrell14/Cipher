/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213interfacelab;

/**
 *
 * @author skyehorrell
 */
public class TrithemiusCipher implements Cipher{
    
   private int shift;
   
   private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
       'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public TrithemiusCipher () {

        this.shift = 0;
} 

    public int charToIndex(char c){
        
        int result = (int)c;
        int lowerCase = 97;
        int upperCase = 65;

        if (result <= 122 && result >= 97){
            
            result -= lowerCase;
        } 
        else if (result >= 65 && result <= 90){
            
            result -= upperCase;
        }

        return result;
}    
    
    public String encrypt (String plainText){
        
        int change = shift;
        
        String encryptedText = "";
        
        for (int i = 0; i < plainText.length(); i++) {
            
            char charAt = plainText.charAt(i);

            int num = charToIndex(charAt);
            
            int wShift = num + change;
            
            if (wShift >= 0 && wShift <= 25) {
                
                encryptedText += alpha[wShift];
            }
            
            else if (charAt == ' ') {
                
                encryptedText += " ";
                
                change = -1;
            }
            
            else if (wShift > 25) {            
                    
                    encryptedText += alpha[wShift - 26];

            }
            
            else if (wShift < 0) {
                
                encryptedText += alpha[wShift + 26];
            }
            
            
            
            change++;
        }
 
        return encryptedText; 
    }
    
    public String decrypt (String encryptedText){
        
        int change = shift;
        
        String decryptedText = "";
        
        for (int i = 0; i < encryptedText.length(); i++) {
            
            char charAt = encryptedText.charAt(i);
            
            int num = charToIndex(charAt);
            
            int wShift = num - change;
            
            if (charAt == ' ') {
                
                decryptedText += " ";
                change = -1;
            }
            else {
                
                if (wShift >= 0 && wShift <= 25) {
                
                    decryptedText += alpha[wShift];
                }
            
                else if (wShift > 25) {
                    
                    decryptedText += alpha[wShift - 26];
               }
            
                else if (wShift < 0) {
                    
                    decryptedText += alpha[wShift + 26];
               }
            }

            change++;
        }
 
            return decryptedText; 
         }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213interfacelab;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author skyehorrell
 */
public class JasonCipher implements Cipher{
    
    private int shift;
    
    ArrayList firstHalf = new ArrayList();
    
    ArrayList secondHalf = new ArrayList();
    
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
       'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public JasonCipher (){
        
        this.shift = 5;
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
    
    public String encrypt (String plainText) {
        
        String encryptedText = "";
        String encryptedText1 = "";
        
        if (plainText.length() % 2 == 0) {
            
           String firstHalf = "";
           String secondHalf = "";
           
           for (int i = plainText.length() / 2 - 1; i >= 0; i--) {
               
               firstHalf += plainText.charAt(i);

           }
           
           encryptedText = firstHalf;
           
           for (int i = plainText.length() / 2; i < plainText.length(); i++) {
               
               secondHalf += plainText.charAt(i);
           }

           for (int i = 0; i < secondHalf.length(); i++){
               
               char charAt = secondHalf.charAt(i);
               
               int num = charToIndex(charAt);
               
               int wShift = num + shift;
               
               if (wShift >= 0 && wShift <= 25) {
                
                encryptedText += alpha[wShift];
                }
               
               else if (wShift > 25) {            
                    
                encryptedText += alpha[wShift - 26];
                }
            
               else if (wShift < 0) {
                
                encryptedText += alpha[wShift + 26];
               }
           }
           
           for (int i = encryptedText.length() - 1; i >= 0; i--) {
               
               encryptedText1 += encryptedText.charAt(i);

           }
        }
        
        else if (plainText.length() % 2 == 1) {
            
           String firstHalf = "";
           String secondHalf = "";
           
           for (int i = plainText.length() / 2; i >= 0; i--) {
               
               firstHalf += plainText.charAt(i);

           }
           
           encryptedText = firstHalf;
           
           for (int i = plainText.length() / 2 + 1; i < plainText.length(); i++) {
               
               secondHalf += plainText.charAt(i);
           }

           for (int i = 0; i < secondHalf.length(); i++){
               
               char charAt = secondHalf.charAt(i);
               
               int num = charToIndex(charAt);
               
               int wShift = num + shift;
               
               if (wShift >= 0 && wShift <= 25) {
                
                encryptedText += alpha[wShift];
                }
               
               else if (wShift > 25) {            
                    
                encryptedText += alpha[wShift - 26];
                }
            
               else if (wShift < 0) {
                
                encryptedText += alpha[wShift + 26];
               }
           }
           
           for (int i = encryptedText.length() - 1; i >= 0; i--) {
               
               encryptedText1 += encryptedText.charAt(i);

           }
        }
        
        return encryptedText1;
    }
    
    public String decrypt (String encryptedText) {
        
        String decryptedText = "";
        String decryptedText1 = "";
        
        if (encryptedText.length() % 2 == 0) {
            
           String firstHalf = "";
           String secondHalf = "";
           
           for (int i = encryptedText.length() / 2 - 1; i >= 0; i--) {
               
               secondHalf += encryptedText.charAt(i);
               
           }
           
           for (int i = encryptedText.length() / 2; i < encryptedText.length(); i++) {
               
               firstHalf += encryptedText.charAt(i);

           }
           
           decryptedText = firstHalf;

           for (int i = 0; i < secondHalf.length(); i++){
               
               char charAt = secondHalf.charAt(i);
               
               int num = charToIndex(charAt);
               
               int wShift = num - shift;
               
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
           
           for (int i = 0; i < decryptedText.length(); i++) {
               
               decryptedText1 += decryptedText.charAt(i);

           }
        }
        
        else if (encryptedText.length() % 2 == 1) {
            
           String firstHalf = "";
           String secondHalf = "";
           
           for (int i = encryptedText.length() / 2 - 1; i >= 0; i--) {
               
               secondHalf +=encryptedText.charAt(i);

           }
    
           for (int i = encryptedText.length() / 2; i < encryptedText.length(); i++) {
               
               firstHalf +=encryptedText.charAt(i);
           }
                          
           decryptedText = firstHalf;

           for (int i = 0; i < secondHalf.length(); i++){
               
               char charAt = secondHalf.charAt(i);
               
               int num = charToIndex(charAt);
               
               int wShift = num - shift;
               
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
           
           for (int i = 0; i < decryptedText.length(); i++) {
               
               decryptedText1 += decryptedText.charAt(i);

           }
        }
        
        return decryptedText1;
    }
}

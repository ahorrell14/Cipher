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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Ceasar Cipher"); 
        System.out.println("--------------");
        
        CasearCipher obj = new CasearCipher(-2);
        
        String plainText = "The encryption is working correctly";
        
        System.out.println("PlainText: " +plainText);
        
        String encryptedText = obj.encrypt(plainText);
        
        System.out.println("EncryptedText: " +encryptedText);
        
        String decryptedText = obj.decrypt(encryptedText);
        
        System.out.println("DecryptedText: " +decryptedText);
        
        System.out.println();
        System.out.println("Trithemius Cipher");
        System.out.println("--------------");
        
        TrithemiusCipher obj1 = new TrithemiusCipher();
        
        String plainText1 = "The encryption is working correctly";
        
        System.out.println("PlainText: " +plainText1);
        
        String encryptedText1 = obj1.encrypt(plainText1);
        
        System.out.println("EncryptedText: " +encryptedText1);
        
        String decryptedText1 = obj1.decrypt(encryptedText1);
        
        System.out.println("DecryptedText: " +decryptedText1);
        
        System.out.println();
        System.out.println("Jason Cipher");
        System.out.println("--------------");
        
        JasonCipher obj2 = new JasonCipher();
        
        String plainText2 = "four";
        
        System.out.println("PlainText: " +plainText2);
        
        String encryptedText2 = obj2.encrypt(plainText2);
        
        System.out.println("EncryptedText: " +encryptedText2.toUpperCase());
        
        String decryptedText2 = obj2.decrypt(encryptedText2);
        
        System.out.println("DecryptedText: " +decryptedText2.toUpperCase());
        
        String plainText3 = "three";
        
        System.out.println("PlainText: " +plainText3);
        
        String encryptedText3 = obj2.encrypt(plainText3);
        
        System.out.println("EncryptedText: " +encryptedText3.toUpperCase());
        
        String decryptedText3 = obj2.decrypt(encryptedText3);
        
        System.out.println("DecryptedText: " +decryptedText3.toUpperCase());
    }
    
}

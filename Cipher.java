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
interface Cipher {
    
    public String encrypt (String plainText);
    
    public String decrypt (String encryptedText);
}

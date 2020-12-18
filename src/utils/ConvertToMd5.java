/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author kevin
 */
public class ConvertToMd5 {
    private String md5_hash;
    
    public ConvertToMd5(String s){
        this.md5_hash = s;
    }
            
            
    public String getMd5Hash() {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(this.md5_hash.getBytes());
            return new BigInteger(1, md5.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }


}

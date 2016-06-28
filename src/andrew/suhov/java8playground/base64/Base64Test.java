/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 *
 * @author asuhov
 */
public class Base64Test
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String base64EncodedString = Base64.getEncoder().encodeToString("F?!ck you".getBytes("utf-8"));
        System.out.println("base64 encoded string (Basic): " + base64EncodedString);
        
        byte[] base64DecodedBytes = Base64.getDecoder().decode(base64EncodedString);
        System.out.println("Original string: " + new String(base64DecodedBytes));
        
        base64EncodedString = Base64.getUrlEncoder().encodeToString("F?!ck you".getBytes("utf-8"));
        System.out.println("base64 encoded string (URL): " + base64EncodedString);
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++)
        {
            stringBuilder.append(UUID.randomUUID().toString());
        }
        
        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("base64 encoded string (MIME): " + mimeEncodedString);
    }
}

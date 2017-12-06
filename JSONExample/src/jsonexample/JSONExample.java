/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexample;

import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
public class JSONExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JSONObject obj = new JSONObject();
        obj.put("nama", "Dewi");
        obj.put("alamat", "Jakarta Barat");
        
        System.out.println(obj.toJSONString());
    }
    
}

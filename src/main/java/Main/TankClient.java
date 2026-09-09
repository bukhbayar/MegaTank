/*
 * TankClient.java
 *
 * Created on Nov 7, 2007, 11:29:23 PM
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;




/**
 *
 * @author Bokhoo
 */

public class TankClient {
    public boolean first = false;
    
    private Socket s1 = null;
    private OutputStream s1out = null;
    private DataOutputStream dos = null;
    
    public TankClient() {
        
    }
    
    public void changeTrue(){
        first = false;
    }
    
    
    public void Send(String str,String IP, int port) {
        
        try{
            if(first == false){
                s1 = new Socket(IP, port);
                first = true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            first=false;
            return;}
        try {
            if(dos==null){
                s1out = s1.getOutputStream();
                dos = new DataOutputStream(s1out);
            }
            dos.writeUTF(str);
            //   dos.close();
            //  s1out.close();
            // s1.close();
        } catch (Exception e) {
            System.out.println("SEND Error !!! -> " + e.getMessage());
            first=false;
        }
    }
}
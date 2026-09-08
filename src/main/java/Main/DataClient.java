/*
 * DataClient.java
 *
 * Created on December 2, 2007, 6:35 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author lab202
 */
public class DataClient {
    private DatagramSocket s;
    private InetAddress addr;
    
    public DataClient() {
        
    }
    
    public void Send(String str){
         try {
            addr = InetAddress.getByName("");
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
       
        try {
            s = new DatagramSocket(5124,addr);
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
         
        byte[] sbuf = str.getBytes();
        DatagramPacket spack = new DatagramPacket(sbuf, sbuf.length, addr, 5124);
     
        try {
            s.send(spack);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
            
}

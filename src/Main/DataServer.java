/*
 * DataServer.java
 *
 * Created on December 2, 2007, 6:38 PM
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
public class DataServer {
    private DatagramSocket s;
    private InetAddress addr;
    public DataServer() {
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
    }
    
    public void Recieve(){
        byte[] buf = new byte[2048];
        DatagramPacket p = new DatagramPacket(buf, buf.length);
        
        try {
            s.receive(p);
            byte[] tmp = new byte[p.getLength()];
            for (int i = 0; i < p.getLength(); i++){
                tmp[i] = buf[i];
            }
            System.out.print("Data: " + new String(tmp));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

/*
 * TankServer.java
 *
 * Created on Nov 8, 2007, 12:59:35 AM
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Bokhoo
 */
public class TankServer implements Runnable {
    private ServerSettings server;
    private Panel2D panel;
    private Thread thread;
    private int Port;
    private int gameMode;
    
    
    private ServerSocket serversocket = null;
    private Socket socket = null;
    private DataInputStream dis = null;
    private InputStream in  = null;
    
    public TankServer(Panel2D p,ServerSettings s) {
        panel = p;
        gameMode = 0;
        server = s;
    }
    
   /* public void StopListener(){
        thread = null;
        serversocket = null;
        socket = null;
    }*/
    
    public void CreateListener(int port,int g){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
        this.Port = port;
        gameMode = g;
    }
    
    public void ChangeMode(int g){
        gameMode = g;
    }
    
    public void Recieve(int port) {
        String str = "";
        try {
            serversocket = new ServerSocket(port);
        } catch (IOException e) {System.out.println("SERVER ERROR !!!"); }
        while (true) {
            try {
                socket = serversocket.accept();
                in = socket.getInputStream();
                dis = new DataInputStream(in);
                while(true){
                    str = new String(dis.readUTF());
                    if(gameMode == 1){
                        panel.setChatData(str);
                    }else if(gameMode == 2){
                        server.setConnData(str);
                    }
                }
                
                //in.close();
                //dis.close();
                //socket.close();
            } catch (IOException e) {
                System.out.println("Server error -> " + e.getMessage());
            }
        }
    }
    
    public void run() {
        Recieve(Port);
    }
}
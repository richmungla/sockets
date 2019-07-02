/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.net.*;
import java.io.*;
import java.util.HashMap;
/**
 *
 * @author richm
 */
public class SocketClient {
        
    public Socket connectToServer(int portStart, int portEnd){
        int port = portStart;
        Socket sock = new Socket();
        while(port < portEnd){
            try{
                Socket s = new Socket("localhost", port);
                if(s.isConnected()){
                    System.out.println("Connected to Server on port "+port);
                    sock = s;
              break;
            }
            }catch(IOException e){
                System.out.println("remote host not listening on port: "+ port);
            }            
            port++;
        }        
        return sock;
    }
}

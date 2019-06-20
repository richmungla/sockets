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
    public static void main(String args[]) throws Exception{
                
        int port = 1;
        Socket sock = new Socket();
        while(port < 100){
            try{
                Socket s = new Socket("localhost", port);
                if(s.isConnected()){
                    sock = s;
              break;
            }
            }catch(IOException e){
                System.out.println("remote host not listening on port: "+ port);
            }
            
//            System.out.println(port);
            port++;
        }
        
       
       
//       s.connect("localhost", port);
       
       HashMap<String, Object> stuff = new HashMap<String, Object>();
       
       stuff.put("ID", 1);
       stuff.put("Name", "Ben 10");
       
       String name = stuff.toString();     
                
        DataInputStream din = new DataInputStream(sock.getInputStream());
        DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
        
        dout.writeUTF(name);
//      
    }
}

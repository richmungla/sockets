/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.net.*;
import java.io.*;
import java.util.Random;
import java.util.HashMap;

/**
 *
 * @author richm
 */
public class SocketServer {
    
    static DataInputStream din;
    static DataOutputStream dout;
    
    public static HashMap<String, Object> stringSplit(String data){
    
        data = data.substring(1, data.length()-1);
        String[] keyValuePairs = data.split(",");
        HashMap<String, Object> map = new HashMap<>();
        
        for(String pair : keyValuePairs){
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }

        return map;
    }
    
    public static void main(String args[]) throws Exception{
               
        startServer(3000, 3005);     
 
    }
    
    public static Socket startServer(int portStart, int portEnd) throws IOException{
        Socket sock = new Socket();
//        initialize server socket 
        ServerSocket ss = new ServerSocket();
        int port = portStart;
//           check if socket is bound (Will not be at first)
            while(!ss.isBound()){
                try{
                    ServerSocket serverSocket = new ServerSocket(port);
                
                    ss = serverSocket ;                 
              
                }catch(BindException be){
                    System.out.println("Port: "+ port+" in use");
                     port++;
                }
               
            }
//            the port in use
            System.out.println(port);
        
     return sock;
    }
    
}

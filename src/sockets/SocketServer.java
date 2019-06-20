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
    
    public static HashMap<String, Object> stringSplit(String data){
    
        data = data.substring(1, data.length()-1);
        String[] keyValuePairs = data.split(",");
        HashMap<String, Object> map = new HashMap<>();
        
        for(String pair : keyValuePairs){
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }
        
//        System.out.println(map);
        return map;
    }
    
    public static void main(String args[]) throws Exception{
        
        InetAddress inetAddress=InetAddress.getByName("localhost");
        
        ServerSocket ss = new ServerSocket();
        SocketAddress endPoint;
        
        int port = 10;      
        
        ss.setReuseAddress(true);
        
        while(!ss.isBound()){        
        endPoint=new InetSocketAddress(inetAddress, port); 
        try{
        ss.bind(endPoint);
        }catch(BindException e){
            System.out.println("Port :"+ port +" in use");
        }
//        System.out.println(port);
        port++;   
        
        }    
        
//        System.out.print(ss);
        
        Socket s = ss.accept();
        
//        if(!s.isInputShutdown()){        
//        System.out.println(ss.getReuseAddress());
        
        
               
//        Socket s = ss.accept();
//        Random rand = new Random();
//   
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        HashMap map = stringSplit(din.readUTF());
        System.out.println(map.get("Name"));
//        }
        
        
//        String str = din.readUTF();
//        int port = 0;
//        if(str.equals("initial")){
//            port = rand.nextInt(6000);
//            dout.writeInt(port);   
//            
////            s.close();
////        ss.close();
//        
//        ss = new ServerSocket(port);
////        s = ss.accept();
//        
//       
//        }
//         System.out.println(din.readUTF());
        
//        
//        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        String str = "", str2 = "";
//        
//        while(!str.equals("stop")){
//            str = din.readUTF();
//            System.out.println("client says: " + str);
//            str2 = br.readLine();
//            dout.writeUTF(str2);
//            dout.flush();
//                 
//        }
//        
//        din.close();
//        s.close();
//        ss.close();
    }
    
}

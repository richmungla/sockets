/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author richm
 */
public class ClientProtocol {
    
    DataInputStream din;
    DataOutputStream dout;
    
    public void SendToServer(HashMap<String, Object> toyData, Socket sock){
//        System.out.println(sock);
        String data = toyData.toString();
        try{      
//           din = new DataInputStream(sock.getInputStream());
           dout = new DataOutputStream(sock.getOutputStream());

            dout.writeUTF(data);
        }catch (Exception e){
            e.printStackTrace();
        }
    }   
    
    
}

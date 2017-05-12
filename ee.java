package com.soc;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("server created");
        ServerSocket ss=new ServerSocket(776);
        System.out.println("Server is waiting for request client");
        Socket s=ss.accept();//establishes connection
        System.out.println("server connected");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("data client: "+ str);
        ss.close();
    }
}

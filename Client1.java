package com.soc; /**
 * Created by Accounting on 5/8/2017.
 */


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {

        Socket s=new Socket("192.168.1.2",776);
        System.out.println("Enter sth :))");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        OutputStreamWriter os =new OutputStreamWriter(s.getOutputStream());
        PrintWriter out= new PrintWriter(os);
        os.write(str);
        os.flush();
        s.close();
    }
}


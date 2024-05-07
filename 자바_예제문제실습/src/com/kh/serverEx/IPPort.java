package com.kh.serverEx;

import java.net.InetAddress;
import java.net.Socket;

public class IPPort {

	public static void main(String[] args) {
		try {
			String serverIP = "192.200.3.58";
			System.out.println(serverIP);
			
			Socket socket = new Socket(serverIP, 3000);
			System.out.println(socket);
			
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

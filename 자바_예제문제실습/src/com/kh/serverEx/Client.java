package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		int port = 3000;
		String serverIP;

		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			System.out.println("서버에 연결됐습니다.");

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

			pw.println("hi Server");

			String m = br.readLine();
			System.out.println("Send message : " + m);
			
			br.close();
			pw.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

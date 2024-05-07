package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port = 3000;
		String serverIP = "192.200.3.58";
		try {
			//ServerSocket server = new ServerSocket(port);
			//ServerSocket server = new ServerSocket(port, InetAddress.getAllByName(serverIP)); -> 구버전
			ServerSocket server = new ServerSocket(port, 50, InetAddress.getByName(serverIP));
			// 내 IP 주소에서는 대기숫자를 작성하지 않아도 되지만, 남의 IP 주소에서 포트를 열때는 요청 처리를 위한 숫자 제한을 해줘야함 
			
			String m;
			boolean check = true;

			while (check) {
				Socket client = server.accept();
				System.out.println("클라이언트가 접속했습니다.");

				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw = new PrintWriter(client.getOutputStream(), true);

				while ((m = br.readLine()) != null) {
					System.out.println("Send Message : " + m);
				}
				br.close();
				pw.close();
				check = false;
			}

			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

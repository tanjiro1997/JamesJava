package org.james.day16.socket.calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다!");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				String recvMsg = dis.readUTF();
				if("exit".equals(recvMsg)) break;
				String [] data = recvMsg.split(" ");
				String result = "";
				int num1 = Integer.parseInt(data[0]);
				int num2 = Integer.parseInt(data[2]);
				String operator = data[1];
				switch(operator) {
				case "+" : result = num1 + num2 + ""; break;
				case "-" : result = num1 - num2 + ""; break;
				case "*" : result = num1 * num2 + ""; break;
				case "/" : result = num1 / num2 + ""; break;
				case "%" : result = num1 % num2 + ""; break;
				}
				System.out.println(recvMsg);
				dos.writeUTF(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				socket.close();
				serverSocket.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

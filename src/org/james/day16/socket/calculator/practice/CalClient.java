package org.james.day16.socket.calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {
//	서버에 연결중입니다...
//	서버와 연결되었습니다!
//
//	계산식(빈칸으로 띄어 입력, 예 24 + 42) >>
	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if("exit".equals(sendMsg)) {
//					dos.writeUTF("exit");
					break;
				}
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println("계산 결과 : " + recvMsg);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				os.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

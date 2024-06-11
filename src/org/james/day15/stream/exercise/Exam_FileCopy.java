package org.james.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String [] args) {
		// C드라이브에 있는 파일을 D드라이브로 복사해보자~!
		// C:\Temp\Fetility.png -> D:\Copy\copied.png
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Temp\\Fetility.png");
			os = new FileOutputStream("D:\\Copy\\copied.png");
			byte [] byteImages = new byte[1024];
			int readCount;
			while((readCount = is.read(byteImages)) != -1) {
//			while(true) {
//				readCount = is.read(byteImages);
//				if(readCount == -1) break;
				os.write(byteImages, 0, readCount);
				os.flush();
			}System.out.println("복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package org.james.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/james/day15/stream/inputstream/reading.txt");
			int readByte = 0;
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);

			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없읍니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

package com.io.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.fileSave();
		hw.fileRead();
	}

	public void fileSave() {
		String filename = null;
		FileWriter fw = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("파일명을 입력하세요: ");
			filename = br.readLine();
			
			fw = new FileWriter(filename);
			
			String data = "";
			System.out.println("파일에 저장할 내용을 입력하시요.(종료: exit)");
			while((data = br.readLine()) != null) {
				// 사용자의 입력값이 exit이면 입력 종료
				if("exit".equals(data))
					break;
				
				fw.write(data + "\n");
				
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void fileRead() {
		String filename = null; 
		FileReader fr = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("읽을 대상 파일명을 입력하시오.");
		try {
			// 키보드로 읽을 대상파일명 입력받음
			filename = br.readLine();
			
			// 파일 안의 내용 담기
			fr = new FileReader(filename);
			
			// 읽어올 데이터를 담을 정수형 변수
			int data = 0; 
			
			//파일 안의 내용 읽기 
			StringBuilder sb = new StringBuilder();
			while((data = fr.read()) != -1) {
				sb.append((char) data);
			}
			
			// 출력 (StringBuilder 에 보관된 값을 String으로 바꾸어 화면에 출력)
			System.out.println(sb.toString());
			
			
		} catch(FileNotFoundException e) {
			System.out.println("[" + filename + "] 해당 파일을 찾을 수 없습니다." );
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

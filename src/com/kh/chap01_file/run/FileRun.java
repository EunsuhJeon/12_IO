package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// 간단하게 파일(file) 만들어지는 과정
		// java.io.File 클래스 이용해서!
		
		
		try {
			// 1. 경로 지정을 딱히 하지 않은 상태로 파일 생성 => 현재 project 폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐!
			
			// 2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정하면 됨
			File f2 = new File("D:\\test.txt"); // \t는 이스케이프문자로 지정되어있기 때문에 \를 한 번 더 써서 \\t로 작성해줘야 함.
			f2.createNewFile();
			
			// 3. 존재하지 않는 폴더에 파일 생성
			//File f3 = new File("D:\\temp\\test.txt"); 
			//f3.createNewFile();
			
			// 4. 폴더 먼저 만들고 파일까지 만들어지게 하기
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // 폴더가 만들어지게 하는 메소드
			
			File f3 = new File("D:\\temp\\test.txt"); 
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			// ---------------------------------------------------
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent//person.txt");
			file.createNewFile();
			
			System.out.println("파일명: " + file.getName());
			System.out.println("절대경로: " + file.getAbsolutePath());
			System.out.println("파일용량: " + file.length());
			System.out.println("상위폴더: " + file.getParent());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		/*
		 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 또는 외부매체로부터 입력을 받아올 것!
		 * 반드시 그 외부매체와 통로를 만들어야함 ! <<-- 스트림!
		 * 
		 * * 스트림(통로)의 특징
		 * - 단방향: 입력이면 입력/ 출력이면 출력만 가능!
		 * 			=> 입력과 출력을 동시다발적으로 하고자 한다면? => 입력용 스트림/ 출력용 스트림 따로 열어야함!
		 * - 선입선출(FIFO): 통로가 파이프 같은 개념이기 때문에 먼저 보낸 값이 먼저 나옴!
		 * - 시간 지연(delay)이라는 문제가 발생할 수 있음!
		 * 
		 * * 스트림의 구분
		 * > 통로의 사이즈(1byte짜리/ 2byte짜리)
		 * 	- 바이트 스트림: 1byte짜리만 왔다 갔다 할 수 있을 정도의 사이즈(좁은 통로) => 입력(InputStream)/ 출력(OutputStream)
		 * 	- 문자 스트림: 2byte짜리도 왔다 갔다 할 수 있을 정도의 사이즈(넓은 통로) => 입력(Reader)/ 출력(Writer)
		 * 
		 * 
		 */
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}

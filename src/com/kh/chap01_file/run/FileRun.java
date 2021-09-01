package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// �����ϰ� ����(file) ��������� ����
		// java.io.File Ŭ���� �̿��ؼ�!
		
		
		try {
			// 1. ��� ������ ���� ���� ���� ���·� ���� ���� => ���� project ������ ���� ����
			File f1 = new File("test.txt");
			f1.createNewFile(); // �޼ҵ���� �����ؾ߸� ���� ������ �������!
			
			// 2. �����ϴ� ������ ���� ���� => �ش� ��α��� �����ϸ� ��
			File f2 = new File("D:\\test.txt"); // \t�� �̽����������ڷ� �����Ǿ��ֱ� ������ \�� �� �� �� �Ἥ \\t�� �ۼ������ ��.
			f2.createNewFile();
			
			// 3. �������� �ʴ� ������ ���� ����
			//File f3 = new File("D:\\temp\\test.txt"); 
			//f3.createNewFile();
			
			// 4. ���� ���� ����� ���ϱ��� ��������� �ϱ�
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // ������ ��������� �ϴ� �޼ҵ�
			
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
			
			System.out.println("���ϸ�: " + file.getName());
			System.out.println("������: " + file.getAbsolutePath());
			System.out.println("���Ͽ뷮: " + file.length());
			System.out.println("��������: " + file.getParent());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		/*
		 * ���α׷� ���� �����͸� �ܺθ�ü�� ����� �Ѵٰų� �Ǵ� �ܺθ�ü�κ��� �Է��� �޾ƿ� ��!
		 * �ݵ�� �� �ܺθ�ü�� ��θ� �������� ! <<-- ��Ʈ��!
		 * 
		 * * ��Ʈ��(���)�� Ư¡
		 * - �ܹ���: �Է��̸� �Է�/ ����̸� ��¸� ����!
		 * 			=> �Է°� ����� ���ôٹ������� �ϰ��� �Ѵٸ�? => �Է¿� ��Ʈ��/ ��¿� ��Ʈ�� ���� �������!
		 * - ���Լ���(FIFO): ��ΰ� ������ ���� �����̱� ������ ���� ���� ���� ���� ����!
		 * - �ð� ����(delay)�̶�� ������ �߻��� �� ����!
		 * 
		 * * ��Ʈ���� ����
		 * > ����� ������(1byte¥��/ 2byte¥��)
		 * 	- ����Ʈ ��Ʈ��: 1byte¥���� �Դ� ���� �� �� ���� ������ ������(���� ���) => �Է�(InputStream)/ ���(OutputStream)
		 * 	- ���� ��Ʈ��: 2byte¥���� �Դ� ���� �� �� ���� ������ ������(���� ���) => �Է�(Reader)/ ���(Writer)
		 * 
		 * 
		 */
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		String fileName = "example.txt";
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		} else {
			file.createNewFile();
			System.out.println("파일을 생성했습니다.");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("이것은 파일 작성 예시입니다.\n");
		writer.write("글쓰는 방법을 진행하고 있습니다.\n");
		writer.close(); // 글을 다 작성했다면 close를 해줘야함 close를 안해주는것은 글을 작성하다 취소하는 것과 같은 의미
		
		System.out.println("파일에 내용을 작성했습니다.");
	}
}

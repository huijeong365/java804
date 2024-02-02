package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); 
		// (bytes, 0, readByteNo-2) byte를 0 부터 입력한 갯수만큼 출력 [readByteNo-2 : enter 키가 2만큼 자리잡기 때문에 그만큼 빼준것.]
		System.out.println(str);

	}

}

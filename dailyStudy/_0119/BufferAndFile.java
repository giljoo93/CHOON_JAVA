package dailyStudy._0119;

import java.io.*;


public class BufferAndFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter fw = new BufferedWriter(new FileWriter("test.txt"));
		
		System.out.println("값 입력");
		String temp = br.readLine(); // String 형식
//		int tempNumber = Integer.parseInt(br.readLine()); // int 형식 언박싱
		
//		File file = new File("test.txt");
		
		fw.write(temp + "\n");
		fw.flush();
		fw.close();
		
		bw.write(temp);
		bw.flush();
		bw.close();
	}
}

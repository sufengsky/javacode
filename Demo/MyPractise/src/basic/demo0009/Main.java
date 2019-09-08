package basic.demo0009;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	/**
	 * 把字符串保存到文本文件中
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("src/basic/demo0009/t.txt");

			fileWriter.write("hello,testing file write");

			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

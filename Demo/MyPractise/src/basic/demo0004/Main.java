package basic.demo0004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 读取用户的输入
	 */
	public static void main(String[] args) {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = is.readLine();
			System.out.println(input);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

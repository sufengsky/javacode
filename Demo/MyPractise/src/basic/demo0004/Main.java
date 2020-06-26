package basic.demo0004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    /**
     * 读取用户的输入
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = is.readLine();
            System.out.println(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

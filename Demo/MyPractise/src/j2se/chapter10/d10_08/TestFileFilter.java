package j2se.chapter10.d10_08;

import java.io.File;

public class TestFileFilter{
	public static void main (String[] args) {
		TestFileFilter tff = new TestFileFilter();
		tff.dir("D:\\ex\\",".java");
		System.out.println("------------------");			
		tff.dir("D:\\ex\\",".class");		
	}
	public void dir(String path,String extension){
		File directory = new File(path);
		MyFilter mf = new MyFilter(extension);		
		File[] files = directory.listFiles(mf);
		System.out.println("路径:\t" + path);	
		System.out.print("文件:");	
		for(File file : files){
			System.out.println("\t" + file.getName());	
		}
	}
}

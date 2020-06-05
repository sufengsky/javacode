package j2se.chapter10.d10_04;

import java.io.File;
import java.util.Date;
public class TestFile{
	public static void main(String[] args) {
		File f1 = new File("a.jpg");
		File f2 = new File("D:\\temp\\","moved.jpg");
		File f3 = new File("D:\\temp\\b.txt");
		File f4 = new File("D:\\ex\\");		
		
		System.out.println("Name: " + f1.getName());
		System.out.println("Path: " + f1.getPath());
		System.out.println("AbsolutePath: " + f1.getAbsolutePath());
		System.out.println("Parent: " + f1.getParent());
		System.out.println("lastModified: " + new Date(f1.lastModified()));
		System.out.println("length: " + f1.length());
		System.out.println("exists: " + f1.exists());
		System.out.println("canRead: " + f1.canRead());
		System.out.println("canWrite: " + f1.canWrite());
		System.out.println("isFile: " + f1.isFile());
		System.out.println("isHidden: " + f1.isHidden());
		System.out.println("isDirectory: " + f1.isDirectory());
		System.out.println("isAbsolute: " + f1.isAbsolute());
		System.out.println("length: " + f1.length());
		
		f3.delete();
		try{
			System.out.println("createNewFile: " 
				+ new File("c.txt").createNewFile());
		}catch(java.io.IOException e){
			e.printStackTrace();	
		}
		
		f1.setReadOnly();
		f1.renameTo(f2);
		System.out.println("createNewFile: " 
			+ new File("D:\\newPath\\").mkdir());
		System.out.println("listFiles:");
		for(File f : f4.listFiles()){
			System.out.println("    -" + f.getName());
		}
	}
}
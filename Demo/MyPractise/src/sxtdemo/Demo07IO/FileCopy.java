package sxtdemo.Demo07IO;

import java.io.*;
public class FileCopy {
  public static void main(String[] args) {
	  int b = 0;
	  FileReader in = null;
	  FileWriter out = null;
	  try {
	    in = new FileReader("d:/share/java/HelloWorld.java");
	    out = new FileWriter("d:/share/java/io/HelloWorld.java");
	    while((b=in.read())!=-1){
	      out.write(b);
	    }
	    out.close();
	    in.close(); 
	    
	  } catch (FileNotFoundException e2) {
	    System.out.println("FileNotFound");
	    System.exit(-1);
	  } catch (IOException e1) {
	    System.out.println("IOException");
	    System.exit(-1);
	  }
	  System.out.println("exit");
  }
}

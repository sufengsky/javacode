package j2se.chapter10.d10_08.version2;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilter implements FilenameFilter{
	private String extension;	  
	public MyFilter(String extension){
		this.extension = extension;	
	}
	
	public boolean accept(File dir,String name){
		return  name.endsWith(extension); 
	}	
}

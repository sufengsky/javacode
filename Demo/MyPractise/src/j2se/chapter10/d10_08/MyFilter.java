package j2se.chapter10.d10_08;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter{
	private String extension;	  //指定后缀
	public MyFilter(String extension){
		this.extension = extension;	
	}
	
	public boolean accept(File file){
		if(file.isDirectory( ))
            return false;
	    
	    //提取文件名
	    String name = file.getName();
	    //提取文件后缀
	    int idx = name.lastIndexOf(".");
	    if((idx == -1)  || (idx == (name.length()-1))) {
	        return false;
	    } else {
	        return name.substring(idx).equals(extension);
		}	
	}
	/*
	public boolean accept(File file){
		return  (!file.isDirectory()) && (file.getName().endsWith(extension)); 
	}	
	*/	
}

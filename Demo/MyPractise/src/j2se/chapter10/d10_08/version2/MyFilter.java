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

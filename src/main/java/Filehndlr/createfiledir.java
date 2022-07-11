package Filehndlr;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class createfiledir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("..//second//Resource//Testing");
		
		f.mkdirs();
		//System.out.println(f.isDirectory());
		
		HashSet<String> filesdir = new  HashSet<>();
		filesdir.add("First");
		filesdir.add("Second");
		filesdir.add("Third");
		filesdir.add("Third");
		
		File sf = null;
		for(String s: filesdir){
			sf = new File(f,s);
			if(sf.isDirectory()){
				sf.delete();
				//System.out.println(sf.exists());
			}
			sf.mkdir();
			
		}
		
		String path = "..//second//Resource//Testing//First";
		File creatfile = new File(path,"sampledss.xml");
		
		
		
		File[] listfile = new File(path).listFiles();
		
		for(File filecheck:listfile ){
			if(filecheck.equals(creatfile)){
				System.out.println(filecheck.delete());
			}
			
			
		}
		
		creatfile.createNewFile();
		
		
		
		
	}

}

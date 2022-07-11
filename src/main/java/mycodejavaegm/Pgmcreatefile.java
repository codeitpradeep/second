package mycodejavaegm;

import java.io.File;
import java.io.IOException;

public class Pgmcreatefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "..//second//src//main//java//mycodejavaegm";
		String filename = "029";
		File creatfile = new File(path,"pgm"+filename+".java");
		File creattxt = new File(path,"ans"+filename+".txt");
		File[] listfile = new File(path).listFiles();
		
		for(File filecheck:listfile){
			if(filecheck.equals(creatfile)){
			}else{
				creatfile.createNewFile();
				System.out.println("created pgm");
			}
			if(filecheck.equals(creattxt)){
			}else{
				creattxt.createNewFile();
				System.out.println("created txt");
			}
			
		} 
		/*
		String a = "";
		for(int i=0 ; i <= 748 ;i++){
		a=Integer.toString(i);
		if(a.matches("[0-9]{1}")){
		//genall("00"+a);
			System.out.println("00"+a);
		}else if(a.matches("[0-9]{2}")){
		//	genall("0"+a);
		}else if(a.matches("[0-9]{3}")){
		//	genall(a);
		}
		} 
		*/

	}

	private static void genall(String a) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("ge");
		String path = "..//second//Resource//Testing//Second//";
		String filename = a;
		File creatfile = new File(path,"pgm"+filename+".java");
		File creattxt = new File(path,"ans"+filename+".txt");
		File[] listfile = new File(path).listFiles();
		
		for(File filecheck:listfile){
			if(filecheck.equals(creatfile)){
			}else{
				creatfile.createNewFile();
				System.out.println("created pgm");
			}
			if(filecheck.equals(creattxt)){
			}else{
				creattxt.createNewFile();
				System.out.println("created txt");
			}
			
		}
	}

}

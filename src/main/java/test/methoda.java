package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;




public class methoda {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Class c = Class.forName("A"); 
		A c = new A();
	  String message ="message";
		//  Object o= c.newInstance();  
	    Method m =c.getClass().getMethod(message ); 
	    //m.setAccessible(true);  
	    m.invoke(c, null);  
	    
	    
	    Properties ps = new Properties();
	    ps.load(new  FileInputStream("./Resource/config.properties"));
	    String a = ps.getProperty("Name");
	    System.out.println(a);
	}

}

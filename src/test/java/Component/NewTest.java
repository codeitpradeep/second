package Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	  System.out.println("Hello");
	  
	  Class c = NewTest.class;
	  Object obj = c.newInstance();
	  
	  Method m = c.getDeclaredMethod("shows", null);
	  
	  m.setAccessible(true);
	  m.invoke(obj, null);
	  
  }
  
  public boolean shows(){
	  
	  System.out.println("Method");
	return false;
	  
  }
}


//Thread video 
//JDBC OJDBC 
//Data
//Lamda , Streams
//POI
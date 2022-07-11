package threadPoolpgm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {

	private String name ;
	public Task(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}

	@Override
	public void run() {
		for(int i=0;i<=3;i++){
			if(i==0){
				Date d = new Date();
				SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
				System.out.printf("0.%s - %s\n",name,ft.format(d));
			}else{
				Date d = new Date();
				SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
				System.out.printf("%s - %s\n",name,ft.format(d));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("Completed - %s\n",name);
	}

}

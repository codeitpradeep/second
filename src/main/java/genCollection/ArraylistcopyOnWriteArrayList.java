package genCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistcopyOnWriteArrayList {

	public static void main(String[] args) {
		//CopyOnWriteArrayList - are the thread safe to access or implement arraylist 
		// all mutativeoperations (add, set, and so on) are implemented 
		CopyOnWriteArrayList<String> cpyarrylist = new CopyOnWriteArrayList<>();
		cpyarrylist.add("Add");
		cpyarrylist.add("Sub");
		cpyarrylist.add("Mul");
		
		Iterator<String> it =  cpyarrylist.iterator();
		
		while(it.hasNext()){
			System.out.printf("We have CopyOnWriteArrayList -"+it.next()
			+"\n");
		}
		
	}

}

/*
We have CopyOnWriteArrayList -Add
We have CopyOnWriteArrayList -Sub
We have CopyOnWriteArrayList -Mul
*/
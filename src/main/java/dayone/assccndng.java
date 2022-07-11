 package dayone;

import java.util.Arrays;

import org.testng.annotations.Test;

public class assccndng {

@Test
void testasdng() {
	int a[] = {5,9,3,2,4,6};
	int b[] = {5,9,3,2,4,6};
	int temp = 0;
	for(int i=0;i<a.length ; i++){
	for(int j=i;j<a.length ; j++){
	if(a[i]>a[j]){
		temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	}
	}
	
	for(int s:a) {
		System.out.println(s);
	}
	
	Arrays.sort(b);
	System.out.println(b[0]);
	if(Arrays.equals(a, b)) {
		System.out.println("Asscnd");
	}
	
}
}

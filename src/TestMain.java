import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		int n[] = {3, 8, 1, 9, 5};
		String temp = "";
		
		
		
		
		for(int i=0; i<n.length; i++) {
			
			temp = temp+n[i];
			
		}

		System.out.println(temp);
		
		for(int i=0; i<10; i++) {
			
			System.out.println(temp.compareTo(temp)); 
		}
		
		
	}

}

/*
 * 
 * given unsorted array of numbers the numbers are 3, 8, 1, 9, 5
 * 
 * genetrate all the 5 digit nos using this array of no less than 50,000
 * 
 * 
 * 13589, 13598, 15389, 15398 --------- 39851
 * 
 * 
 * 
 */
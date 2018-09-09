package function;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 * query the number of character
 */
public class C_function {
	
	public static void query(){
		
	}
	
	public static void query(InputStreamReader isr){
		int data;
		int i = 0;
		try {
			while((data = isr.read())!=-1){
				i++;
			}
			System.out.println("The number of characters: "+ i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

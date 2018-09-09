package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * query the line number
 */
public class L_funciton {
	
	public static void query(){
		
	}
	
	public static void query(InputStreamReader isr) throws IOException{
		int i = 0;
		BufferedReader br = new BufferedReader(isr);
		try {
			while((br.readLine())!=null){
				i++;
			}
			System.out.println("The line number: "+i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			br.close();
		}
	}
}

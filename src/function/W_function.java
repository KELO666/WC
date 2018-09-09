package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * query the number of words
 */
public class W_function {
	
	public static void query(){
		
	}
	
	public static String replace(String str){
		String str1;
		str1 = str.replaceAll("[^a-zA-Z-_']", " ");
		return str1;
	}
	
	public static void query(InputStreamReader isr) throws IOException{
		int data = 0;
		int num = 0;
		BufferedReader br = new BufferedReader(isr);
		String line ;
		try {
			while((line=br.readLine()) != null){
				String str = replace(line);
				for(int i=0;i<str.split(" ").length;i++){
					if("".equals(str.split(" ")[i])){
						num++;
					}
					System.out.println(str.split(" ")[i]);
				}
				data += str.split(" ").length;
			}
			int a = data-num;
			System.out.println("The number of words : "+a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
}

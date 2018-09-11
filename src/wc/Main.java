package wc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * the Launcher of the program
 */
public class Main {

	static String s,s1,s2;
	
	public static void main(String[] args) throws IOException {
		while(true){
			welcome();
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			s1 = s.substring(0, 2);// instructions
			s2 = s.substring(3);// address
			File file = new File(s2);
			InputStream is = null;
			InputStreamReader isr = null;

			try {
				
			    if(s1.equals("-c")&&file.exists()){
			    	is = new FileInputStream(file);
					isr = new InputStreamReader(is);
					function.C_function.query(isr);
					is.close();
					isr.close();
				}else if(s1.equals("-w")&&file.exists()){
					is = new FileInputStream(file);
					isr = new InputStreamReader(is);
					function.W_function.query(isr);
					is.close();
					isr.close();
				}else if(s1.equals("-l")&&file.exists()){
					is = new FileInputStream(file);
					isr = new InputStreamReader(is);
					function.L_funciton.query(isr);
					is.close();
					isr.close();
				}else{
					System.out.println("This function has not yet been opened or your path is wrong.");
				}
	 		} catch (FileNotFoundException e) {
					e.printStackTrace();
			} 
		}
	
		
	}
	
	public static void welcome(){
		System.out.println("*************************************");
		System.out.println("*               WC.exe              *");
		System.out.println("*Only for learning and communication*");
		System.out.println("*            author：KELO           *");
		System.out.println("*************************************");
		System.out.println("Please input instructions and file paths.");
		

	}

}

package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {
	
	public static void main(String[] args) throws IOException {
		
		//crate a new text file
		
		File f = new File("C:\\testing\\temp.text");
		f.createNewFile();
		
		//Write into text file
		FileWriter fw = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fw);
		
		out.write("This is 1st Line");
		out.newLine();
		out.write("This is 2nd Line");
		out.newLine();
		out.write("This is 3rd Line");
		out.newLine();
		out.write("This is 4th Line");
		out.newLine();
		out.write("This is 5th Line");
		out.flush();
		
		//read from Text file
		
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
		String x;
		int i=0;
		while((x=rd.readLine())!=null) {
			System.out.println(x);
			i++;
		}
		System.out.println("Number of Lines : "+i);
		
		
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
	
	}
}

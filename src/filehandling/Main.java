package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String args[]) throws IOException{
		
		File create = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		if(create.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created");
		}
		
		FileWriter writes = new FileWriter("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		writes.write("Hello java...");
		writes.close();
		
		FileReader reads = new FileReader("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		String data=reads.readAllAsString();
		System.out.println(data);
		reads.close();
		
//		int info;
//		while((info=reads.read())!=-1) {
//			System.out.println((char)info);
//			System.out.println(info);
//		}
//		System.out.println();
//		reads.close();
		
		create.delete();
	}
}

package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File create = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.java");
		if(create.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is  already created");
		}
		
		FileWriter writes = new FileWriter("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.java");
		writes.write("class Main{"
				+ "public static void main(String[] args){"
				+ "System.out.println('Hello world');"
						+ "}"
						+ "}");
		writes.close();
		
		FileReader read = new FileReader("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.java");
		String data=read.readAllAsString();
		System.out.println(data);
		read.close();
		
		create.delete();

	}

}

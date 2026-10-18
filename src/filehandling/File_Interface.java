package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Interface {
	
	public void create() throws IOException {
		File create = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		if(create.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created");
		}
	}
	
	public void write() throws IOException {
		FileWriter writes = new FileWriter("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		writes.write("Hello java...");
		writes.close();
	}
	
	public void read()throws IOException {
		FileReader reads = new FileReader("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		String data=reads.readAllAsString();
		System.out.println(data);
		reads.close();
	}
	
	public void delete() throws IOException {
		File create = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\hello.txt");
		if(create.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created");
		}
		create.delete();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File_Interface F =new File_Interface();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("File handling");
			System.out.println("1.CREATE");
			System.out.println("2.WRITE");
			System.out.println("3.READ");
			System.out.println("4.DELETE");
			System.out.println("0.Exit");
			System.out.print("Enter your option : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				F.create();
				break;
			case 2:
				F.write();
				break;
			case 3:
				F.read();
				break;
			case 4:
				F.delete();
				break;
			case 0:
				System.out.println("Application is stopped");
				break;
			default:
				System.out.println("Invalid option");
				
			}
			
		}while(choice!=0);
		
		sc.close();
	}

}

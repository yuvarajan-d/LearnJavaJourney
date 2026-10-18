package filehanding_and_collection_praactice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
	
	public void createnewfile() {
		try {
			File file=new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\student.txt");
			if(file.createNewFile()) {
				System.out.println("File is created successfully");
			}else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void write_txt_file() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\yuvar\\OneDrive\\Desktop\\student.txt");
			fw.write("Yuvarajan\n");
			fw.close();
			System.out.println("Data written successfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filehandling f=new Filehandling();
		f.createnewfile();
		f.write_txt_file();

	}

}

package filehandling;

import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) throws IOException {
		File myFile = new File("data.txt");
		if(myFile.createNewFile()) {
			System.out.println("File created  Successfully...");
		}
		else {
			System.out.println("File creation error...");
		}
	}

}

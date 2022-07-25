package filehandling;


import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		String data ="1, Naveen ,Kadapa ,Andhra pradesh";
		
		try {
			FileWriter output = new FileWriter("data.txt");
			output.write(data);
			System.out.println("Data is writted successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File write error....");
		}

	}

}

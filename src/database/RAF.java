package database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {

	public static final String FILE_PATH = "data/data.txt";
	
	public static void writeToFile(String file, String dataToWrite, int position) 
	{
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(file, "rw");
			try {
				raf.seek(position);
				raf.write(dataToWrite.getBytes());
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static byte[] readFromFile(String file, int position, int size) 
	{
		byte[] bytesRead = new byte[size];
		
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			
			try {
				raf.seek(position);
				raf.read(bytesRead);
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return bytesRead;
	}
	
}

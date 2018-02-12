package com.elife.corejavaprogs;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {

		printFile();
		
	}

	private static void printFile() throws IOException {

		try(FileInputStream input = new FileInputStream("D:/Users/lputta/Desktop/ids.txt")){
			int data = input.read();
			while(data != -1) {
				System.out.println((char) data);
				data = input.read();
			}
		}
	}

}

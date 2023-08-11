package cpt311_2019_1_77106CT;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Database {
	private BufferedWriter writer;
	private BufferedReader reader;
	public Database (File file, String[] fields) {
		try {
			String firstLine= null;
			setWriter(new BufferedWriter(new FileWriter(file,true)));
			setReader(new BufferedReader(new FileReader(file)));
//			check the first line of the csv file for the heading
			firstLine = reader.readLine();
			if(!file.exists() || firstLine == null) {
				for(String field:fields) {
					writer.append(field+",");
					writer.flush();					
				}			
			}
		} catch(IOException ex) {
			System.out.println("Somethig went wrong!");
			ex.printStackTrace();
		}
		
	}
	public BufferedWriter getWriter() {
		return writer;
	}
	public void setWriter(BufferedWriter writer) {
		this.writer = writer;
	}
	public void writeToDB(String ...args) {
		try {
			writer.newLine();
			for(String a:args) {
				writer.append(a+",");
				writer.flush();
			}
			
			writer.close();
		}catch(IOException ex) {
			System.out.println("Something went wrong!");
			ex.printStackTrace();
		}
		
	}
	public BufferedReader getReader() {
		return reader;
	}
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
}

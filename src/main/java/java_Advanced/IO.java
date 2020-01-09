package java_Advanced;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class IO {
	
	public static void main(String[] args) throws IOException {
		new IO().readFile();
	
}
	
	public void readFile() throws IOException {
		File file = new File("C:\\Users\\groov\\eclipse\\Java Project\\src\\file.properties");
     	String read = FileUtils.readFileToString(file,"UTF-8");
		System.out.println(read);
		List<String> list = FileUtils.readLines(file, "UTF-8");
		Collections.sort(list);
		write();
		for(String s : list) {
			System.out.println(s);	
		}
		copyFile();
	}
	
	public void write() throws IOException {
	
		String add = "PINS";
		double d = Math.random();
		File file = new File("C:\\Users\\groov\\eclipse\\Java Project\\src\\file.properties");
		FileUtils.write(file, "\nCode="+d+add+"", "UTF-8", true);
		 
	}
	
	public void copyFile() throws IOException {
		File file1 = new File("C:\\Users\\groov\\eclipse\\Java Project\\src\\file.properties");
		File file2 = new File("C:\\Users\\groov\\eclipse\\Java Project\\file.properties");
		FileUtils.copyFile(file1, file2, false);
	}
	
	public void checkDuplicates() throws IOException {
		File file = new File("C:\\Users\\groov\\eclipse\\Java Project\\file.properties");
		String str = FileUtils.readFileToString(file);
		str = str.replace("\n", "");
		String[] arr = str.split(" ");
		String str2 = "";
		for(String s : arr) {
			if(!str2.contains(s) && s.trim()!="") {	
				str2 = str2 + " " + s;
			}
			
			FileUtils.write(file, str2,"UTF-8",false);
		}
		
	}
}

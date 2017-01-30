package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {

	
	public void IO(){
		
	}
	
	public String readFile(String filePath) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line = br.readLine()) != null){			
			sb.append(line + "\n");
		}
		return sb.toString();
	}
	
	public void writeFile(String filePath, String hex) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		bw.write(filePath);
	}
	

}

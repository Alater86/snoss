package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

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
	
	public void writeFile(String filePath, List<byte[]> toWrite) throws IOException{
		int instructionLength = 4;
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		byte[] finalWrite = new byte[toWrite.size() * instructionLength]; 
		int index = 0;
		for (byte[] bs : toWrite) {
			for (byte b : bs) {
				finalWrite[index] = b;
				index++;
			}
		}
		bw.write(finalWrite.toString());
		bw.flush();
		bw.close();
	}
	

}

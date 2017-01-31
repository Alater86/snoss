package Controlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assembler {
	
	public List<byte[]> convertFile(String assembly) throws IOException{
		List<byte[]> byteFile = new ArrayList<byte[]>();
		String file = assembly;
		String[] lines = file.split("\\n");
		
		for (String lin : lines) {
			BinaryConverter bc = new BinaryConverter();
			String[] command = lin.split(" ");
			byte[] inst = new byte[4];
			String com = command[0];
			switch(com){
			case "LOAD":{
				inst[0] = 1; 
				inst[1] = assignRegister(command[1]);
				byte[] address = bc.intConversion(Integer.valueOf(command[2]));
				inst[2] = address[0];
				inst[3] = address[1];
				byteFile.add(inst);
				break;
			}
			case "LOADC":{
				inst[0] = 10;
				inst[1] = assignRegister(command[1]);
				byte[] address = bc.intConversion(Integer.valueOf(command[2]));
				inst[2] = address[0];
				inst[3] = address[1];
				byteFile.add(inst);
				break;
			}
			case "STORE":{
				inst[0] = 2;
				byte[] address = bc.intConversion(Integer.valueOf(command[1]));
				inst[1] = address[0];
				inst[2] = address[1];
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "ADD":{
				inst[0] = 3;
				inst[1] = assignRegister(command[1]);
				inst[2] = assignRegister(command[2]);
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "SUB":{
				inst[0] = 4;
				inst[1] = assignRegister(command[1]);
				inst[2] = assignRegister(command[2]);
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "MUL":{
				inst[0] = 5;
				inst[1] = assignRegister(command[1]);
				inst[2] = assignRegister(command[2]);
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "DIV":{
				inst[0] = 6;
				inst[1] = assignRegister(command[1]);
				inst[2] = assignRegister(command[2]);
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "EQ":{
				inst[0] = 7;
				inst[1] = assignRegister(command[1]);
				inst[2] = assignRegister(command[2]);
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "GOTO":{
				inst[0] = 8;
				byte[] address = bc.intConversion(Integer.valueOf(command[1]));
				inst[1] = address[0];
				inst[2] = address[1];
				byteFile.add(inst);
				break;
			}
			case "GOTOIF":{
				inst[0] = 11;
				byte[] address = bc.intConversion(Integer.valueOf(command[1]));
				inst[1] = address[0];
				inst[2] = address[1];
				inst[3] = assignRegister(command[3]);
				byteFile.add(inst);
				break;
			}
			case "CPRINT":{
				inst[0] = 9;
				byte[] address = bc.intConversion(Integer.valueOf(command[1]));
				inst[1] = address[0];
				inst[2] = address[1];
				byteFile.add(inst);
				break;
			}
			case "CREAD":{
				inst[0] = 16;
				byte[] address = bc.intConversion(Integer.valueOf(command[1]));
				inst[1] = address[0];
				inst[2] = address[1];
				byteFile.add(inst);
				break;
			}
			case "EXIT":{
				inst[0] = 17;
				byteFile.add(inst);
				break;
			}
			}
		}
		return byteFile;
	}

	public byte assignRegister(String reg){
		byte ret = 0;
		if(reg == "R1"){
			ret = 0;
		}else if(reg == "R2"){
			ret = 1;
		}else if(reg == "R3"){
			ret = 2;
		}else if(reg == "R4"){
			ret = 3;
		}else if(reg == "R5"){
			ret = 4;
		}else if(reg == "R6"){
			ret = 5;
		}
		return ret;
	}
	
	


}

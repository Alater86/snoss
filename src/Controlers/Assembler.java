package Controlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IO.IO;

public class Assembler {

	public static void main(String[] args) throws IOException {
		Assembler a = new Assembler();
		a.convertFile();
	}
	//will have string paramater to take in file path
	public void convertFile() throws IOException{
		List<byte[]> wholeFile = new ArrayList<byte[]>();
		IO io = new IO();
		String file = io.readFile("Assembly/TestAssembly.txt");
		String[] lines = file.split("\\n");
		
		for (String lin : lines) {
			String[] command = lin.split(" ");
			byte[] inst = new byte[4];
			String com = command[0];
			switch(com){
			case "LOAD":{
				inst[0] = 1; 
				inst[1] = assignRegister(command[1]);
				
				

				break;
			}
			case "LOADC":{
				one = "0a";
				two = assignRegister(command[1]);
				
				

				break;
			}
			case "STORE":{
				one = "02";
				
				
				four = assignRegister(command[3]);
				
				break;
			}
			case "ADD":{
				one = "03";
				two = assignRegister(command[1]);
				three = assignRegister(command[2]);
				four = assignRegister(command[3]);
				
				break;
			}
			case "SUB":{
				one = "04";
				two = assignRegister(command[1]);
				three = assignRegister(command[2]);
				four = assignRegister(command[3]);

				break;
			}
			case "MUL":{
				one = "05";
				two = assignRegister(command[1]);
				three = assignRegister(command[2]);
				four = assignRegister(command[3]);

				break;
			}
			case "DIV":{
				one = "06";
				two = assignRegister(command[1]);
				three = assignRegister(command[2]);
				four = assignRegister(command[3]);

				break;
			}
			case "EQ":{
				one = "07";
				two = assignRegister(command[1]);
				three = assignRegister(command[2]);
				four = assignRegister(command[3]);

				break;
			}
			case "GOTO":{
				one = "08";
				
				
				four = null;

				break;
			}
			case "GOTOIF":{
				one = "0b";
				
				
				four = assignRegister(command[3]);

				break;
			}
			case "CPRINT":{
				one = "09";
				
				
				

				break;
			}
			case "CREAD":{
				one = "10";
				
				
				

				break;
			}
			case "EXIT":{
				one = "11";
				two = null;
				three = null;
				four = null;

				break;
			}
			}
		}
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

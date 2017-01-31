package Shell;

import java.io.IOException;
import java.util.Scanner;

import Controlers.Assembler;
import Hardware.CPU;
import Hardware.Disk;
import Hardware.RAM;

public class Shell {
	
	public void runShell(){
		Scanner scan = new Scanner(System.in);
		Disk disk = new Disk();
		Assembler assemb = new Assembler();
		CPU cpu = new CPU();
		RAM ram = new RAM();
		
		String root = "Root/";
		boolean exit = false;
		while(exit != true){
			System.out.print("user/root:");
			String cmd = scan.nextLine();
			String[] parts = cmd.split(" ");
			
			if(cmd.equals("ls")){
				disk.returnFilesNames();
			}else if(cmd.equals("ps")){
				
			}else if(parts[0].equals("exec")){
				runExec(disk, assemb, root, parts, cpu, ram);
			}else if(parts[0].equals("exec_i")){
				
			}else if(parts[0].equals("kill")){
				
			}else if(cmd.equals("exit")){
				exit = true;
			}
		}
	}

	private void runExec(Disk disk, Assembler assemb, String root, String[] parts, CPU cpu, RAM ram) {
		try {
			String file = disk.readFile(root + "Assembly/" + parts[1] + ".txt");
			disk.writeFile(root + "/Binary/" + parts[1] + "binary.txt" , assemb.convertFile(file));
			String binary = disk.readBinary(root + "Binary/" + parts[1] + "binary.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}

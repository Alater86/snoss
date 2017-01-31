package Shell;

import java.util.Scanner;

public class Shell {
	
	public void runShell(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cmd");
		String cmd = scan.nextLine();
		String[] parts = cmd.split(" ");
		while(cmd != "Exit" || cmd != "exit"){
			if(cmd == "ls"){
				
			}else if(cmd == "ps"){
				
			}else if(parts[0] == "exec"){
				
			}else if(parts[0] == "exec_i"){
				
			}else if(parts[0] == "kill"){
				
			}
		}
	}

}

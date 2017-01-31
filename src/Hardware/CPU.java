package Hardware;

public class CPU {
	
	private int numberOfRegesters = 6;
	Register[] regs = new Register[numberOfRegesters];
	
	public CPU(){
		fillRegesters();
	}
	
	private void fillRegesters(){
		for (int i = 0; i < numberOfRegesters ; i++) {
			regs[i] = new Register();
		}
	}
	
	public void startprocess(int indexStart, int indexEnd){
		byte[] command = fetch();
		execute(command);
		increment();
	}

	private byte[] fetch() {

		return null;
	}
	
	private void execute(byte[] command) {
		
	}
	
	private void increment() { 
		
	}



	
	
			
	//fetch returns byte[]
	//execute
	//increment

}

package Hardware;

import Controlers.InitilizeRAM;

public class RAM {
	//10,000 bytes of ram
	byte[] ram;
	
	public RAM (){
		this.ram = new byte[10000];
		InitilizeRAM iRam = new InitilizeRAM(this);
	}
	
	public void insert(int location, byte value){
		ram[location] = value;
	}
	
	public byte[] ramBlcok(){
		return ram;
	}
	
	public byte get(int location){
		return ram[location];
	}
}

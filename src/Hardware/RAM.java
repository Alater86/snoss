package Hardware;

public class RAM {
	//10,000 bytes of ram
	byte[] ram;
	
	public RAM (){
		this.ram = new byte[10000];
	}
	
	public void insert(int location, byte value){
		ram[location] = value;
	}
	
	@SuppressWarnings("null")
	public void delete(int location){
		ram[location] =(Byte) null;
	}
	
	public byte get(int location){
		return ram[location];
	}
}

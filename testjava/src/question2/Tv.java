package question2;

public class Tv {
	int channel;
	String color;
	
	
	public void print() {
		
		System.out.println("Tv의 현재채널은 : "+channel+"이고, Tv의 색깔은 "+color+"입니다.");
		
	}
	
	public int channelUp() {
		channel++;
		return channel;
	}
	
	public int channelDown() {
		channel--;
		return channel;
	}


}

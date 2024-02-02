package chapter07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int prevChannel;

	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;  //범위 외 숫자일 때
		//처음엔 0이 들어감. 
		//받은 값을 아랫줄에서 넣어줌으로써 다음에 이 메서드를 다시 호출했을 때 아랫줄에서 넣었던 값이 prevChannel에 담기도록 설정
		prevChannel = this.channel;  
		this.channel = channel;  //매개변수로 받은 값을 맴버변수에 넣어주기
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Exercise7_10 {
	// [7-10]
	//	MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
	//	수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
	//	getter와 setter메서드를 추가하라.
	// [7-11]
	//	 이전 채널(previous channel)로 이동하는
	//	 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
	//	 [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}

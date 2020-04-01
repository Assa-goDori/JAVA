package chap9;
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean state) {
		if(state) System.out.println("음소거");
		else System.out.println("음소거 해제");
	}
	static void changeBattery() { 
		System.out.println("건전지 교체");
	}
}

class TeleVision implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println(toString() + "를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println(toString() + "를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(toString() + "볼륨 : " + this.volume);
	}

	public String toString() {
		return "TV";
	}
}

class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println(toString() + "를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(toString() + "를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(toString() + "볼륨 : " + this.volume);
	}

	public String toString() {
		return "Audio";
	}
}

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = new TeleVision();
		rc.turnOn();		//tv 실행
		rc.setVolume(10);	//tv 볼륨 : 10
		rc.turnOff();		//tv 종료
		rc.setMute(true);	//음소거
		rc = new Audio();
		rc.turnOn();		//오디오 실행
		rc.setVolume(20);	//오디오 볼륨 : 20
		rc.turnOff();		//오디오 종료
		rc.setMute(false);	//음소거
		RemoteControl.changeBattery();
	}
}
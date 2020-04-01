package chap9;
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean state) {
		if(state) System.out.println("���Ұ�");
		else System.out.println("���Ұ� ����");
	}
	static void changeBattery() { 
		System.out.println("������ ��ü");
	}
}

class TeleVision implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println(toString() + "�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println(toString() + "�� ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(toString() + "���� : " + this.volume);
	}

	public String toString() {
		return "TV";
	}
}

class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		System.out.println(toString() + "�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println(toString() + "�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(toString() + "���� : " + this.volume);
	}

	public String toString() {
		return "Audio";
	}
}

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = new TeleVision();
		rc.turnOn();		//tv ����
		rc.setVolume(10);	//tv ���� : 10
		rc.turnOff();		//tv ����
		rc.setMute(true);	//���Ұ�
		rc = new Audio();
		rc.turnOn();		//����� ����
		rc.setVolume(20);	//����� ���� : 20
		rc.turnOff();		//����� ����
		rc.setMute(false);	//���Ұ�
		RemoteControl.changeBattery();
	}
}
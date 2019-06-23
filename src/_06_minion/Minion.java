package _06_minion;

public class Minion {

	// TODO Auto-generated method stub
	String name;
	int eyes;
	String color;
	String master;

	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		master = string;
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return master;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void setEyes(int eyes) {
		this.eyes = eyes;
	}
}

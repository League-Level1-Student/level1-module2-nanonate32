package _01_getters_and_setters;

public class People {

	// TODO Auto-generated method stub
	String name;
	String superpower;

	People(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;
	}

	String getName() {
		return name;
	}

	String getSuperpower() {
		return superpower;
	}

	void setName() {
		this.name = name;

	}

	void setSuperpower() {
		this.superpower = superpower;
	}
	public String toString() {
		return name + " has a superpower of " + superpower;
		
	}
	}


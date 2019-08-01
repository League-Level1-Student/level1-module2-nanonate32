package _07_tea_party;

public class TeaParty {

	public static void main(String[] args) {

	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
    String welcome = "Hello";
		if (isWoman && !isKnighted) {
			
            welcome += " Ms. ";
		}
		if (!isWoman && isKnighted) {
			
			welcome += " Sir ";

		}
		if (isWoman && isKnighted) {
			
            welcome += " Lady ";
		}
		if (!isWoman && !isKnighted) {
			
			welcome += " Mr. ";
		}
      return welcome + name;
	}
}

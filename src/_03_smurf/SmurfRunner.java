package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf HandySmurf = new Smurf("Bob");
		HandySmurf.eat();

		System.out.println(HandySmurf.getName());
	    Smurf PapaSmurf = new Smurf("Smurfette");
	    System.out.println(PapaSmurf.getName());
	    System.out.println(PapaSmurf.getHatColor());
	    System.out.println(PapaSmurf.isGirlOrBoy());
	    Smurf Smurfette = new Smurf("PapaSmurf");
	    System.out.println(Smurfette.getName());
	    System.out.println(Smurfette.getHatColor());
	    System.out.println(Smurfette.isGirlOrBoy());
	}
}

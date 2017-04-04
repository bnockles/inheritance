package inheritance;

public class JaviyWang extends ClubMember {

	public JaviyWang() {
		super("Javiy", "Wang", 2017, Main.COMP_SCI_MAJOR,"anime");
	}

//	public JaviyWang(String name, String surname, int gradClass, Major major) {
//		super(name, surname, gradClass, major);
//		// TODO Auto-generated constructor stub
//	}

	public void act(){
		System.out.println("Hi I'm Javiy Wang and this is all I have to say");
		stateClub();
	}
}

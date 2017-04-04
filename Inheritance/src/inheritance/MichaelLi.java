package inheritance;

public class MichaelLi extends ClubMember {

	public MichaelLi() {
		super("Michael", "Li", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act(){
		System.out.println("Hi. My name is Michael. I think penguins are cool.");
	}
}

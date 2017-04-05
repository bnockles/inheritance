package inheritance;

import java.util.ArrayList;

public class MichaelLi extends ClubMember {

	public MichaelLi() {
		super("Michael", "Li", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act(){
		System.out.println("Hi. My name is Michael. I think penguins are cool.");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub() == "pokemon"){
				shakeHandsWith(s);
			}
		}
		System.out.println("I've shook hands with");
		for(Student s: getHandshakes()){
			System.out.print(s.getFirstName());
		}
	}
}

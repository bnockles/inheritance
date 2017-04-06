package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MichaelLi extends ClubMember implements American{
	
	ArrayList<Student> Hacker = new ArrayList<Student>();
	ArrayList<Student> NA = new ArrayList<Student>();

	public MichaelLi() {
		super("Michael", "Li", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act(){
		System.out.println("Hi. My name is Michael. I think penguins are cool.");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub() == "pokemon" && s.getFirstName() != this.getFirstName()){
				shakeHandsWith(s);
			}
		}
		System.out.println("I've shook hands with");
		for(Student s: getHandshakes()){
			System.out.print(s.getFirstName());
		}
	}
	
	public void run(){
		
		int runCount = 0;
		if (runCount < 1){
			FindNAOrH();
			runCount = 1;
		}
		
		while(this.isAlive()){
			for (Student s: NA){
				this.mutate();
				s.corrupt();
			}
			
			for(Student s: Hacker){
				this.mutate();
				s.mutate();
			}
		}
	}
	
	public void FindNAOrH(){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s:students){
			if(s instanceof Hacker){
				Hacker.add(s);
			}else{
				NA.add(s);
			}
		}
	}
	
	public void receiveMessage(Message message){
		ArrayList<Student> students = Main.getAllStudents();
		while(true){
			Integer rand = (int)(Math.random() * students.size()); 
			if (students.get(rand) instanceof American && students.get(rand) != this && !(students.get(rand) instanceof Spy)){
				message.pass(this, students.get(rand));
				break;
			}
		}
	}
}

package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DanielQuinde extends ClubMember implements American{
	public DanielQuinde(){
		super("Daniel", "Quinde", 2017, Main.COMP_SCI_MAJOR,"batman");

	}	
	public void act(){
		ArrayList<Student> studentList =  Main.getAllStudents();

		for(int i =0; i<studentList.size();i++){
			if(((ClubMember) studentList.get(i)).getClub().equals(getClub())&&studentList.get(i).getFirstName()!=getFirstName()){
				shakeHandsWith(studentList.get(i));

			}
		}


		System.out.println("Daniel Quinde");
	}
	
	public void receiveMessage(Message message){
		ArrayList<Student> studentList =  Main.getAllStudents();
		for(int i =0; i<studentList.size();i++){
			if(studentList.get(i).getFirstName().equals("Matthew")&&studentList.get(i).getLastName().equals("Chu"));
			message.pass(this,(studentList.get(i)));

			}
		}

		
		
	

	public void run(){
		ArrayList<Student> studentList =  Main.getAllStudents();
		while(this.isAlive()){
			for(Student s: studentList){
				if(s instanceof Hacker && s!=this){
					s.mutate();

				}

				if(s instanceof NetworkAdministrator){
					s.corrupt();
				}
			}

		}

	}
}


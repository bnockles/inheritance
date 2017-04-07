package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DanielQuinde extends ClubMember implements Coder{
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
		for(Student s: studentList){
			if(s.getFirstName().equals("Hans")){
				message.pass(this, s);
			}
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


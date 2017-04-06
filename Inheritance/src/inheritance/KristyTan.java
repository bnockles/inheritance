package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class KristyTan extends ClubMember implements American {

	public KristyTan() {
		super("Kristy", "Tan", 2017, Main.COMP_SCI_MAJOR, "batman");
	}
	
	 public void act(){
		 System.out.println("Kristy Tan");
		 ArrayList<Student> students1 = Main.getAllStudents();
		 for(int i = 0; i < students1.size(); i++){
			 if(students1.get(i).getLastName() != "Tan" && ((ClubMember) students1.get(i)).getClub() == "batman"){
				 shakeHandsWith(students1.get(i));
			 }
		 } 
	 }   
	 
	 public void run(){
		 ArrayList<Student> students2 = Main.getAllStudents();
			 for(int i = 0; i < students2.size(); i++){
				 if(students2.get(i) instanceof NetworkAdministrator && isAlive() == false && students2.get(i).getLastName() != "Tan"){
					students2.get(i).restore(); 
				 }
				 else if(students2.get(i) instanceof Hacker){
					 students2.get(i).createPatch();
				 }
			 } 
	 }
	 
	 public void receiveMessage(Message message){
		 int s = 0;
		 for(int i = 0; i < Main.getAllStudents().size(); i++){
			 if(Main.getAllStudents().get(i).getLastName() == "Lo"){
				 s = i;
				 break;
			 } 
		 }
		 message.pass(this, Main.getAllStudents().get(s));
	 }
} 
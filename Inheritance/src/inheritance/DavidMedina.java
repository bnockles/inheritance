package inheritance;

import inheritance.Main.Message;

public class DavidMedina extends ClubMember implements Soviet {

	public DavidMedina() {
		// TODO Auto-generated constructor stub
		super("David", "Medina", 2017, Main.COMP_SCI_MAJOR, "coding for dummies");
	}

	
	public void act(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember){
				if(((ClubMember)s).getClub().equals(getClub()) 
						&& ((ClubMember)s) != this){
					shakeHandsWith(s);
				}
			}
		}
	}
	
	public void run(){
		
		this.restore();
		
		for(int i = 0; i < Main.getAllStudents().size(); ++i){
			this.restore();
			
			if(Main.getAllStudents().get(i) instanceof NetworkAdministrator){
				Main.getAllStudents().get(i).restore();
			}
			else{
				Main.getAllStudents().get(i).createPatch();
			}
		}
	}
	
	public void receiveMessage(Message message)
	{
		for(int i = 0; i < Main.getAllStudents().size(); ++i)
		{
			if(Main.getAllStudents().get(i) instanceof Soviet 
					&& Main.getAllStudents().get(i) != this)
			{
				message.pass(this, Main.getAllStudents().get(i));
			}
		}
	}
	
}

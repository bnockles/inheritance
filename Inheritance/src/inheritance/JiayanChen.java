package inheritance;

import inheritance.Main.Message;

public class JiayanChen extends ClubMember implements American {

	
	public JiayanChen() {
		super("Jiayan", "Chen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
		// TODO Auto-generated constructor stub
	}
	
	public void act()
	{
		stateName();
		System.out.println("hiiii");
		for(Student s : Main.getAllStudents()){
			ClubMember member = (ClubMember) s;
			if(member.getClub().equals(this.getClub())&& !s.getFirstName().equals("Jiayan") )
				shakeHandsWith(s);
		}
	}  
	/*public void run() {
			for(Student s : Main.getAllStudents()){
				if(s instanceof Hacker){
						try { 
							s.mutate();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}  
			}
	}		 */	 
	public void receiveMessage(Message message) {
		for(Student s: Main.getAllStudents()){
			if(s.getFirstName().equals("Hans")){
				message.pass(this, s);
				break;  
			}
		}
		 
	}
}	

  
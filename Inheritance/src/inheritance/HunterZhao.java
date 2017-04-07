package inheritance;

import inheritance.Main.Message;

public class HunterZhao extends ClubMember implements Hacker, Soviet {

	public HunterZhao() {
		super("Hunter", "Zhao", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}

	public void act(){
		run();
		System.out.println("Hunter Zhao");
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember && ((ClubMember)Main.getAllStudents().get(i)).getClub().equals("roblox")){
				if(!Main.getAllStudents().get(i).getFirstName().equals("Hunter")){
					shakeHandsWith(Main.getAllStudents().get(i));
				}
			}
		}
	}

	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof Hacker && !s.isAlive()){
					s.mutate();
				}else if(s instanceof NetworkAdministrator && s.isAlive()){
					s.corrupt();
				}
			}
		}
	}
	
	public void receiveMessage(Message message) {
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i).getFirstName().equals("Hunter")){
				for(int k = i+1; k < Main.getAllStudents().size()-1; k++){
					if(Main.getAllStudents().get(k) instanceof Soviet){
						message.pass(this, Main.getAllStudents().get(k));
						return;
					}else{
						for(Student s: Main.getAllStudents()){
							if(s instanceof Soviet){
								message.pass(this, s);
								return;
							}
						}
					}
				}
			}
		}
	}
}
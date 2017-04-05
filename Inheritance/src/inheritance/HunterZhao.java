package inheritance;

public class HunterZhao extends ClubMember implements Hacker {

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
}


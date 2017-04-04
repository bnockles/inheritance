package inheritance;

public class TobyHuang extends ClubMember implements Hacker{

	public TobyHuang() {
		super("Toby","Huang",2010,Main.COMP_SCI_MAJOR,"anime");
	}
	
	public void act(){
		System.out.println("Toby Huang is alive");
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub())){
				shakeHandsWith(s);
			}
		}
	}
	
	public void run() {
		while(isAlive()){
			for(int i=0; i<Main.getAllStudents().size(); i++){
				if(Main.getAllStudents().get(i) instanceof Hacker){
					Main.getAllStudents().get(i).mutate();
				}else{
					Main.getAllStudents().get(i).corrupt();
				}
			}
		}
	}

}

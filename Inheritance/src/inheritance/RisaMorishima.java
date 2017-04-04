package inheritance;

public class RisaMorishima extends ClubMember implements Hacker{

	public RisaMorishima() {
		super("Risa", "Morishima", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	public void act(){
		System.out.println("Risa Morishima");
		
		for(Student s : Main.getAllStudents()){
			ClubMember member = (ClubMember) s;
			
			if(member.getClub().equals(getClub()) && !s.getFirstName().equals(getFirstName()))
				shakeHandsWith(s);
		}
	}
	
	public void run(){
		while(true){
			try{
				mutate();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}

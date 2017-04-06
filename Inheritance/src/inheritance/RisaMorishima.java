package inheritance;

public class RisaMorishima extends ClubMember implements Soviet{

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
	
	public void recieveMessage(Message message){
		for(Student s : Main.getAllStudents()){
			if(s.getFirstName.equals("Jimmy"){
				message.ass(this, s);
				break;
			}
		}
	}
	
}

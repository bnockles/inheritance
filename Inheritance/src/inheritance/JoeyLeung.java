package inheritance;

public class JoeyLeung extends ClubMember implements Hacker{

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
		super("Joey", "Leung", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	
	@Override
	public void act(){
		System.out.print(getFirstName() + " "+getLastName());
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
//		for(Student b: getHandshakes()){
//			System.out.print(b.getFirstName());
//		}
	}
	
	public void run(){
		while(true){
			mutate();
			for(Student a: Main.getAllStudents()){
				mutate();
				if(a.getFirstName().equals("Daniel")||a.getFirstName().equals("Richard")||a.getFirstName().equals("Javiy")||a.getFirstName().equals("Gabriel")||a.getFirstName().equals("Hao")){
					a.mutate();
				}else{
					a.corrupt();
				}
			}
		}
	}
}

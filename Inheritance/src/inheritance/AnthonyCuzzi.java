package inheritance;

public class AnthonyCuzzi extends ClubMember implements NetworkAdministrator{
	
	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"anime");
	}
	
	
	public void act(){
		System.out.println("Anthony Cuzzi a student");
		for(Student s :  Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals("anime") && !(s.getFirstName().equals("Anthony")))
			shakeHandsWith(s);
		}
	}
	
	public void run(){
		while(super.isAlive()){
			int randInt= (int) (Math.random()*Main.getAllStudents().size());
			if(Main.getAllStudents().get(randInt).isAlive() == false){
				Main.getAllStudents().get(randInt).mutate();
			}else{
				Main.getAllStudents().get(randInt).corrupt();
			}
		}
	}

}

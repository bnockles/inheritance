package inheritance;
//
import inheritance.Main.Message;
//
public class JimmyWu extends ClubMember implements NetworkAdministrator,Soviet{

	private int nextStudentIndex = 0;

	public JimmyWu() {
		super("Jimmy", "Wu", 2017, Main.COMP_SCI_MAJOR, "k-pop");
	}
	
	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof NetworkAdministrator){
					s.restore();
				}else if(s instanceof Hacker){
					s.createPatch();
				}
			}
		}
	}
	
	public void act(){
		System.out.println("What's poppin? It's Jimmy Wu.");
		shakeAllHands();
	}
	
	public void stateStatus() {
		System.out.print("After I complete "+getMajor().getCulminatingCourse()+", I'll make mad bank.");
	}
	
	public void shakeAllHands(){
		for(Student c: Main.getAllStudents()){
			ClubMember s = (ClubMember) c;
			if(s.getClub().equals(getClub()) && !(s instanceof JimmyWu)){
				shakeHandsWith(c);
			}
		}
	}
	
	public void receiveMessage(Message message){
		for(int i=nextStudentIndex; i<Main.getAllStudents().size(); i++){
//			if(Main.getAllStudents().get(i) instanceof Soviet && !(Main.getAllStudents().get(i) instanceof Spy)){
//				nextStudentIndex = i+1;
//				message.pass(this, Main.getAllStudents().get(i));
//				System.out.println("Cyka Blyat");
//				break;
//			}
			if(Main.getAllStudents().get(i).getFirstName().equals("Zheng")){
				System.out.println("cyka blyat");
				message.pass(this, Main.getAllStudents().get(i));
				break;
			}
		}
	}

}

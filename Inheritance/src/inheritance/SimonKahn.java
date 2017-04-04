package inheritance;

public class SimonKahn extends ClubMember implements Hacker{

	public SimonKahn() {
		super("Simon", "Kahn", 666, Main.COMP_SCI_MAJOR, "tcg");

	}
public void act(){
	//System.out.println("Simon Kahn");
	//System.out.println("");
//
	for(Student i: Main.getAllStudents()){
		if (i.getFirstName()!="Simon"){
			i.corrupt();
		}
		//if (((ClubMember) i).getClub().equals("tcg")){
			//shakeHandsWith(i);
			
		//}
	//}
		//for(Student i: getHandshakes()){
		//System.out.print(" "+i.getFirstName());
	}
}

}

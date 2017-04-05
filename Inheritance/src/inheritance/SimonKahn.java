package inheritance;

import java.time.Instant;

import inheritance.Main.Message;

public class SimonKahn extends ClubMember implements Spy{

	public SimonKahn() {
		super("Simon", "Kahn", 666, Main.COMP_SCI_MAJOR, "tcg");

	}
public void act(){
	//System.out.println("Simon Kahn");
	//System.out.println("");

	run();
}
	public void run(){
//		for(Student i: Main.getAllStudents()){
//		if (i.getFirstName()!="Simon"){
//			i.corrupt();
//		}
		//if (((ClubMember) i).getClub().equals("tcg")){
			//shakeHandsWith(i);
			
		//}
	//}
		//for(Student i: getHandshakes()){
		//System.out.print(" "+i.getFirstName());
	}
	
public void recievedMessage(Message message)
{
	for(int i=0; i <Main.getAllStudents().size()-1;i++){
		if(Main.getAllStudents().get(i) instanceof Soviet){
Message.pass(Main.getAllStudents().get(i+1), Main.getAllStudents().get(0));
		}
		}
}

}
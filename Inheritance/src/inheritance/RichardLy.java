package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class RichardLy extends ClubMember implements Spy{

	public RichardLy() {
		// TODO Auto-generated constructor stub
		super("Richard", "Ly", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

//	public RichardLy(String name, String surname, int gradClass, Major major) {
//		super(name, surname, gradClass, major);
//		// TODO Auto-generated constructor stub
//	}
//	public void act(){
//		
//		stateName();
//		stateStatus();
//		stateClub();
//	}
	public void act(){
		System.out.println("Hai! My name is Richard Ly");
		shakeHands(Main.getAllStudents());
	}
	//if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
	//shakeHandsWith(a);
	public void shakeHands(ArrayList<Student> array){
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
	}
//	for(Student a: Main.getAllStudents()){
//		if(a.getFirstName().equals("Daniel")||a.getFirstName().equals("Richard")||a.getFirstName().equals("Javiy")){
//			a.mutate();
//		}
//	}
	public void run(){
		//corrupt()
		//mutate()
//		while(true){
//			mutate();
//			for(Student a : Main.getAllStudents()){
//				if(!(a.getFirstName().equals("Richard"))){
//					a.corrupt();
//				}
////				if(!(a.getFirstName().equals("Daniel")||a.getFirstName().equals("Richard")||a.getFirstName().equals("Gabriel")||a.getFirstName().equals("Javiy")||a.getFirstName().equals("Hao"))){
////					a.corrupt();
////				}
//			}
//		}
	}
	public void receiveMessage(Message message){
		message.pass((Student)this,Main.getAllStudents().get((int) (Math.random()*Main.getAllStudents().size())));
	}
}
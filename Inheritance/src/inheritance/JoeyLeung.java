package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JoeyLeung extends ClubMember implements Soviet{

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

	//instanceof is for checking interface

	public void run(){
	}

	//	spy
	//	public void receiveMessage(Message message){
	//		message.pass((Student)this,Main.getAllStudents().get((int) (Math.random()*Main.getAllStudents().size())));
	//	}

	//	Soviet
	private ArrayList<Integer> check = new ArrayList<Integer>();
	public void receiveMessage(Message message){
//		boolean o = false;
//		for(int i = 0;i<Main.getAllStudents().size();i++){
//			if(Main.getAllStudents().get(i) instanceof Soviet){
//				for(Integer a:check){
//					if(a == i){
//						o = true;
//					}
//				}
//				if(!o){
//					message.pass((Student)this,Main.getAllStudents().get(i));	
//					check.add(i);
//					return;
//				}
//			}
//		}
		for(Student i: Main.getAllStudents()){
			if(i.getFirstName().equals("Daniel")){
				message.pass(this,i);
				return;
			}
		}
	}
}
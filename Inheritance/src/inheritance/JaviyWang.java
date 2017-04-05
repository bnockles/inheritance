package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JaviyWang extends ClubMember implements Spy{

	public JaviyWang() {
		super("Javiy", "Wang", 2017, Main.COMP_SCI_MAJOR,"anime");
	}

	public void act(){
		System.out.println("Javiy Wang, this is all I have to say");
		addFriendsInTheSameClub(Main.getAllStudents());
		System.out.println(getHandshakes());
	}
	
	private void addFriendsInTheSameClub(ArrayList<Student> s){
		for(int i = 0;i < s.size();i++){
			if(((ClubMember) s.get(i)).getClub().equals("anime")&& !s.get(i).getFirstName().equals("Javiy")){
				shakeHandsWith(s.get(i));
			}
		}
		
	}
	
//	public void run(){
//		while(true){
//			try {
//				Thread.sleep(0);
//				mutate();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	public void recieveMessage(){
		for(int i = 1;i<Main.getAllStudents().size();i++){
			//Message.pass(Main.getAllStudents().get(0),Main.getAllStudents().get(i));
		}
	}
}

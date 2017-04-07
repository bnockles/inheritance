package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class JasonLau extends ClubMember implements Hacker, American ,RealSoviet {
	
	ArrayList<Student> arr = Main.getAllStudents();
	String message = "ryan pass teh wheat";
	int b = 0;
	int index = 1;
	
	
	public JasonLau(){
		super("Jason","Lau",2017,Main.COMP_SCI_MAJOR,"roblox");
	}
	
	public void act(){
		System.out.println("ayyy its ya buoy JLau");
		for(int i = 0; i < arr.size(); i++){
			if(((ClubMember) arr.get(i)).getClub().equals(this.getClub()) && 
					arr.get(i) != this){
				shakeHandsWith(arr.get(i));
				
			}
		}
		System.out.println("jason shook hands with" + getHandshakes());
	}
	
	public void run(){
//		for(int i = 0; i < arr.size(); i++){
//			int a = 0;
//			this.mutate();
//			if(arr.get(i) instanceof Hacker){
//				arr.get(i).mutate();
//				if(arr.get(i).getFirstName().equals("Matthew") || arr.get(i).getFirstName().equals("Ryan")&& 
//						arr.get(i) instanceof NetworkAdministrator){
//					b = i;
//					while(a < 40){
//						if(a % 4 == 0){
//							arr.get(b).corrupt();
//							a+=4;
//							System.out.println("no hard feeeligns maaaathew");
//						}
//					}
//				}
//				
//				
//			}
			
		
		Student hans = null;
		for (Student s : Main.getAllStudents()) {
			if (s.getFirstName().contains("Hans")) {
				hans = s;
				break;
			}
		}

		while (true) {
			Message m = new Main.Message();
			m.pass(this, hans);
		}
		
		}
	
	public void receiveMessage(Message message){		
			ArrayList<Student> soviets = new ArrayList<Student>();
			for(Student s: Main.getAllStudents()){
				if(s instanceof RealSoviet  && !(s instanceof American)){
					soviets.add(s);
				}
			}
			if(soviets.indexOf(this) == soviets.size()-1){
				message.pass(this, soviets.get(0));
			}else{
				message.pass(this, soviets.get(soviets.indexOf(this)+1));
			}
		
		

		
		
		
	}
	
	
}

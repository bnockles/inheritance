package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class ZhenXiao extends ClubMember implements NetworkAdministrator, Soviet{
	
	@SuppressWarnings("unused")
	private ArrayList<Student> metStudents;

	public ZhenXiao() {
		super("Zhen", "Xiao", 2017, Main.COMP_SCI_MAJOR, "tcg");
	}

	@Override
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
		stateClub();
		for (Student student : Main.getAllStudents()) {
			ClubMember clubStudent = (ClubMember)student;
			if (clubStudent.getClub().equalsIgnoreCase(this.getClub()) && student != this) {
				shakeHandsWith(student);
			}
		}
//		System.out.println("\nI am in the same club as ");
//		for (Student student : getHandshakes()) {
//			System.out.print(student.getFirstName() + ", ");
//		}
	}
	
	@Override
	public void stateName(){
		System.out.print("\nMy name is "+getFirstName()+" "+getLastName()+" but you can call me Alan! ");
	}
	
	@Override
	public void stateStatus(){
		System.out.print("After I complete "+getMajor().getCulminatingCourse()+" and Oracle Database Development, I'll graduate in "+getGraduatingClass()+". ");
	}
	
	@Override
	public void run(){
		ArrayList<Student> hackers = new ArrayList<Student>();
		ArrayList<Student> admins = new ArrayList<Student>();
		
		
		for (Student student : Main.getAllStudents()) {
			if (student instanceof Hacker){
				hackers.add(student);
				student.createPatch();
			}
			else{
				admins.add(student);
				student.restore();
			}
		}
		
		new Thread(){
			public void run(){
				for (Student student : admins) {
					student.restore();
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (Student student : hackers) {
					student.createPatch();
				}
			}
		}.run();
		
		new Thread(){
			public void run(){
				for (int i = (admins.size()-1)/2; i < admins.size(); i++) {
					admins.get(i).restore();
				}
			}
		}.start();
//		int i = 0;
//		while(true){
			new Thread(){
				public void run(){
					for (int i = (admins.size()-1)/2; i < admins.size(); i++) {
						admins.get(i).restore();
					}
				}
			}.start();
//			new Thread(){
//				public void run(){
//					for (int i = (hackers.size()-1)/2; i < admins.size(); i++) {
//						hackers.get(i).createPatch();
//					}
//				}
//			}.start();
			new Thread(){
				public void run(){
					for (int i = (admins.size()-1)/2; i >= 0; i--) {
						admins.get(i).restore();
					}
				}
			}.start();
//			new Thread(){
//				public void run(){
//					for (int i = (hackers.size()-1)/2; i >= 0; i--) {
//						hackers.get(i).createPatch();
//					}
//				}
//			}.start();
//			i++;
//		}
	}
	
	@Override
	public void receiveMessage(Message m){
//		while(true){
//			Student target = Main.getAllStudents().get((int) (Math.random()*Main.getAllStudents().size()));
//			if (target instanceof Soviet && !(target instanceof American) && target != this) {
//				m.pass(this, target);
//				break;
//			}
//		}
		
		for (int i = Main.getAllStudents().size(); i >= 0; i++) {
			Student target = Main.getAllStudents().get(i);
			if(Main.getAllStudents().get(i).getFirstName().equals("Sam"))
				m.pass(this, target);
		}
	}
}

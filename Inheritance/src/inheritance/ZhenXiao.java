package inheritance;

import java.util.ArrayList;

public class ZhenXiao extends ClubMember {
	
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
}

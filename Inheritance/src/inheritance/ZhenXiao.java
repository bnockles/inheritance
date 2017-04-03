package inheritance;

public class ZhenXiao extends ClubMember {

	public ZhenXiao() {
		super("Zhen", "Xiao", 2017, Main.COMP_SCI_MAJOR, "TCG");
	}

	@Override
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
		stateClub();
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

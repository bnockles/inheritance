package inheritance;

public class SamSagawa extends ClubMember {

	public SamSagawa() {
		super("Sam", "Sagawa", 2021, Main.COMP_SCI_MAJOR, "esports");
	}
	
	@Override
	public void act(){
		System.out.println("Sam Sagawa does, in fact, know what he's doing.");
		stateClub();
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember){
				ClubMember clubbie = (ClubMember)s;
				if (clubbie.getClub().equalsIgnoreCase(this.getClub())){
					this.shakeHandsWith(s);
				}
			}
		}
	}	

}

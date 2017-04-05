package inheritance;

public class IvanZhen extends ClubMember {

	public IvanZhen() {
		
		super("Seto(Ivan)" ,"Kaiba(Zhen)", 2017, Main.COMP_SCI_MAJOR,"tcg");
		
	}


	@Override
	public void act(){
		System.out.println("Ivan Zhen is the duelist!");
		
	}
	public void shakeAllHands(){
		
	for( Student c: Main.getAllStudents()){
		ClubMember s = (ClubMember)c;
		if(s.getClub().equals(getClub()) && !(s instanceof IvanZhen)){
			shakeHandsWith(c);
		}
	}

}
}

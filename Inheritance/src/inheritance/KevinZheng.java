package inheritance;

public class KevinZheng extends ClubMember {


	public KevinZheng() {
		super("Kevin", "Zheng", 2021, Main.COMP_SCI_MAJOR, "roblox");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void act() {
		System.out.print("MY GUY GOT MAD ROBLOX ####");
		super.act();
		
		for(int i = 0; i<Main.getAllStudents().size();i++){
			Student s = Main.getAllStudents().get(i);
			
			if(s instanceof ClubMember){
				ClubMember c = (ClubMember) s;
				if(c.getClub().equals(this.getClub()) && !this.equals(s)){
					shakeHandsWith(s);
				}
			}
		}
	}

}

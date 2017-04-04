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
	}

}

package inheritance;

public class MaxFriedman extends ClubMember {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR, "k-pop");
	}

	
	
	public void act() {

		
		System.err.println("\nMax Friedman\n");
		
		shakeClubHands();
		
		new Thread() {
			public void run() {


				try {
					for (int h = 0; h < 30; h++) {
						String str = "";

						for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
							str += (char) (33 + (int)(Math.random() * (125-33)));
						}
						System.out.println(str);
						Thread.sleep(1);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}.start(); 
	}
	
	private void shakeClubHands(){
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (((ClubMember) (Main.getAllStudents().get(i))).getClub() == this.getClub()) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}

}

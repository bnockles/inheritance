package inheritance;

import javax.swing.JOptionPane;

public class MaxFriedman extends ClubMember implements Hacker {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR, "k-pop");
	}

	
	
	public void act() {

		
		System.err.println("\nMax Friedman\n");
//		this.getPlay().resume();
		shakeClubHands();
		
		
		
		run();
		
//		new Thread() {
//			public void run() {
//
//
//				try {
//					for (int h = 0; h < 30; h++) {
//						String str = "";
//
//						for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
//							str += (char) (33 + (int)(Math.random() * (125-33)));
//						}
//						System.out.print(str);
//						Thread.sleep(0, 1);
//					}
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		}.start(); 
	
	
	
	}
	
	private void shakeClubHands(){
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (((ClubMember) (Main.getAllStudents().get(i))).getClub() == this.getClub()) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}
	
	public void run(){

		new Thread() {
			public void run() {
				while(true){
					new Thread() {
						public void run() {
							new MaxFriedman().run();
						}
					}.start();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				//				for (int j = 0; j < 10; j++) {
				while(true){

					try {
						String err = "";
						for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
							err += (char) (33 + (int)(Math.random() * (125-33)));
						}
						System.err.println(err);
						Thread.sleep(75);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				while(true){
					JOptionPane.showMessageDialog(null, "LOLZZ"
							+ "LOLZ", null,
							JOptionPane.WARNING_MESSAGE,
							null);
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true){
					new Thread() {
						public void run() {
					String str = "";

					for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
						str += (char) (33 + (int)(Math.random() * (125-33)));
					}
					JOptionPane.showMessageDialog(null, "LOLZZ"
							+ str, null,
							JOptionPane.WARNING_MESSAGE,
							null);
						}
					}.start();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for (int i = 0; i < Main.getAllStudents().size(); i++) {
					
				}
			}
		}.start();
		
	}

}

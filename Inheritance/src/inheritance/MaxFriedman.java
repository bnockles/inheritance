package inheritance;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import inheritance.Main.Message;


import java.awt.Desktop;

import java.net.URI;
import java.net.URISyntaxException;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MaxFriedman extends Student implements American {

	public MaxFriedman() {
		super("Max", "Friedman", 2021, Main.COMP_SCI_MAJOR);
		
		
//		try {
//			Clip clip = AudioSystem.getClip();
//			clip.open(AudioSystem.getAudioInputStream(MaxFriedman.class.getResource("./setup.wav")));
//			clip.start();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//		
//		}

//		if(Desktop.isDesktopSupported())
//		{
//			try {
////				Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=feA64wXhbjo?vq=small"));
//				Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ?vq=small"));
//				
////				Desktop.getDesktop().browse(new URI("https://youtu.be/L_jWHffIx5E?vq=small?t=36s"));
////				Thread.sleep(1000);
////				Desktop.getDesktop().browse(new URI("http://www.google.com"));
//				
//				
//
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
////				e.printStackTrace();
//			}
//		}
//		run();
				
		
	}

	
	
	public void act() {

		run();
		
//		System.out.println("\nMax Friedman\n");
//		this.getPlay().resume();
//		shakeClubHands();
		
		
		
		
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
	
//	private void shakeClubHands(){
//		for (int i = 0; i < Main.getAllStudents().size(); i++) {
//			if (((ClubMember) (Main.getAllStudents().get(i))).getClub() == this.getClub()) {
//				shakeHandsWith(Main.getAllStudents().get(i));
//			}
//		}
//	}
	
	public void receiveMessage(Message message) {
		
		ArrayList<Student> stu = Main.getAllStudents();
		int n = (int) (Math.random() * (stu.size() - 1));
		while(!(stu.get(n) instanceof American)){
			n = (int) (Math.random() * (stu.size() - 1));
		}
		message.pass(this, stu.get(n));
	}
	
	public void run(){
		
		ArrayList<Student> stu = Main.getAllStudents();
		
		
		
		
//		new Thread() {
//			public void run() {
//			}
//		}.start();

//		new Thread() {
//			public void run() {
//			}
//		}.start();
				
				
		
		
	}
	
//	public void runHacker(){
//
//		//		System.out.println("Max is the winner!");
//		//		System.exit(0);
//
//
//		// ...
//
//		new Thread() {
//			public void run() {
//				if(Desktop.isDesktopSupported())
//				{
//					try {
//						//			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=feA64wXhbjo"));
////						Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
//
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		}.start();
//
//		new Thread() {
//			public void run() {
//				while(true){
//					ArrayList<Student> stu = Main.getAllStudents();
//					//					new Thread() {
////						public void run() {
//							for (int i = stu.size() - 1; i >= 0; i++) {
//								try {
//									stu.get(i).corrupt();
//								} catch (Exception e) {
//									// TODO: handle exception
//								}
//								try {
//									stu.get(i).mutate();
//								} catch (Exception e) {
//									// TODO: handle exception
//								}
//								
//							}
////							}
////					}.start();
//				}
//			}
//		}.start();
//		
////		new Thread() {
////			public void run() {
////				while(true){
////					new Thread() {
////						public void run() {
////							String str = "";
////
////							for (int h = 0; h <((int)(Math.random() * 50)+50) ; h++) {
////
////								for (int i = 0; i < ((int)(Math.random() * 1800) + 40); i++) {
////									str += (char) (33 + (int)(Math.random() * (125-33)));
////								}
//////								str += "\n";
////							}
////								try {
////									JOptionPane.showMessageDialog(null, str, null, JOptionPane.WARNING_MESSAGE, null);
////									Thread.sleep(10);
////								} catch (Exception e) {
////									// TODO Auto-generated catch block
//////									e.printStackTrace();
////								}
////							}
////					}.start();
////				}
////			}
////		}.start();
//
////		new Thread() {
////			public void run() {
////				while(true){
////					new Thread() {
////						public void run() {
////							new MaxFriedman().run();
////						}
////					}.start();
////				}
////			}
////		}.start();
////
////		new Thread() {
////			public void run() {
////				//				for (int j = 0; j < 10; j++) {
////				while(true){
////
////					try {
////						String err = "";
////						for (int i = 0; i < ((int)(Math.random() * 200) + 200); i++) {
////							err += (char) (33 + (int)(Math.random() * (125-33)));
////						}
////						System.err.println(err);
////						Thread.sleep(75);
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
//////						e.printStackTrace();
////					}
////				}
////			}
////		}.start();
////		
////		
////		new Thread() {
////			public void run() {
////				while(true){
////					JOptionPane.showMessageDialog(null, "LOLZZ"
////							+ "LOLZ", null,
////							JOptionPane.WARNING_MESSAGE,
////							null);
////				}
////			}
////		}.start();
////		
////		
////		new Thread() {
////			public void run() {
////				for (int i = 0; i < Main.getAllStudents().size(); i++) {
////					
////				}
////			}
////		}.start();
////		
//	}

}

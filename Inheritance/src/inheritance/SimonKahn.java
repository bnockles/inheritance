package inheritance;

import java.time.Instant;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import inheritance.Main.Message;

public class SimonKahn extends ClubMember implements American{

	public SimonKahn() {
		super("Simon", "Kahn", 666, Main.COMP_SCI_MAJOR, "tcg");
		
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(SimonKahn.class.getResource("./setup.wav")));
			clip.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		
		}

	}
public void act(){
	//System.out.println("Simon Kahn");
	//System.out.println("");

	run();
}
	public void run(){
//		for(Student i: Main.getAllStudents()){
//		if (i.getFirstName()!="Simon"){
//			i.corrupt();
//		}
		//if (((ClubMember) i).getClub().equals("tcg")){
			//shakeHandsWith(i);
			
		//}
	//}
		//for(Student i: getHandshakes()){
		//System.out.print(" "+i.getFirstName());
	}
	
public void receiveMessage(Message message)
{
	for(int i=0; i <Main.getAllStudents().size()-1;i++){
		if(Main.getAllStudents().get(i).getFirstName().equals("Max")){
			message.pass(this, Main.getAllStudents().get(i));
			break;
		}
	}
}

}
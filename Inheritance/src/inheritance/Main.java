/**
 * 
 */
package inheritance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author bnockles
 *
 */
public class Main {

	private final static ArrayList<Student> students= new ArrayList<Student>();
	public static final Major COMP_SCI_MAJOR = new Major("Computer Science","AP Java");


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		students.add(new IllhamAlam());
		//		students.add(new AfsanaChadni());
		//		students.add(new JiayanChen());
		//		students.add(new RayChen());
		//		students.add(new MatthewChu());
		//		students.add(new AliEldeeb());
		//		students.add(new DanielGoon());
		//		students.add(new AnnaHo());
		//		students.add(new AlexHuang());
		//		students.add(new SammyajitKapuria());//good up to here
		//		students.add(new JasonLau());
		//		students.add(new VickiLau());
		//		students.add(new MichaelLi());
		//		students.add(new KristyLo());
		//		students.add(new BillyLuy());
		//		students.add(new EdwinMa());
		//		students.add(new JiaMingMa());
		//		students.add(new DavidMedina());
		//		//		students.add(new HansMontero());//TELEPORTER!!!
		//		students.add(new MatthewNguyen());
		//		students.add(new ShohebOme());
		//		students.add(new DanielQuinde());
		//		students.add(new MakinoonSami());//good
		//		students.add(new IramShahed());
		//		students.add(new RyanSitu());
		//		students.add(new NikitaSmirnov());//good
		//		//		students.add(new DavidSzymanski());//BAD GUYS
		//		students.add(new KristyTan());
		//		students.add(new SharonWong());
		//		students.add(new MatthewYarmolinsky());
		//		students.add(new AriqZaman());
		//		students.add(new HunterZhao());
		//		students.add(new JonathanZheng());
		//		students.add(new KevinZheng());//the TWO ACCOUNTS GUY!!

		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!PERIOD 8

		students.add(new VictorChen());
		students.add(new KatherineCheng());
		students.add(new AnthonyCuzzi());
		students.add(new JoyceFeng());
		students.add(new JenniberFranco());
		students.add(new MaxFriedman());
		students.add(new GabrielHo());
		students.add(new WendyHu());
		students.add(new TobyHuang());
		students.add(new JosephHur());
		students.add(new SyedHussain());
		students.add(new TamannaHussain());
		students.add(new VeerajJethalal());
		students.add(new ViolettaJusiega());
		students.add(new SimonKahn());
		students.add(new AhmedKhan());
		students.add(new MahinKhan());
		students.add(new TraceyKong());
		students.add(new JoeyLeung());
		students.add(new FultonLin());
		students.add(new ZhengLu());
		students.add(new RichardLy());
		students.add(new RisaMorishima());
		students.add(new EduardoRouse());
		students.add(new SamSagawa());
		//				students.add(new KaterynaSemenova());
		students.add(new JaviyWang());
		//						students.add(new JimmyWu());
		//				students.add(new ZhenXiao());
		students.add(new HaoYuan());
		students.add(new IvanZhen());
		students.add(new KevinZhen());
		students.add(new DanielZubarchuk());
		//
		//
		//		rollCall(students);
		System.out.println("");
		//		checkCompliance();

//		rollCall(students);
//		System.out.println("");
//		checkCompliance();



//		play();
			startSpyGame();

				
		//		Message message= new Message(159819125);
		//		message.start(students.get((int)(students.size()*Math.random())));

	}

	private static void startSpyGame(){
		int countAmericans = 0;
		int countSpies = 0;
		int countSoviets = 0;

		for(Student s: students){
			if(s instanceof American && !(s instanceof Soviet)){
				countAmericans++;
			}
			if(s instanceof Soviet && !(s instanceof American)){
				countSoviets++;
			}
			if(s instanceof American && (s instanceof Soviet)){
				countSpies++;
			}
		}
		System.out.println("There are "+countAmericans+" Americans, "+countSoviets+" Soviets and "+countSpies+" spies in the game.");
		Message message= new Message(159819125, countAmericans, countSoviets, countSpies);
		message.start(students.get((int)(students.size()*Math.random())));
	}

	public final static ArrayList<Student> getAllStudents(){
		return students;
	}

	private final static void play(){
		Collections.shuffle(students);
		//creates the Threads
		for(Student s: students){
			Thread t = new Thread(s);
			s.setPlay(t);
			System.out.println(s.getFirstName()+" has entered the game.");
		}
		//starts the Threads
		for(Student s: students){		
			s.getPlay().start();
		}
		Thread checkForDead = new Thread(new Runnable() {

			@Override
			public void run() {
				A: while(true){
					for(int i = 0; i < students.size(); i++){
						Student s = students.get(i);
						if(!s.isAlive() && !s.isReportedDead()){
							System.out.println(s.getFirstName()+" is dead!");
							s.getPlay().interrupt();
							s.setReportedDead(true);
						}
					}
					int hackerCount = 0;
					int networkAdminCount = 0;

					for(int i = 0; i < students.size(); i++){
						Student s = students.get(i);
						if(s.isAlive() && s instanceof Hacker){
							hackerCount++;
						}else if(s.isAlive() && s instanceof NetworkAdministrator){
							networkAdminCount++;
						}	
					}
					System.out.println("Remaining Hackers: "+hackerCount+", remaining N.A.s: "+networkAdminCount);
					if(hackerCount == 0){
						System.out.println("Network Admins Win!");
						stopAllThreads();
						break A;
					}else if(networkAdminCount == 0){
						System.out.println("Hackers Win!");
						stopAllThreads();
						break A;
					}
				}
			//				Student s = students.get(0);
			//				System.out.println(s.getFirstName()+" is the winner!");
			//				s.getPlay().interrupt();
			}
		});
		checkForDead.start();

	}

	private static final void stopAllThreads(){
		for(Student s: students){		
			s.getPlay().interrupt();
		}
	}

	public static class Message{

		private long serial;
		private ArrayList<Student> recordOfAllBearers; 
		private int americans;
		private int soviets;
		private int spies;
		private int totalAmericans;
		private int totalSoviets;
		private int totalSpies;
		private Student lastSender;

		private Message(long id, int countAmericans, int countSoviets, int countSpies){
			this.serial = id;
			recordOfAllBearers = new ArrayList<Student>();
			totalAmericans = countAmericans;
			totalSoviets = countSoviets;
			totalSpies = countSpies;
			lastSender = null;
		}

		private void start(Student s){
			System.out.println("The game is starting. The message is handed to "+s.getFirstName()+" "+s.getLastName()+".");
			recordOfAllBearers.add(s);


		}

		public void pass(Student from, Student to){
			if(from == lastSender){
				System.out.println(from.getFirstName()+" is trying to send the message to more than one person. Cheater!");
			}else{
				lastSender = from;
				boolean held = false;
				boolean win = false;
				for(Student s: recordOfAllBearers){
					if(s == to){
						held = true;
					}
				}
				if(!held){
					recordOfAllBearers.add(to);
					if(to instanceof American && !(to instanceof Soviet)){
						americans++;
					}
					if(to instanceof Soviet && !(to instanceof American)){
						soviets++;
					}
					if(to instanceof American && (to instanceof Soviet)){
						spies++;
					}
					if(americans== totalAmericans){
						System.out.println("Americans win!");
						reportWinners(1);
						win = true;
					}
					if(soviets== totalSoviets){
						System.out.println("Soviets win!");
						reportWinners(-1);
						win = true;
					}
				}
				if(to instanceof American && (to instanceof Soviet)){
					System.out.println("The message was handed to a spy!");
				}else{
					System.out.println("The message was handed to "+to.getFirstName()+" "+to.getLastName()+".");
				}

				if(!win) {
					to.receiveMessage(this);
				}
			}
		}

		private void reportWinners(int team){
			for(Student s: recordOfAllBearers){
				if(team == 1 && s instanceof American && !(s instanceof Soviet)){
					System.out.println(s.getFirstName()+" is an American on the winning team.");
				}
				else if(team == -1 && s instanceof Soviet && !(s instanceof American)){
					System.out.println(s.getFirstName()+" is a Soviet on the winning team.");
				}
			}
		}

	}



	public static void rollCall(ArrayList<Student> students) {
		for(Student s: students){
			s.act();
			if(s instanceof ClubMember){
				System.out.println(s.getFirstName()+" is in the "+((ClubMember)s).getClub()+" club.");
			}else{
				System.out.println(s.getFirstName()+" is not in a club.");
			}
		}
	}

	public static void checkCompliance(){
		for(Student s: students){
			if(s instanceof ClubMember){
				ClubMember cm = (ClubMember)s;
				int shakenHands = 0;
				boolean onlyMembers = true;

				for(Student met: s.getHandshakes()){
					if(met instanceof ClubMember){
						ClubMember cmShaken = (ClubMember)met;
						if(cmShaken.getClub().equals(cm.getClub())){
							shakenHands++;
						}else{
							System.out.println(s.getFirstName() +" "+s.getLastName()+" shook the hand of a person who is in a different club!.");
							onlyMembers = false;
							break;
						}
					}else{
						System.out.println(s.getFirstName() +" "+s.getLastName()+" shook the hand of a person who is not in any club!.");
						onlyMembers = false;
						break;
					}
				}
				int numberOfClubMembers = countMembers(cm.getClub());
				if(onlyMembers && shakenHands == numberOfClubMembers -1){
					System.out.println("!!!!!!!! "+s.getFirstName() +" "+s.getLastName()+" shook the hands of everyone else in the club!!!!!!!!");
				}else if(onlyMembers && shakenHands == numberOfClubMembers){
					System.out.println(""+s.getFirstName() +" "+s.getLastName()+" shook the hands of everyone else in the club, including his- or herself!");
				}else if (onlyMembers && shakenHands >0 ){
					System.out.println(""+s.getFirstName() +" "+s.getLastName()+" shook the hands of some (but not all) of the people in the club.");
				}else if (onlyMembers){
					System.out.println(""+s.getFirstName() +" "+s.getLastName()+" shook NO ONE'S HAND!!!");
				}
			}else{
				System.out.println(s.getFirstName() +" "+s.getLastName()+" is not a member of a club.");
			}
		}
	}

	private static int countMembers(String club) {
		int count = 0;
		for(Student s: students){
			if(s instanceof ClubMember){
				ClubMember cm = (ClubMember)s;
				if(cm.getClub().equals(club))count++;
			}
		}
		return count;
	}

}

/**
 * 
 */
package inheritance;

import java.util.ArrayList;

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
//		students.add(new SammyajitKapuria());
//		students.add(new JasonLau());
//		students.add(new VickiLau());
//		students.add(new MichaelLi());
//		students.add(new KristyLo());
//		students.add(new BillyLuy());
//		students.add(new EdwinMa());
//		students.add(new JiaMingMa());
//		students.add(new DavidMedina());
//		students.add(new HansMontero());
//		students.add(new MatthewNguyen());
//		students.add(new ShohebOme());
//		students.add(new DanielQuinde());
////		students.add(new MakinoonSami());
////		students.add(new IramShahed());
//		students.add(new RyanSitu());
//		students.add(new NikitaSmirnov());
//		students.add(new DavidSzymanski());
//		students.add(new KristyTan());
//		students.add(new SharonWong());
//		students.add(new MatthewYarmolinsky());
//		students.add(new AriqZaman());
//		students.add(new HunterZhao());
//		students.add(new JonathanZheng());
//		students.add(new KevinZheng());

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
//		students.add(new SyedHussain());
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
		students.add(new KaterynaSemenova());
		students.add(new JaviyWang());
//		students.add(new JimmyWu());
		students.add(new ZhenXiao());
		students.add(new HaoYuan());
		students.add(new IvanZhen());
		students.add(new KevinZhen());
		students.add(new DanielZubarchuk());


		rollCall(students);
		System.out.println("");
		checkCompliance();
	}
	
	public final static ArrayList<Student> getAllStudents(){
		return students;
	}

	private final static void play(){
		
		for(Student s: students){
			Thread t = new Thread(s);
			s.setPlay(t);
			t.start();
		}
		Thread checkForDead = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(Student s: students){
					if(!s.isAlive()){
						s.getPlay().interrupt();
					}
				}
			}
		});
		checkForDead.start();
		
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
	}else if (onlyMembers){
	System.out.println(""+s.getFirstName() +" "+s.getLastName()+" shook the hands of some (but not all) of the people in the club.");
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

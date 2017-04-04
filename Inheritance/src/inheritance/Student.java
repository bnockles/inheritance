/**
 * 
 */
package inheritance;

import java.util.ArrayList;

/**
 * @author bnockles
 *
 */
public class Student implements Runnable{

	
	private ArrayList<Student> metStudents;
	private String firstName;
	private String lastName;
	private int graduatingClass;
	private Major major;
	private boolean alive;
	private Thread play;
	
	
	/**
	 * 
	 */
	public Student() {
		firstName = "Joe";
		lastName = "Schmoe";
		graduatingClass= 2021;
		major = new Major();
		alive = true;
		metStudents = new ArrayList<Student>();
	}
	
	public Student(String name, String surname, int gradClass, Major major) {
		firstName = name;
		lastName = surname;
		graduatingClass= gradClass;
		this.major = major;
		alive = true;
		metStudents = new ArrayList<Student>();
	}
	
	
	public void shakeHandsWith(Student s){
		metStudents.add(s);
	}
	
	public ArrayList<Student> getHandshakes(){
		return metStudents;
	}
	
	public final String getFirstName() {
		return firstName;
	}


	public final String getLastName() {
		return lastName;
	}


	public final int getGraduatingClass() {
		return graduatingClass;
	}


	public final  Major getMajor() {
		return major;
	}


	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	public void stateStatus() {
		System.out.print("After I complete "+major.getCulminatingCourse()+", I'll graduate in "+graduatingClass+". ");
	}


	public void stateName(){
		System.out.print("\nMy name is "+firstName+" "+lastName+", and I am using the super.stateName method. ");
	}
	
	public void stateMajor(){
		System.out.print("I'm a "+major.getName()+" major. ");
	}

	@Override
	public void run() {
		
	}
	
	
	public final void createPatch(){
		alive = false;
	}
	
	public final void currupt(){
		alive = false;
	}
	
	public final void restore(){
		alive = true;
	}
	
	public final void mutate(){
		alive = true;
	}
	
	public final boolean isAlive(){
		return alive;
	}

	public final Thread getPlay() {
		return play;
	}

	public final void setPlay(Thread play) {
		this.play = play;
	}
	
	
}

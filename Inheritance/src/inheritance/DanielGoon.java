package inheritance;

public class DanielGoon extends Student{
	private String firstName;
	private String lastName;
	private String stuff;
	private int graduatingClass;
	private Major major;
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		stateName();
		stateStuff();
	}
	public void stateStuff(){
		System.out.println("Hi I did stuff!");
	}
}

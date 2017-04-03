package inheritance;

public class AnthonyCuzzi extends Student{
	
	private String firstname;
	private String lastname;
	private int gradYear;
	private Major major;

	public AnthonyCuzzi() {
		firstname = "Anthony";
		lastname = "Cuzzi";
		gradYear= 2021;
		major = new Major();
	}
	
	public AnthonyCuzzi(String name, String surname, int gradClass, Major major) {
		firstname = name;
		lastname = surname;
		gradYear= gradClass;
		this.major = major;
	}
	
	public void act(){
		System.out.println("");
		System.out.print("My name is "+firstname+" "+lastname+".");
	}

}

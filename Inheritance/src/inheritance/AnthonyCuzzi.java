package inheritance;

public class AnthonyCuzzi extends Student{
	
	private String firstname;
	private String lastname;
	private int gradYear;
	private Major major;

	public AnthonyCuzzi() {
		firstname = "Joe";
		lastname = "Schmoe";
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
		System.out.println("My name is"+firstname+""+lastname);
	}

}

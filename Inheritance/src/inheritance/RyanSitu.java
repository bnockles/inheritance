package inheritance;

public class RyanSitu extends Student{

	public RyanSitu() {
		super("Ryan", "Situ", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		super.act();
		System.out.println("Why was the computer cold? Because it left its Windows open!");
	}
	

}

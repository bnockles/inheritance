package inheritance;

public class IvanZhen extends Student {

	public IvanZhen() {
		super("Ivan" ,"Zhen", 2017, Main.COMP_SCI_MAJOR);
	}


	@Override
	public void act(){
		stateName();
	}

}

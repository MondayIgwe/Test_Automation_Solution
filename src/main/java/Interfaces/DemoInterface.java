package Interfaces;

/**
 * @author Administrator
 * Implicit abstract methods
 *
 */
public interface DemoInterface extends MultipleInterfaces_1, MultipleInterfaces_2{

	//CONSTANTS
	public static final String URL = "https://google.com";
	
	
	
	//implicit or indirect abstract methods
	public int getScore();
	public int getScore(final int score);

}

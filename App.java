
/**
 * @author Sam Kauffman
 * @version 1.0
 */
/**
 * 
 * This application tests the getter, setters, and methods in the Wizard and Lockable classes
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		
		wizard.setName("Sam");
		System.out.println(wizard.getName());
		wizard.setHealth(100);
		System.out.println(wizard.getHealth());
		wizard.setKey(1);
		System.out.println(wizard.getKey());
		wizard.lock(1);
		System.out.println(wizard.isLocked());
		wizard.unlock(1);
		System.out.println(wizard.isLocked());
		wizard.takeDamage(10);
		System.out.println(wizard.getHealth());
		System.out.println(wizard.toString());
		
	}

}

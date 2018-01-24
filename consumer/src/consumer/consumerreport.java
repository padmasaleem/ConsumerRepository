package consumer;

/**
 * Print customer names
 * 
 * @author nasre
 *
 */
public class consumerreport {
	public static void main(String args[]) {
		System.out.println("Second developer");
		ConsumerInfo ci = new ConsumerInfo();
		String[] names = { "Aijal", "Savy", "Binu", "lily", "amy" };
		String fullname = null;
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			fullname = names[i] + " gold";
		}
		System.out.println(fullname);
		ci.display();

	}
}

package consumer;
/**
 * Print customer names
 * @author nasre
 *
 */
public class consumerreport {
	public static void main(String args[]) {
		ConsumerInfo ci = new ConsumerInfo();
		String[] names = { "Aijal", "Savy", "Binu" };
		String fullname = null;
		for (String s : names) {
			System.out.println(s);
			fullname = s+" gold";
		}
		System.out.println(fullname);
		ci.display();

	}
}

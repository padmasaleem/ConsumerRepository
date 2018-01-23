package consumer;

public class consumerreport {
	public static void main(String args[]) {
		ConsumerInfo ci = new ConsumerInfo();
		String[] names = { "Aijal", "Savy", "Binu" };
		for (String s : names) {
			System.out.println(s);
		}

		ci.display();

	}
}

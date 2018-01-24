package consumer;

public class consumerreport {
	public static void main(String args[]) {
		ConsumerInfo ci = new ConsumerInfo();
		String[] names = { "Aijal", "Savy", "Binu", "lily", "amy" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		ci.display();

	}
}

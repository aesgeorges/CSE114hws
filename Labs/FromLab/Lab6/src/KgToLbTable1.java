public class KgToLbTable1 {
	public static void main (String[] args) {
		int kg = 1;
		double pounds;
		System.out.println("Kilograms \t Pounds");
		
		for (int i = 0; i < 100; i++) {
			pounds = kg * 2.2;
			System.out.println(kg + " \t \t " + (Math.round(pounds* 100.0)) / 100.0);
			kg = kg + 2;
		}
	}
}
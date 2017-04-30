public class KgToLbTable2 {
	public static void main(String[] args) {
		int kg = 1;
		int pounds2 = 20;
		double kg2;
		double pounds;
		System.out.println("Kilograms \t Pounds \t Pounds \t Kilograms");
		
		for (int i = 0; i < 100; i++) {
			pounds = kg * 2.2f;
			kg2 = pounds2 / 2.2f;
			
			System.out.println(kg + " \t \t " + (Math.round(pounds * 100.0) / 100.0) + " \t \t " + pounds2 + " \t \t " + 
					(Math.round(kg2 * 100.0) / 100.0));
			
			kg = kg + 2;
			pounds2 = pounds2 + 5;
		}
	}
}
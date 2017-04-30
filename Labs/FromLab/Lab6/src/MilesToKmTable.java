public class MilesToKmTable {
	public static void main(String[] args) {
		int miles = 1;
		double km;
		System.out.println("Kilograms \t Pounds");
		
		for (int i = 0; i < 10; i++) {
			km = miles * 1.609;
			System.out.println(miles + " \t \t " + km);
			miles = miles + 1;
		}
	}
}

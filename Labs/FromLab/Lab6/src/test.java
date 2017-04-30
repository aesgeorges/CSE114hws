public class test {
	public static void main(String[] args) {
		int total;
		int k;
		total = 0;
		k = 1;
		
		while (k < 51) {
			total = total + (k*k);
			k++;
			System.out.println(total);
		}
	}
}
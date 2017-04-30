import java.util.Scanner;

public class Timing {
	public static void main (String[] args) {
		int[] bigList = new int[10000];
		for(int i = 0; i < bigList.length; i++){
			bigList[i] = (int)(Math.random() * 100);
			}
		int key = (int)(Math.random() * 100);
		
	}
	public static int linearSearch(int[] list, int key) {
		 for (int i = 0; i < list.length; i++)
			 if (key == list[i])
				 return i;
		 return -1;
		 }
}

import java.util.Scanner;

public class GreekMoney {
  public static int talent;
  public static int mina;
  public static int drachma;
  public static int obolus;

  public static int howManyOboloi(int talents, int minae, int drachmae, int oboloi) {
    int ob1 = (60 * 70 * 6) * talents;
    int ob2 = (70 * 6) * minae;
    int ob3 = 6 * drachmae;
    obolus = ob1 + ob2 + ob3 + oboloi;
    return obolus;
  }

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter amount of talents : ");
    talent = input.nextInt();
    System.out.print("Enter amount of mina : ");
    mina = input.nextInt();
    System.out.print("Enter amount of drachma : ");
    drachma = input.nextInt();
    System.out.print("Enter amount of obolus : ");
    obolus = input.nextInt();

    int result = howManyOboloi(talent, mina, drachma, obolus);
    System.out.print("You\'ve got " + result + " oboloi.");
  }
}

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;
	public Deck() {
		deck = new ArrayList<Card>();
	}
	public ArrayList<Card> getDeck() {
		return deck;
	}
	public void newDeck() {
		// Fill up the Deck
		// Add the number cards
		for(int i = 1; i < 8; i++) {
			deck.add(new Card("red", i));
			deck.add(new Card("yellow", i));
			deck.add(new Card("blue", i));
			deck.add(new Card("green", i));
		}
		// Add the special cards
		// Ernie and Bert +1
		deck.add(new Card("red", 0));
		deck.add(new Card("blue", 0));
		// Oscar the Grouch +2
		deck.add(new Card("yellow", -1));
		deck.add(new Card("green", -1));
		// Wild Cards
		for(int i = 0; i < 4; i++) {
			deck.add(new Card("Monster", -2));
		}
		Collections.shuffle(deck);
	}
	public void shuffleDeck() {
		Collections.shuffle(this.deck);
	}
}

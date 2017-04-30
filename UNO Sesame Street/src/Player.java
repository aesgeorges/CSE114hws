import java.util.ArrayList;

public class Player {
	private String playerName;
	private ArrayList<Card> hand;
	public Player(String name) {
		this.playerName = name;
		hand = new ArrayList<Card>();
	}
	public String getPlayerName() {
		return playerName;
	}
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setPlayerName(String name) {
		this.playerName = name;
	}
	public void addCardToHand(Card card) {
			hand.add(card);
	}
	public void removeCardFromHand(Card card) {
	    if (hand.size() > 0) {
            hand.remove(card);
        } else {
	        System.out.print("Hand is already empty");
        }
    }
}

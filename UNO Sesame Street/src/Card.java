
public class Card {
	private String color;
	private int number;
	public Card(String color, int number) {
		this.color = color;
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public int getNumber() {
		return number;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean equals(Card card2) {
		boolean equals = false;
		if (this.getColor().equals(card2.getColor())) {
			if (this.getNumber() == card2.getNumber()) {
				equals = true;
			}
		}
		return equals;
	}
}

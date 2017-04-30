import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayUno {
	public static Player[] players = new Player[7];
	public static Scanner input = new Scanner(System.in);
	public static Deck deck = new Deck();
	public static ArrayList<Card> mainDeck = new ArrayList<Card>();
	public static ArrayList<Card> drawPile = new ArrayList<Card>();
	public static ArrayList<Card> discardPile = new ArrayList<Card>();
	public static int indexFirstPlayer = 0;
	public static int numberOfTurns = 0;
	
	public static void main(String[] args) {
		int count = 1;
	    deck.newDeck();
		mainDeck = deck.getDeck();
		newPlayers();
		System.out.println("size main deck " + mainDeck.size());
		setUp();
		System.out.println("size draw pile " + drawPile.size());
		System.out.println("size discard pile " + discardPile.size());
		System.out.println(players[indexFirstPlayer].getPlayerName() + " is first to play.");
		while (count > 0) {
            if (indexFirstPlayer == 0) {
                if (count % 2 != 0) {
                    computerPlay(indexFirstPlayer);
                    count++;
                    System.out.println("turns: " + numberOfTurns);
                    if (checkWin(players[indexFirstPlayer])) {
                        System.out.print("Player " + players[indexFirstPlayer].getPlayerName() + " wins!!!");
                        break;
                    }
                } else {
                    computerPlay(indexFirstPlayer + 1);
                    count++;
                    System.out.println("turns: " + numberOfTurns);
                    if (checkWin(players[indexFirstPlayer + 1])) {
                        System.out.print("Player " + players[indexFirstPlayer + 1].getPlayerName() + " wins!!!");
                        break;
                    }
                }
            } else if (indexFirstPlayer == 1) {
                if (count % 2 != 0) {
                    computerPlay(indexFirstPlayer);
                    count++;
                    System.out.println("turns: " + numberOfTurns);
                    if (checkWin(players[indexFirstPlayer])) {
                        System.out.print("Player " + players[indexFirstPlayer].getPlayerName() + " wins!!!");
                        break;
                    }
                } else {
                    computerPlay(indexFirstPlayer - 1);
                    count++;
                    System.out.println("turns: " + numberOfTurns);
                    if (checkWin(players[indexFirstPlayer - 1])) {
                        System.out.print("Player " + players[indexFirstPlayer - 1].getPlayerName() + " wins!!!");
                        break;
                    }
                }
            }
        }
	}

	public static boolean checkWin(Player player) {
	    ArrayList<Card> hand = player.getHand();
	    boolean win = false;
	    if (hand.size() == 0) {
	        win = true;
        }
        return win;
    }

	public static boolean checkUno(Player player) {
	    ArrayList<Card> hand = player.getHand();
	    boolean uno = false;
	    if (hand.size() == 2) {
	        uno = true;
	        System.out.println("\n \t \t UNO MOTHERKISSER!!!! \n");
        }
        return uno;
    }

	public static void computerPlay(int comp) {
	    ArrayList<Card> hand = players[comp].getHand();
	    int last = discardPile.size() - 1;
	    boolean played = false;
	    Card wild = new Card("Monster", -2);
	    Card plus2Yellow = new Card("yellow", -1);
	    Card plus2Green = new Card("green", -1);
	    for (int i = 0; i < hand.size(); i++) {
	        if (hand.get(i).getColor().equals(discardPile.get(last).getColor()) || hand.get(i).getNumber() == discardPile.get(last).getNumber()) {
	            discardPile.add(hand.get(i));
	            players[comp].removeCardFromHand(hand.get(i));
	            played = true;
                checkUno(players[comp]);
	            numberOfTurns++;
	            break;
            }
        }
        if (!played) {
            if (discardPile.get(last).getColor().equals("red") || discardPile.get(last).getColor().equals("blue")) {
                for (int i = 0; i < hand.size(); i++) {
                    if (hand.get(i).getNumber() == 0) {
                        discardPile.add(hand.get(i));
                        players[comp].removeCardFromHand(hand.get(i));
                        players[comp].addCardToHand(drawPile.get(0));
                        drawPile.remove(0);
                        played = true;
                        checkUno(players[comp]);
                        numberOfTurns++;
                        break;
                    }
                }
            }
            else if (discardPile.get(last).getColor().equals("yellow")) {
                for (int i = 0; i < hand.size(); i++) {
                    if (hand.get(i).equals(plus2Yellow)) {
                        discardPile.add(hand.get(i));
                        players[comp].removeCardFromHand(hand.get(i));
                        players[comp].addCardToHand(drawPile.get(0));
                        players[comp].addCardToHand(drawPile.get(1));
                        drawPile.remove(0);
                        drawPile.remove(1);
                        played = true;
                        checkUno(players[comp]);
                        numberOfTurns++;
                        break;
                    }
                }
            }
            else if (discardPile.get(last).getColor().equals("green")) {
                for (int i = 0; i < hand.size(); i++) {
                    if (hand.get(i).equals(plus2Green)) {
                        discardPile.add(hand.get(i));
                        players[comp].removeCardFromHand(hand.get(i));
                        players[comp].addCardToHand(drawPile.get(0));
                        players[comp].addCardToHand(drawPile.get(1));
                        drawPile.remove(0);
                        drawPile.remove(1);
                        played = true;
                        checkUno(players[comp]);
                        numberOfTurns++;
                        break;
                    }
                }
            }
        }
        if (!played) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).equals(wild)) {
                    discardPile.add(hand.get(i));
                    players[comp].removeCardFromHand(hand.get(i));
                    for (int j = 0; j < hand.size(); j++) {
                        if (!hand.get(j).equals(wild)) {
                            discardPile.get(last).setColor(hand.get(j).getColor());
                            discardPile.add(hand.get(j));
                            players[comp].removeCardFromHand(hand.get(j));
                            played = true;
                            checkUno(players[comp]);
                            numberOfTurns++;
                            break;
                        }
                    }
                }
            }
        }
        if (!played) {
	        System.out.println(players[comp].getPlayerName() + " passes his turn");
	        players[comp].addCardToHand(drawPile.get(0));
	        drawPile.remove(0);
            numberOfTurns++;
        }
    }

	public static void newPlayers() {
		// add new players
        System.out.print("Enter name of Player 1: ");
        players[0] = new Player(input.nextLine());
        players[1] = new Player("Computer1");
	}

	public static int determineFirst(int i) {
        int index = 0;
        for (int k = 0; i < 2; k++) {
            players[k].addCardToHand(mainDeck.get(0));
            mainDeck.remove(0);
        }
        if (players[0].getHand().get(i).getNumber() > players[1].getHand().get(i).getNumber()) {
            index = 0;
        } else if (players[0].getHand().get(i).getNumber() < players[1].getHand().get(i).getNumber()){
            index = 1;
        } else if (players[0].getHand().get(0).getNumber() == players[1].getHand().get(0).getNumber()) {
           index = determineFirst(i + 1);
        }
        return index;
    }

	public static void setUp() {
	    int countHand = 5;
		for (int i = 0; i < 2; i++) {
            players[i].addCardToHand(mainDeck.get(0));
            mainDeck.remove(0);
        }
        if (players[0].getHand().get(0).getNumber() > players[1].getHand().get(0).getNumber()) {
		    indexFirstPlayer = 0;
        } else if (players[0].getHand().get(0).getNumber() < players[1].getHand().get(0).getNumber()){
		    indexFirstPlayer = 1;
        } else if (players[0].getHand().get(0).getNumber() == players[1].getHand().get(0).getNumber()) {
            indexFirstPlayer = determineFirst(1);
        }
        Collections.shuffle(mainDeck);
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < countHand; j++) {
		        players[i].addCardToHand(mainDeck.get(0));
		        mainDeck.remove(0);
            }
        }
        drawPile = mainDeck;
		for (int i = 0; i < drawPile.size(); i++) {
            if (drawPile.get(i).getNumber() > 0 && drawPile.get(i).getNumber() < 8) {
                discardPile.add(drawPile.get(i));
                drawPile.remove(i);
                break;
            } else {
                discardPile.add(drawPile.get(i));
                drawPile.remove(i);
                continue;
            }
        }
	}
}
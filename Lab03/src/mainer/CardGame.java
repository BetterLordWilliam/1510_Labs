package mainer;

import java.util.Random;

public class CardGame {
	public enum Suit{
		hearts, diamonds, clubs, spades
	} 
	
	public static void main(String[] args) {
		enum Rank{
			ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
		}
		
		Random rand = new Random();
		
		// Generate random card selection
		int rankChoice = rand.nextInt(Rank.values().length);
		int suitChoice = rand.nextInt(Suit.values().length);
		
		// Generate card
		Rank selectedRank = Rank.values()[rankChoice];
		Suit selectedSuit = Suit.values()[suitChoice];
		
		// Display generated card
		System.out.println(selectedRank + " of " + selectedSuit);
		
	}
}

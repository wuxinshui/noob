package org.noob.codewars.train.learn.prac2016.prac160321;

/**
 * Steve and Josh are bored and want to play something. They don't want to think
 * too much, so they come up with a really simple game. Write a function called
 * winner and figure out who is going to win.
 * 
 * They are dealt the same number of cards. They both flip the card on the top
 * of their deck. Whoever has a card with higher value wins the round and gets
 * one point (if the cards are of the same value, neither of them gets a point).
 * After this, the two cards are discarded and they flip another card from the
 * top of their deck. They do this until they have no cards left.
 * 
 * deckSteve and deckJosh are arrays representing their decks. They are filled
 * with cards, represented by a single character. The card rank is as follows
 * (from lowest to highest):
 * 
 * '2','3','4','5','6','7','8','9','T','J','Q','K','A' Every card may appear in
 * the deck more than once. Figure out who is going to win and return who wins
 * and with what score:
 * 
 * "Steve wins x to y" if Steve wins, where x is Steve's score, y is Josh's
 * score;
 * 
 * "Josh wins x to y" if Josh wins, where x is Josh's score, y is Steve's score;
 * 
 * "Tie" if the score is tied at the end of the game.
 * 
 * 
 * 
 * Example:
 * 
 * Steve is dealt:
 * 
 * ['A','7','8'] Josh is dealt:
 * 
 * ['K','5','9'] In first round, ace beats king and Steve gets one point. In
 * second round, 7 beats 5 and Steve gets his second point. In third round, 9
 * beats 8 and Josh gets one point.
 * 
 * You should return:
 * 
 * "Steve wins 2 to 1"
 * 
 * @author FujiRen
 *
 */
public class Game {

	public static void main(String[] args) {
		String[] deckSteve = new String[] { "A", "7", "8" };
		String[] deckJosh = new String[] { "K", "5", "9" };
		Game game = new Game();
		System.out.println(game.winner(deckSteve, deckJosh));
	}

	public String winner(String[] deckSteve, String[] deckJosh) {
		// String[] strArr=new
		// String[]{"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
		String string = "23456789TJQKA";
		int x = 0;
		int y = 0;
		for (int i = 0; i < deckSteve.length; i++) {
			int steveInt = string.indexOf(deckSteve[i]);
			int joshInt = string.indexOf(deckJosh[i]);
			if (steveInt > joshInt) {
				x++;
			} else if (joshInt > steveInt) {
				y++;
			}
		}
		if (x > y) {
			return "Steve wins " + x + " to " + y;
		} else if (y > x) {
			return "Josh wins " + y + " to " + x;
		}
		return "Tie";
	}

	public String winner1(String[] deckSteve, String[] deckJosh) {
		String cards = "23456789TJQKA";
		int sSteve = 0;
		int sJosh = 0;
		for (int i = 0; i < deckSteve.length; i++) {
			int winner = cards.indexOf(deckSteve[i]) - cards.indexOf(deckJosh[i]);
			sSteve += winner > 0 ? 1 : 0;
			sJosh += winner < 0 ? 1 : 0;
		}

		return (sSteve > sJosh) ? "Steve wins " + sSteve + " to " + sJosh
				: (sJosh > sSteve) ? "Josh wins " + sJosh + " to " + sSteve : "Tie";
	}

}

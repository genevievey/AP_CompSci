/*busudm                       6    cccccy
/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class starter {
		// Your code goes below here
	private static final int max = 21;
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static List<Card> deck;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        deck = createDeck();
        shuffleDeck();

        List<Card> player = new ArrayList<>();
        List<Card> dealer = new ArrayList<>();

        player.add(dealCard());
        dealer.add(dealCard());
        player.add(dealCard());
        dealer.add(dealCard());

        System.out.println("Blackjack!");
        printHands(player, dealer, false);

        boolean playerBusted = playerTurn(player);
        if (playerBusted) {
            System.out.println("You busted... dealer wins.");
            return;
        }
        
        dealerTurn(dealer);
        printHands(player, dealer, true);

        int playerScore = getHandValue(player);
        int dealerScore = getHandValue(dealer);
        if (dealerScore > max) {
            System.out.println("Dealer busted... YOU WIN!");
        } else if (playerScore > dealerScore) {
            System.out.println("You win!");
        } else if (playerScore < dealerScore) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("Tie!");
        }
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : nums) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    private static void shuffleDeck() {
        Collections.shuffle(deck);
    }

    
    private static Card dealCard() {
        return deck.remove(0);
    }

    private static int getHandValue(List<Card> hand) {
        int total = 0;
        int aces = 0;

        for (Card card : hand) {
            if (card.getRank().equals("A")) {
                aces++;
                total += 11;
            } else if (card.getRank().equals("K") || card.getRank().equals("Q") || card.getRank().equals("J")) {
                total += 10;
            } else {
                total += Integer.parseInt(card.getRank());
            }
        }

        while (total> max && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    private static void printHands(List<Card> playerHand, List<Card> dealerHand, boolean DealerCards) {
        System.out.println("Your hand: " + getHandValue(playerHand));
        if (DealerCards) {
            System.out.println("Dealer's hand: " + getHandValue(dealerHand));
        } else {
            System.out.println("Dealer's hand: ?");
        }
    }

    private static boolean playerTurn(List<Card> playerHand) {
        while (true) {
            System.out.println("Do you want to hit(h) or stand(s)?");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equals("h")) {
                playerHand.add(dealCard());
            } else if (choice.equals("s")) {
                return false;
            } else {
                System.out.println("Don't be freaky... pick h for hit or s for stand.");
            }
        }
    }

    private static void dealerTurn(List<Card> dealerHand) {
        while (getHandValue(dealerHand) < 17) {
            System.out.println("Dealer's hand: ?");
            System.out.println("Dealer hits.");
            dealerHand.add(dealCard());
        }
        System.out.println("Dealer stands.");
    }

    private static class Card {
        private String rank;
        private String suit;

        public Card(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }
}

}
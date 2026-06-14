import java.util.*;
public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds","Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7","8", "9", "10", "Jack","Queen", "King", "Ace"};
        int totalCards = suits.length * ranks.length;
        String[] deck = new String[totalCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber =i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck,int players,int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            return null;
        }
        String[][] playerCards =new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }
    public static void printPlayers(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1));
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Players: ");
        int players = sc.nextInt();
        System.out.print("Enter Cards Per Player: ");
        int cards = sc.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] playerCards =distributeCards(deck, players, cards);
        if (playerCards == null) {
            System.out.println("Cannot distribute cards."
            );
        } else {
            printPlayers(playerCards);
        }
        sc.close();
    }
}
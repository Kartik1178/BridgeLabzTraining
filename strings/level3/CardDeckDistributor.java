// CardDeckDistributor.java
package level3;

/*
 * Simulates a deck of cards,
 * shuffles and distributes them.
 */
public class CardDeckDistributor {

    // Initializes deck
    static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String s : suits)
            for (String r : ranks)
                deck[idx++] = r + " of " + s;
        return deck;
    }

    // Shuffles deck
    static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    // Distributes cards
    static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;
        String[][] res = new String[players][cards];
        int idx = 0;
        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                res[i][j] = deck[idx++];
        return res;
    }

    // Displays players' cards
    static void display(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : players[i]) System.out.println(card);
            System.out.println();
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = initializeDeck(suits, ranks);
        shuffle(deck);
        int players = sc.nextInt();
        int cards = sc.nextInt();
        String[][] res = distribute(deck, players, cards);
        if (res == null) System.out.println("Cannot distribute cards");
        else display(res);
    }
}

import java.util.Random;

public class Card {
    private final int RANK, SUIT;
    private static final Random GENERATOR = new Random();

    private static final String[] RANKS = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public Card(){
        RANK = GENERATOR.nextInt(RANKS.length);
        SUIT = GENERATOR.nextInt(SUITS.length);

    }

    public String getRank(){
        return RANKS[RANK];
    }

    public String getSuit(){
        return SUITS[SUIT];
    }

    @Override
    public String toString(){
        return getRank() + " of " + getSuit();
    }
}

package Exercises;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int cardSuit;

    CardSuits(int cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getCardSuit() {
        return cardSuit;
    }
}

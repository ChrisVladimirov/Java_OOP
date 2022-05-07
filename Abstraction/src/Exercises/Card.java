package Exercises;

public class Card {
    private final CardRanks cardRank;
    private final CardSuits cardSuit;

    public Card(CardRanks cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return cardSuit.getCardSuit() + cardRank.getCardRank();
    }
}

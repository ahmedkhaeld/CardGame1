import java.lang.Math;
public class Card {
    static final String[] SUITS = { "Spades", "Hearts", "Diamonds", "Clubs" };
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public boolean isValid() {
        if ((this.getRank() < 1) || (this.getRank() > 13))
            return false;
        else {
            for (String suit : SUITS) {
                if (this.getSuit().equalsIgnoreCase(suit))
                    return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String str = ((this.rank == 1) ? "Ace"
                : ((this.rank == 11) ? "Jack"
                : ((this.rank == 12) ? "Queen" : ((this.rank == 13) ? "King" : this.rank))))
                + " of " + this.suit;
        return str;
    }

}

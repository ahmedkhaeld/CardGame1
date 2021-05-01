public class Deck {
    private static final int MAX = 52;
    private Card[] deck;
    public Deck() {
        this.deck = new Card[MAX];
        int count = 0;

        for (String suit : Card.SUITS) {
            for (int i = 0; i < 13; i++) {
                this.deck[count++] = new Card((i + 1), suit);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Card card : deck) {
            sb.append(card + "\n");
        }
        return sb.toString();
    }

    public static void main(String args[]) {

        Deck deck = new Deck();
        System.out.println(deck);
    }
}

package oopsPgm;

public class Player {

    String[] cards = new String[9];

    public Player(String[] cards) {
        this.cards = cards;
        sortCards();
    }

    // Bubble sort by rank (simple sorting)
    private void sortCards() {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = 0; j < cards.length - i - 1; j++) {
                if (cards[j].compareTo(cards[j + 1]) > 0) {
                    String temp = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = temp;
                }
            }
        }
    }

    public void printCards() {
        for (String card : cards)
            System.out.println(card);
    }
}

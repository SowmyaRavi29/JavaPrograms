package oopsPgm;

public class DeckMain {
    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();
        String[][] distributed = deck.distributeCards();

        Queue playerQueue = new Queue();

        for (int i = 0; i < 4; i++) {
            Player p = new Player(distributed[i]);
            playerQueue.enqueue(p);
        }

        System.out.println("\n========== PLAYERS IN QUEUE ==========");

        int playerNo = 1;
        while (!playerQueue.isEmpty()) {
            Player p = playerQueue.dequeue();
            System.out.println("\nPlayer " + (playerNo++) + " Cards:");
            p.printCards();
        }
    }
}

public class DeckOfCardsTest {
    public static void main(String[] args){
        DeckOfCards myDeckofCards = new DeckOfCards();
        myDeckofCards.shuffle();

        for (int i = 0 ; i< 52 ; i++){
            if (i % 4 == 0 && i != 0){
                System.out.println();
            }
            System.out.printf("%-19s", myDeckofCards.dealCards());
        }        
    }
}   
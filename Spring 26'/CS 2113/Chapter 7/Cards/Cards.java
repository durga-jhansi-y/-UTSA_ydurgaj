public class Cards{
    private final String face;
    private final String suit;

    public Cards(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    public String toString(){
        return face + " of " + suit;
    }

}
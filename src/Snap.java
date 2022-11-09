public class Snap {
    public static void main(String[] args){
        snap100Cards();
    }

    private static Card generateRandomCard(){
        return new Card();
    }

    private static Card[] generate100Cards(){

        Card[] cardArray = new Card[100];

        for (int i =0; i <  100; i++){
            Card currentCard = generateRandomCard();
            cardArray[i] = currentCard;

        }
        return cardArray;
    }

    public static boolean isCardMatch(Card card1, Card card2){
        if(card1.compareTo(card2) == 0 ){
            return true;
        }
        return false;

    }

    public static void snap100Cards(){
        int snap = 0;
        Card[] cardArray = generate100Cards();
        for (int i = 1; i < 100; i++){

            if(superSnap(cardArray[i],cardArray[i-1])){
                System.out.println("SUPERSNAP");
                snap++;
            }
            else if(isCardMatch(cardArray[i],cardArray[i-1])){
                System.out.println("SNAP");
                snap++;
            }
            System.out.println(cardArray[i].toString());
        }

        System.out.println("Total of " + snap + " snaps found ");

    }

    public static boolean superSnap(Card card1, Card card2){

        if(!card1.getColour().equals(card2.getColour())) return false;
        if(!isCardMatch(card1,card2)) return false;

        return true;

    }



}

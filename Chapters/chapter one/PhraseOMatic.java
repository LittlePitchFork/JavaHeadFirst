public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"Fido", "Zeus", "Bin"};
        String[] wordListTwo = {"Merel", "Dark", "Bird"};
        String[] wordListThree = {"Rich", "Place", "Exit"};
        int OneLenght = wordListOne.length; //OneLenght equals the amount of words in the list (3)
        int TwoLenght = wordListTwo.length;
        int ThreeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * OneLenght); // = integer something between 0 and 1 multiplied by number of items in list
        int rand2 = (int) (Math.random() * TwoLenght); // = integer something between 0 and 1 multiplied by number of items in list
        int rand3 = (int) (Math.random() * ThreeLenght); // = integer something between 0 and 1 multiplied by number of items in list

        String toPrint = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("There three words are randomly selected for you: " + toPrint);
    }
}
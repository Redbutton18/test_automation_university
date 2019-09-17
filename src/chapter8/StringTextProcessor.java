package chapter8;

public class StringTextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
    }

    /**
     *
     * @param text
     */
    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}

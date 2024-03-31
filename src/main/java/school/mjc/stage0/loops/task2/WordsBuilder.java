package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        // Check if any characters are provided
        if (chars.length == 0) {
            System.out.println("No characters provided to build the phrase.");
            return;
        }

        // Build the phrase
        StringBuilder phraseBuilder = new StringBuilder();
        for (char c : chars) {
            phraseBuilder.append(c);
        }

        // Print the built phrase
        String phrase = phraseBuilder.toString();
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('H', 'e', 'l', 'l', 'o');
    }
}


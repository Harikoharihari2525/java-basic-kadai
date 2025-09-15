package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        dictionary.setDictionary();

        String[] words = { "apple", "banana", "grape", "orange" };

        for (int i = 0; i < words.length; i++) {
            dictionary.search(words[i]);
        }
    }
}
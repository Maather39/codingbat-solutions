import java.util.ArrayList;
import java.util.List;

public class wordsWithout {
    public String[] wordsWithout(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) list.add(word);
        }
        return list.toArray(new String[0]);
    }
}

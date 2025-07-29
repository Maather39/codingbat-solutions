import java.util.Arrays;

public class wordsFront {
    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words, 0, n);
    }
}

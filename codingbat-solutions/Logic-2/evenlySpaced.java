import java.util.Arrays;

public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return (arr[2] - arr[1]) == (arr[1] - arr[0]);
    }
}

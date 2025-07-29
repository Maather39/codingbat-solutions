public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int i = 0, j = 0;
        String last = "";
        while (i < a.length && j < b.length) {
            int cmp = a[i].compareTo(b[j]);
            if (cmp == 0 && !a[i].equals(last)) {
                count++;
                last = a[i];
                i++;
                j++;
            } else if (cmp < 0) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}

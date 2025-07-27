public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int i = 0;
        for (int num : a) {
            if (i == 2) break;
            result[i++] = num;
        }
        for (int num : b) {
            if (i == 2) break;
            result[i++] = num;
        }
        return result;
    }
}

public class scoresAverage {
    public int scoresAverage(int[] scores) {
        return Math.max(avg(scores, 0, scores.length / 2), avg(scores, scores.length / 2, scores.length));
    }

    private int avg(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }
}

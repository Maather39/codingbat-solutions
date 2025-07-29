public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if (nameCompare < 0) return -1;
        else if (nameCompare > 0) return 1;
        else return Integer.compare(aId, bId);
    }
}

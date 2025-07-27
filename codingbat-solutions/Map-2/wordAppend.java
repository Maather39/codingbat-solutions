public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (String s : strings) {
        map.put(s, map.getOrDefault(s, 0) + 1);
        if (map.get(s) % 2 == 0) sb.append(s);
    }
    return sb.toString();
}

public Map<String, String> mapAB3(Map<String, String> map) {
    boolean a = map.containsKey("a");
    boolean b = map.containsKey("b");

    if (a && !b) {
        map.put("b", map.get("a"));
    } else if (!a && b) {
        map.put("a", map.get("b"));
    }

    return map;
}

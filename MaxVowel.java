class Solution {
  public int maxVowels(String s, int k) {

    char[] ch = { 'a', 'e', 'i', 'o', 'u' };

    Map<Character, Integer> map = new HashMap<>();

    map.put('a', 1);
    map.put('e', 1);
    map.put('i', 1);
    map.put('o', 1);
    map.put('u', 1);

    int st = 0;
    int end = k;

    int max = 0;

    max = findThreeVowel(s, st, end, map, max);

    int ans = max;

    st = 1;
    while (end < s.length()) {

      ans = balancVowels(s, st, end, map, ans);

      max = Math.max(max, ans);

      // max = ans;

      st++;
      end++;
    }

    return max;

  }

  private int balancVowels(String name, int i, int k, Map<Character, Integer> map, int max) {

    // l e e t c o d e
    // 0 1 2 3 4 5 6 7

    int ans = max;

    // System.out.println(map.get(name.charAt(i -1)));

    Integer y = map.get(name.charAt(i - 1));

    if (y != null && map.get(name.charAt(i - 1)) == 1)
      ans -= 1;
    if (map.get(name.charAt(k)) != null && map.get(name.charAt(k)) == 1)
      ans += 1;

    return ans;

  }

  private int findThreeVowel(String name, int st, int end, Map<Character, Integer> map, int max) {

    name = name.substring(st, end);

    for (int i = 0; i < end; i++) {

      if (map.containsKey(name.charAt(i)))
        max += 1;

    }

    return max;
  }
}
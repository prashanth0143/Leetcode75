public class IsSubString {
  public static void main(String args[]) {

  }

  public boolean isSubsequence(String s, String t) {
    int pointer = 0;
    int ans = 0;

    while (pointer < s.length() && ans < t.length()) {
      if (s.charAt(pointer) == t.charAt(ans)) {
        pointer++;
        ans++;
      } else {
        ans++;
      }

    }

    return pointer == s.length();
  }
}

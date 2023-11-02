class GratestCommon {
  public static void main(String[] args) {
    String str1 = "LEET";
    String str2 = "CODE";

    String answer = greatestCommonDevision(str1, str2);

    System.out.println(answer);

  }

  public static String greatestCommonDevision(String str1, String str2) {

    StringBuilder b = new StringBuilder();

    char[] c1 = str1.toCharArray();
    char[] c2 = str2.toCharArray();
    int min = Math.min(str1.length(), str2.length());
    for (int index = 0; index < min; index++) {
      if (c1[index] == c2[index]) {
        if (b.isEmpty() || c2[index] != b.charAt(b.length() - index)) {
          b.append(c2[index]);
        } else {
          break;
        }

      }
    }

    return b.toString();

  }

}

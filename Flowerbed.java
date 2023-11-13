class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {

    int len = flowerbed.length;

    int index = 0;
    int count = 0;

    while (index < len) {

      if (flowerbed[index] == 1) {
        index += 2;
      } else if (flowerbed[index] == 0) {
        if (index > 0 && index + 1 < len) {
          if (flowerbed[index + 1] == 0 && flowerbed[index - 1] == 0) {
            flowerbed[index] = 1;
            index += 2;
            count += 1;
          } else {
            index += 1;
          }
        } else if (index == 0 && flowerbed[index + 1] == 0) {
          flowerbed[index] = 1;
          count += 1;
          index += 1;
        } else {
          index += 1;
        }

        if (index == len - 1 && flowerbed[index] - 1 == 0) {
          flowerbed[index] = 1;
          count += 1;
        }
      }

    }

    return count >= n ? true : false;

  }
}
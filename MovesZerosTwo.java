public class MovesZerosTwo {
  public static void main(String[] args) {

    int[] arr = { 4, 2, 4, 0, 0, 3, 0, 5, 0, 1 };

    System.out.print(arr.length - 1);

    zerosMove(arr);

    for (int n : arr) {
      System.out.print(n + " ");

      // }
    }
  }

  // static void movesZer(int[] arr) {

  // // int[] ans = new int[arr.length];

  // int pointOne = 0;
  // int pointTwo = arr.length - 1;

  // while (pointOne < pointTwo) {
  // // if(arr[pointOne] != 0 && arr[pointTwo] != 0){
  // // pointOne+=1;

  // // }

  // // if (arr[pointOne] != 0 || arr[pointOne] == 0) {

  // // if (arr[pointTwo] != 0) {
  // // swap(arr, pointOne, pointTwo);
  // // pointOne += 1;
  // // pointTwo += 1;
  // // } else if (arr[pointTwo] == 0) {
  // // pointTwo += 1;
  // // }

  // // }

  // // pointOne += 1;

  // if (arr[pointOne] == 0 || arr[pointTwo] != 0) {
  // if (arr[pointTwo] != 0) {
  // swap(arr, pointOne, pointTwo);
  // pointOne += 1;
  // pointTwo -= 1;

  // } else {
  // pointTwo -= 1;
  // }

  // }

  // // pointOne += 1;

  // }
  // }

  public static void swap(int[] arr, int a, int b) {

    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;

  }

  static void zerosMove(int[] arr) {

    int pointer = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[pointer] = arr[i];
        pointer++;
      }

    }

    while (pointer < arr.length) {
      arr[pointer] = 0;
      pointer++;
    }
  }
}

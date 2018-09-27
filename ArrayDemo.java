public class ArrayDemo{
  public static void main(String[] args) {
    int[][] arytest = new int[10][10];
    printArray(arytest);
    System.out.println(countZeros1D(arytest[0]));
  }
  public static void printArray(int[] ary) {
    System.out.print("[");
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i]);
      if (i != ary.length - 1) {
        System.out.print(",");
      }
    }
    System.out.print("]");
    System.out.println(" ");
  }
  public static void printArray(int[][] ary) {
    for (int j = 0; j < ary.length; j++) {
      printArray(ary[j]);
    }
  }
  public static int countZeros1D(int[] ary) {
    int f = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i] == 0) {
        f++;
      }
    }
    return f;
  }
}

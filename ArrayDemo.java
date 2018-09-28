public class ArrayDemo{
  public static void main(String[] args) {
    int[][] arytest = new int[10][10];
    //printArray(arytest);
    //System.out.println(countZeros2D(arytest));
    fill2D(arytest);
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
  public static int countZeros2D(int[][] ary) {
    int f = 0;
    for (int j = 0; j < ary.length; j++) {
      f += countZeros1D(ary[j]);
    }
    return f;
  }
  public static void fill2D(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (i == j) {
          vals[i][j] = 3;
        }
        else {
          vals[i][j] = 1;
        }
      }
    }
    printArray(vals);
  }
}

public class ArrayDemo{
  public static void main(String[] args) {
    int[] arytest = new int[10];
    printArray(arytest);
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

  }

}

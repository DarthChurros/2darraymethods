public class ArrayMethods {
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x > ary.length) {
      return 0
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum += ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x) {
    int sum = 0;
    for (int i = 0; i < ary.length; i++) {
      if (x < ary[i].length) {
        sum += ary[i][x];
      }
    }
    return sum;
  }

  public static int[] allRowSums(int[][] ary) {
    int[] sums = new int[ary.length];
    for (int i = 0; i <  ary.length; i++) {
      sums[i] = rowSum(ary, i);
    }
    return sums;
  }

  public static int[] allColSums(int[][] ary) {
    int x = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > x) {
        x = ary[i].length;
      }
    }
    int[] sums =  new int[ary[0].length];
    for (int i = 0; i < x; i++) {
      sums[i] = columnSum(ary, i);
    }
  }
}

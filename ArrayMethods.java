public class ArrayMethods {
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x > ary.length || x < 0) {
      return 0;
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum += ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x) {
    int sum = 0;

    for (int i = 0; i < ary.length; i++) {
      if (x < 0) {
        return 0;
      }
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
    int[] sums =  new int[x];
    for (int i = 0; i < x; i++) {
      sums[i] = columnSum(ary, i);
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] ary) {
    boolean ans = true;
    int[] sums = allRowSums(ary);
    for (int i = 0; i < sums.length - 1; i++) {
      if (sums[i] != sums[i+1]) {
        ans = false;
      }
    }
    return ans;
  }
}

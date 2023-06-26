package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int sumRepetition(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public int sumOdd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public int sumEven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }
}

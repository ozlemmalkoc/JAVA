package packages;

public class Password2 {
  int password2;

  public int getPassword2() {
    return password2;
  }

  public void setPassword2(int password2) {
    this.password2 = password2;
  }

  public Password2(int password2) {
    this.password2 = password2;
  }

  public boolean isExactDivision(int password2, int[] denominations) {
    int temp = password2;
    if (password2 == 0)
      return true;
    if (denominations.length < 1)
      return false;

    if (password2 >= denominations[denominations.length - 1]) {
      password2 = password2 - denominations[denominations.length - 1];
    }

    if (isPrime(temp)) {
      denominations = removeElementFromArray(denominations);
    } else {
      if (password2 < denominations[denominations.length - 1])
        denominations = removeElementFromArray(denominations);
    }

    return isExactDivision(password2, denominations);
  }

  public static int[] removeElementFromArray(int[] arr) {
    int[] tempArray = new int[arr.length - 1];

    for (int i = 0; i < arr.length - 1; i++) {
      tempArray[i] = arr[i];
    }
    return tempArray;

  }
  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
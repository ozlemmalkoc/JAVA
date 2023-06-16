package packages;
public class Test {

  private Username username;
  private Password1 password1;
  private Password2 password2;
  private int[] denominations;

  public Test(Username username, Password1 password1, Password2 password2, int[] denominations) {
    this.username = username;
    this.password1 = password1;
    this.password2 = password2;
    this.denominations = denominations;
  }
  public int[] getDenominations() {
    return denominations;
  }

  public void setDenominations(int[] denominations) {
    this.denominations = denominations;
  }

  public Username getUsername() {
    return username;
  }

  public void setUsername(Username username) {
    this.username = username;
  }

  public Password1 getpassword1() {
    return password1;
  }

  public void setpassword1(Password1 password1) {
    this.password1 = password1;
  }

  public Password2 getPassword2() {
    return password2;
  }

  public void setPassword2(Password2 password2) {
    this.password2 = password2;
  }

  public static int[] sortIntArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }

    }
    return arr;
  } 
  public static String deleteParantheses(String str) {

    String[] paranthesesArray = {
      "(",
      ")",
      "}",
      "{",
      "[",
      "]"
    };
    for (String ch: paranthesesArray) {
      str = str.replace(ch, "");
    }

    return str;
  }
  public static String deleteLetters(String str) {

    str = str.replaceAll("[a-zA-Z]", "");
    str = str.replaceAll("[0-9]", "");
    return str;

  }

  public void toTest() {
   
    String temp1=new String();
    temp1=password1.getPassword1();
    
    String tempPasswordWithoutLetters=new String();
    String tempPasswordWithoutParanthesis=new String();
    tempPasswordWithoutLetters = deleteLetters(temp1);
    tempPasswordWithoutParanthesis = deleteParantheses(temp1);
    

    if (!username.checkIfValidUsername(username.getUsername())) {
      System.out.println("Username is invalid because it doesn't just consist of letters and minumum length is 1.Try again...");
    } else if (!password1.containsAtLeastTwoBrackets()) {
      System.out.println("Password1 is invalid because it does not contain at least two parentheses.Try again...");


    } else if (password1.getPassword1().length() < 8) {
      
      System.out.println("Password1 is invalid because it's length is less than 8.Try again...");
    } else if (!password1.checkIfValidPassword(tempPasswordWithoutParanthesis)) {
      
      System.out.println("Password1 is invalid because it doesn't just consist of letters and brackets.Try again...");
    } else if (!password1.isBalancedPassword((tempPasswordWithoutLetters))) {
      
      System.out.println("Password1 is invalid because brackets do not match.Try again...");
    } else if (password2.getPassword2() < 10 || password2.getPassword2() > 10000) {
      System.out.println("Password2 is invalid because it must be between 10 and 10000..Try again...");
    } else if (!username.containsUserNameSpirit(username.getUsername(), password1.getPassword1())) {
      
      System.out.println("Login is unsuccessful  because  password1 must contain at least one letter of the username. Try again...");
    } else if (!password1.isPalindromePossible(tempPasswordWithoutParanthesis)) {
      System.out.println("Login is unsuccessful  because  password1 cannot be palindrome. Try again...");
    } else if (!password2.isExactDivision(password2.getPassword2(),sortIntArray(denominations) )) {
      System.out.println("Login is unsuccessful  because  it is not possible to obtain the password2 with the given denominations. Try again...");
    } else {
      System.out.println("The username and passwords are valid. The door is opening, please wait...");
    }

  }

}
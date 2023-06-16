package packages;

import java.util.Stack;

public class Password1 {

  String password1;

  public String getPassword1() {
    return password1;
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public Password1(String password1) {
    this.password1 = password1;
  }

  public boolean isBalancedPassword(String password1) {

    Stack < Character > stack = new Stack < > ();

    if (password1.isEmpty()) {
      return false;
    }
    if (password1.length() % 2 != 0)
      return false;
    Character firstCharacter = password1.charAt(0);
    if (firstCharacter == ')' || firstCharacter == '}' || firstCharacter == ']') {
      return false;
    } else if (!(firstCharacter == '(' || firstCharacter == '{' || firstCharacter == '[')) {
      return false;
    }

    for (Character i: password1.toCharArray()) {
      if (i == '(' || i == '{' || i == '[') {
        stack.push(i);
      } else if (i == ')' || i == '}' || i == ']') {
        if ((stack.peek() == '(' && i == ')') || (stack.peek() == '{' && i == '}') || (stack.peek() == '[' && i == ']')) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public boolean checkIfValidPassword(String password1) {
    if (password1 == null)
      return false;

    if (password1.length() <= 1 && Character.isLetter(password1.charAt(0)))
      return true;

    if (Character.isLetter(password1.charAt(0))) {
      return checkIfValidPassword(password1.substring(1, password1.length()));
    } else {
      return false;
    }
  }

  public boolean containsAtLeastTwoBrackets() {
    int cnt = 0;
    String arr = "()[]{}";
    for (int j = 0; j < arr.length(); j++) {
      for (int i = 0; i < password1.length(); i++) {
        if (password1.charAt(i) == arr.charAt(j));
        cnt++;
      }
    }
    return (cnt >= 2);
  }


  public boolean isPalindromePossible(String password1) {
    if (password1.length() <= 1)
      return true;

    if (password1.charAt(0) == (password1.charAt(password1.length() - 1))) {

      return isPalindromePossible(password1.substring(1, password1.length() - 1));

    } else {
      String tempStr = null;

      Character ch = password1.charAt(0);

      tempStr = password1.substring(1, password1.length());

      int index = tempStr.indexOf(ch);
      if (index == -1) {
        password1 = tempStr.substring(0, tempStr.length() / 2) + ch + tempStr.substring(tempStr.length() / 2, tempStr.length());

        if (password1.length() == 3) {
          if (password1.charAt(0) != (password1.charAt(2)))
            return false;
        }
        return isPalindromePossible(password1.substring(0, password1.length()));
      }

      password1 = password1.substring(0, index + 1) + password1.substring(index + 2, password1.length()) + ch;

      if (password1.charAt(0) != (password1.charAt(password1.length() - 1)))
        return false;

      return isPalindromePossible(password1.substring(1, password1.length() - 1));
    }

  }

}
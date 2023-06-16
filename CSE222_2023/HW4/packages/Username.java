package packages;

import java.util.Stack;

public class Username {
  private String username;

  public Username(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public boolean checkIfValidUsername(String username) {
    if (username == null)
      return false;

    if (username.length() <= 1 && Character.isLetter(username.charAt(0)))
      return true;

    if (Character.isLetter(username.charAt(0))) {
      return checkIfValidUsername(username.substring(1, username.length()));
    } else {
      return false;
    }

  }
  public boolean containsUserNameSpirit(String username, String password1) {
    Stack < Character > stackUsername = new Stack < > ();
    Stack < Character > stackPassword1 = new Stack < > ();

    for (int i = 0; i < username.length(); i++) {
      stackUsername.push(username.charAt(i));
    }

    for (int j = 0; j < password1.length(); j++) {
      stackPassword1.push(password1.charAt(j));
    }
    int size=stackPassword1.size();
    if(size<stackUsername.size())
    size=stackUsername.size();
    for (int i = 0; i < size; i++) {
      if (stackUsername.contains(stackPassword1.pop()))
        return true;

    }
    return false;
  }

}
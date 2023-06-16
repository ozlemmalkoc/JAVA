package packages;
public class Main {
  public static void main(String[] args) {

    Username username = new Username("gokhan");
    Password2 password2 = new Password2(75);
    Password1 password1 = new Password1("{[(abacaba)]}");
    int[] denominations = {4,17,29};

    Username usernameX = new Username("aliali");
    Password2 password2X = new Password2(54);
    Password1 password1X = new Password1(")abc(cba");

    Username usernameY = new Username("gizem");
    Password2 password2Y = new Password2(54);
    Password1 password1Y = new Password1("{[(abacaba)]}");

    Username usernameZ = new Username("gokhan");
    Password2 password2Z = new Password2(75);
    Password1 password1Z = new Password1("{ab[bac]aaba}");

    Username usernameA = new Username("2dilek");
    Password2 password2A = new Password2(75);
    Password1 password1A = new Password1("{ab[bac]aaba}");

    Username usernameB = new Username("hakan");
    Password2 password2B = new Password2(35);
    Password1 password1B = new Password1("{(abba)cac}");



    Test test = new Test(username, password1, password2, denominations);
    Test test2 = new Test(usernameX, password1X, password2X, denominations);
    Test test3 = new Test(usernameY, password1Y, password2Y, denominations);
    Test test4 = new Test(usernameZ, password1Z, password2Z, denominations);
    Test test5 = new Test(usernameA, password1A, password2A, denominations);
    Test test6 = new Test(usernameB, password1B, password2B, denominations);


    test.toTest();

    System.out.println("*******************************************************************************");

    test2.toTest();

    System.out.println("*******************************************************************************");

    test3.toTest();

    System.out.println("*******************************************************************************");

    test4.toTest();

    System.out.println("*******************************************************************************");

    test5.toTest();

    System.out.println("*******************************************************************************");

    test6.toTest();

  }

}
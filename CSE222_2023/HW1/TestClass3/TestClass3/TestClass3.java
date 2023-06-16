package TestClass3;

public class TestClass3 {

  public static void main(String[] args) {

    Account[] accountArray = new Account[100];

    System.out.print("// STEP1... ");
    System.out.println("Creating accounts...");

    Account gizemsungu = new Account(1, "gizemsungu", "13.01.1993", "Istanbul");
    Account sibelgulmez = new Account(2, "sibelgulmez", "13.01.1994", "Istanbul");
    Account gokhankaya = new Account(3, "gokhankaya", "13.01.1989", "Istanbul");

    System.out.println("An account with username gizemsungu has been created.");
    System.out.println("An account with username sibelgulmez has been created.");
    System.out.println("An account with username gokhankaya has been created.");

    accountArray[0] = gizemsungu;
    accountArray[1] = sibelgulmez;
    accountArray[2] = gokhankaya;

    System.out.print("// STEP2... ");
    sibelgulmez.login(sibelgulmez.getUsername());

    System.out.print("// STEP3... ");

    Post post1 = new Post(1, sibelgulmez.getAccountId(), "I like Java.");
    sibelgulmez.addPost(post1);

    Post post2 = new Post(2, sibelgulmez.getAccountId(), "Java the coffee...");
    sibelgulmez.addPost(post2);

    System.out.print("// STEP4... ");
    sibelgulmez.follow(gizemsungu);
    sibelgulmez.follow(gokhankaya);

    System.out.print("// STEP5... ");

    sibelgulmez.logout(sibelgulmez.getUsername());

    System.out.print("// STEP6... ");

    gokhankaya.login(gokhankaya.getUsername());

    System.out.print("// STEP7... ");

    gokhankaya.viewProfile(sibelgulmez);

    System.out.print("// STEP8... ");
    gokhankaya.viewPosts(sibelgulmez);

    System.out.print("// STEP9... ");
    Like like1 = new Like(post1, gokhankaya);
    gokhankaya.addLikeToPost(sibelgulmez, like1);
    System.out.print("// STEP10... ");
    Comment comment1 = new Comment(post1, "Nice photo!", gokhankaya);
    gokhankaya.addCommentToPost(sibelgulmez, comment1);

    System.out.print("// STEP11... ");
    gokhankaya.follow(gizemsungu);
    gokhankaya.follow(sibelgulmez);

    System.out.print("// STEP12... ");
    Message message1 = new Message(1, gokhankaya, gizemsungu, "merhaba");

    System.out.print("// STEP13... ");
    gokhankaya.logout(gokhankaya.getUsername());

    System.out.print("// STEP14... ");
    gizemsungu.login(gizemsungu.getUsername());

    System.out.print("// STEP15... ");
    gizemsungu.checkNumberOfMessageOutbox();
    System.out.print("// STEP16... ");
    gizemsungu.checkNumberOfMessageInbox();

    System.out.print("// STEP17... ");
    gizemsungu.viewInbox();

    System.out.print("// STEP18... ");
    gizemsungu.viewProfile(sibelgulmez);

    System.out.print("// STEP19... ");
    gizemsungu.viewPosts(sibelgulmez);

    System.out.print("// STEP20... ");
    gizemsungu.viewPostsInteractions(sibelgulmez, accountArray);
   
    System.out.print("// STEP21... ");
    Like like2=new Like(post2,gizemsungu);
    gizemsungu.addLikeToPost(sibelgulmez, like1);
    gizemsungu.addLikeToPost(sibelgulmez, like2);

    System.out.print("// STEP22... ");
    gizemsungu.viewPostsInteractions(sibelgulmez, accountArray);

    System.out.println("***********************************************************************");
    System.out.println("THE BEGINNING OF SCENARIO 3");

    gizemsungu.login(gizemsungu.getUsername());
    gizemsungu.blocks(sibelgulmez);
    gizemsungu.logout(gizemsungu.getUsername());

    sibelgulmez.login(sibelgulmez.getUsername());
    sibelgulmez.viewProfile(gizemsungu);
    Message message3 = new Message(3, sibelgulmez, gizemsungu, "hellloo");

  }

}
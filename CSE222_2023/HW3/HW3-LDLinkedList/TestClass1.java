//package TestClass1;
import class_packages.*;



public class TestClass1 {

    public static void main(String[] args) {
        long start = System.nanoTime();

        LDLinkedList<Account> accountArray = new LDLinkedList<Account>();
    
        System.out.println("**********************STEP1**********************");
        System.out.println("Creating accounts...");
    
        Account gizemsungu = new Account(1, "gizemsungu", "13.01.1993", "Istanbul");
        Account sibelgulmez = new Account(2, "sibelgulmez", "13.01.1994", "Istanbul");
        Account gokhankaya = new Account(3, "gokhankaya", "13.01.1989", "Istanbul");
    
    
        accountArray.add(gizemsungu);
        accountArray.add(sibelgulmez);
        accountArray.add(gokhankaya);
       
    
        System.out.println("**********************STEP2**********************");
        sibelgulmez.login(sibelgulmez.getUsername());
    
        System.out.println("**********************STEP3**********************");
    
        Post post1 = new Post(1, sibelgulmez.getAccountId(), "I like Java.");
        sibelgulmez.addPost(post1);
    
        Post post2 = new Post(2, sibelgulmez.getAccountId(), "Java the coffee...");
        sibelgulmez.addPost(post2);
    
        System.out.println("**********************STEP4**********************");
        sibelgulmez.follow(gizemsungu);
        sibelgulmez.follow(gokhankaya);
     
        System.out.println("**********************STEP5**********************");
    
        sibelgulmez.logout(sibelgulmez.getUsername());
   
        System.out.println("**********************STEP6**********************");
    
        gokhankaya.login(gokhankaya.getUsername());
    
        System.out.println("**********************STEP7**********************");
    
        gokhankaya.viewProfile(sibelgulmez);
    
        System.out.println("**********************STEP8**********************");
        gokhankaya.viewPosts(sibelgulmez);
   
        System.out.println("**********************STEP9**********************");
        Like like1 = new Like(post1, gokhankaya);
        gokhankaya.addLikeToPost(sibelgulmez, like1);
      
        System.out.println("**********************STEP10**********************");
        Comment comment1 = new Comment(post1, "me too!", gokhankaya);
        gokhankaya.addCommentToPost(sibelgulmez, comment1);
   
        System.out.println("**********************STEP11**********************");
        gokhankaya.follow(gizemsungu);
        gokhankaya.follow(sibelgulmez);
    
        System.out.println("**********************STEP12**********************");
        Message message1 = new Message(1, gokhankaya, gizemsungu, "This homework is too easy!");
   
        System.out.println("**********************STEP13**********************");
        gokhankaya.logout(gokhankaya.getUsername());
    
        System.out.println("**********************STEP14**********************");
        gizemsungu.login(gizemsungu.getUsername());
      
        System.out.println("**********************STEP15**********************");
        gizemsungu.checkNumberOfMessageOutbox();
        System.out.println("**********************STEP16**********************");
        gizemsungu.checkNumberOfMessageInbox();
    
        System.out.println("**********************STEP17**********************");
        gizemsungu.viewInbox();
    
        System.out.println("**********************STEP18**********************");
        gizemsungu.viewProfile(sibelgulmez);
    
        System.out.println("**********************STEP19**********************");
        gizemsungu.viewPosts(sibelgulmez);
    
        System.out.println("**********************STEP20**********************");
        gizemsungu.viewPostsInteractions(sibelgulmez, accountArray);
      
        System.out.println("**********************STEP21**********************");
        Like like2=new Like(post2,gizemsungu);
        Like like3=new Like(post1,gizemsungu);
        gizemsungu.addLikeToPost(sibelgulmez, like2);
        gizemsungu.addLikeToPost(sibelgulmez, like3);
    
        System.out.println("**********************STEP22**********************");
        gizemsungu.viewPostsInteractions(sibelgulmez, accountArray);
       
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time : "+timeElapsed);
    }
   
}

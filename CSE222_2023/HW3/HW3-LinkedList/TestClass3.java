
import java.util.LinkedList;

import class_packages.*;

public class TestClass3 {

  public static void main(String[] args) {
    long start = System.nanoTime();
    LinkedList<Account> accountArray = new LinkedList<Account>();
        System.out.println("**********************SCENARIO1**********************");
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
     
        System.out.println("**********************SCENARIO2**********************");
        
      
        
        System.out.println("**********************STEP1**********************");
     
        gizemsungu.login(gizemsungu.getUsername());
       
        System.out.println("**********************STEP1A**********************");
   
        gizemsungu.addPost(post1);
        System.out.println("**********************STEP1B**********************");
        
        gizemsungu.addPost(post2);
        System.out.println("**********************STEP1C**********************");
        gizemsungu.logout(gizemsungu.getUsername());


        System.out.println("**********************STEP2**********************");
        
        sibelgulmez.login(sibelgulmez.getUsername());
        System.out.println("**********************STEP2A**********************");
        sibelgulmez.viewProfile(gizemsungu);
        System.out.println("**********************STEP2B**********************");
        Like like4=new Like(post1,sibelgulmez);
        sibelgulmez.addLikeToPost(gizemsungu, like4);
        System.out.println("**********************STEP2C**********************");
        sibelgulmez.logout(sibelgulmez.getUsername());
        
        
        System.out.println("**********************STEP3**********************");
        
        gokhankaya.login(gokhankaya.getUsername());
        System.out.println("**********************STEP3A**********************");
        gokhankaya.viewProfile(gizemsungu);
        System.out.println("**********************STEP3B**********************");
        Comment comment2 = new Comment(post2, "Nice!", gokhankaya);
        gokhankaya.addCommentToPost(sibelgulmez, comment2);

        System.out.println("**********************STEP3C**********************");
        Message message2= new Message(2,gokhankaya,gizemsungu,"Hello!");
        System.out.println("**********************STEP3D**********************");
        gokhankaya.logout(gokhankaya.getUsername());
    

        System.out.println("**********************STEP4**********************");
        gizemsungu.login(gizemsungu.getUsername());
        System.out.println("**********************STEP4A**********************");
        gizemsungu.viewProfile(gizemsungu);
        System.out.println("**********************STEP4B**********************");
        gizemsungu.viewInboxFromSpecificPerson(gokhankaya);
        

    
        System.out.println("**********************SCENARIO3**********************");
        System.out.println("**********************STEP1**********************");
    gizemsungu.login(gizemsungu.getUsername());
    System.out.println("**********************STEP1A**********************");
    gizemsungu.blocks(sibelgulmez);
    System.out.println("**********************STEP1B**********************");
    gizemsungu.logout(gizemsungu.getUsername());
    System.out.println("**********************STEP2**********************");
    sibelgulmez.login(sibelgulmez.getUsername());
    System.out.println("**********************STEP2A**********************");
    sibelgulmez.viewProfile(gizemsungu);
    System.out.println("**********************STEP2B**********************");
    Message message3 = new Message(3, sibelgulmez, gizemsungu, "hellloo");

    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Time : "+timeElapsed);
  }

}
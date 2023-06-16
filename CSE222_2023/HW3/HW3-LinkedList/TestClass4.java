
import java.util.LinkedList;

import class_packages.*;

public class TestClass4 {
    
    public static void main(String[] args) {
    
    long start = System.nanoTime();
    
    LinkedList<Account> accountArray = new LinkedList<Account>();
    
    System.out.println("**********************SCENARIO4**********************");
    System.out.println("**********************STEP**********************");
    System.out.println("Creating accounts...");

    Account gizemsungu = new Account(1, "gizemsungu", "13.01.1993", "Istanbul");
    Account sibelgulmez = new Account(2, "sibelgulmez", "15.01.1994", "Istanbul");
    Account gokhankaya = new Account(3, "gokhankaya", "17.05.1989", "Istanbul");
    Account ayseyildiz = new Account(4, "ayseyildiz", "19.04.1993", "Kocaeli");
    Account dilekkose = new Account(5, "dilekkose", "18.07.1994", "Kocaeli");
    Account ozgebabur = new Account(6, "ozgebabur", "20.03.1989", "Kocaeli");
    Account merveozcelik = new Account(7, "merveozcelik", "15.06.1993", "Samsun");
    Account salihzengin = new Account(8, "salihzengin", "13.05.1994", "Kocaeli");
    Account cevatakkaya = new Account(9, "cevatakkaya", "11.08.1989", "Kocaeli");
    Account esrakaratas = new Account(10, "esrakaratas", "17.09.1989", "Istanbul");

 

    accountArray.add(gizemsungu);
    accountArray.add(sibelgulmez);
    accountArray.add(gokhankaya);
    accountArray.add(ayseyildiz);
    accountArray.add(dilekkose);
    accountArray.add(ozgebabur);
    accountArray.add(merveozcelik);
    accountArray.add(salihzengin);
    accountArray.add(cevatakkaya);
    accountArray.add(esrakaratas);



    System.out.println("**********************STEP1**********************");
     
    dilekkose.login(dilekkose.getUsername());
   
    System.out.println("**********************STEP2**********************");
    Post post1 = new Post(1,dilekkose.getAccountId(),"POST 1");
    dilekkose.addPost(post1);
    
    Post post2 = new Post(2,sibelgulmez.getAccountId(),"POST 2");
    dilekkose.addPost(post2);
    System.out.println("**********************STEP3**********************");
    dilekkose.logout(dilekkose.getUsername());

    System.out.println("**********************STEP4**********************");
    ayseyildiz.login(ayseyildiz.getUsername());
    System.out.println("**********************STEP5**********************");
    Like like1=new Like(post1,ayseyildiz);
    ayseyildiz.addLikeToPost(dilekkose, like1);
    System.out.println("**********************STEP6**********************");
    Comment comment1 = new Comment(post1, "You look like so beautiful!", ayseyildiz);
    ayseyildiz.addCommentToPost(dilekkose, comment1);
 
    System.out.println("**********************STEP7**********************");
    Message message1= new Message(1,ayseyildiz,dilekkose,"Hello ! How are you ? ");
    System.out.println("**********************STEP8**********************");
    ayseyildiz.follow(gokhankaya);
    System.out.println("**********************STEP9**********************");
    ayseyildiz.viewProfile(gokhankaya);
    System.out.println("**********************STEP10**********************");
    ayseyildiz.checkNumberOfMessageOutbox();
    System.out.println("**********************STEP11**********************");
    ayseyildiz.logout(ayseyildiz.getUsername());
    System.out.println("**********************STEP12**********************");
    ayseyildiz.viewHistory();
    System.out.println("**********************STEP13**********************");
    ayseyildiz.viewProfile(esrakaratas);
    System.out.println("**********************STEP14**********************");
    cevatakkaya.login(cevatakkaya.getUsername());
    System.out.println("**********************STEP15**********************");
    cevatakkaya.follow(dilekkose);
    System.out.println("**********************STEP16**********************");
    Message message2= new Message(2,cevatakkaya,dilekkose,"Good morning! ");
    System.out.println("**********************STEP17**********************");
    Comment comment2 = new Comment(post2, "Waow nice photo!", cevatakkaya);
    cevatakkaya.addCommentToPost(dilekkose, comment2);
    System.out.println("**********************STEP18**********************");
    Like like2=new Like(post1,cevatakkaya);
    cevatakkaya.addLikeToPost(dilekkose, like2);
    System.out.println("**********************STEP19**********************");
    Like like3=new Like(post2,cevatakkaya);
    cevatakkaya.addLikeToPost(dilekkose, like3);
    System.out.println("**********************STEP20**********************");
    cevatakkaya.checkNumberOfMessageInbox();
    System.out.println("**********************STEP21**********************");
    cevatakkaya.checkNumberOfMessageOutbox();
    System.out.println("**********************STEP22**********************");
    cevatakkaya.viewProfile(dilekkose);
    System.out.println("**********************STEP23**********************");
    cevatakkaya.viewPosts(dilekkose);
    System.out.println("**********************STEP24**********************");
    cevatakkaya.viewPostsInteractions(dilekkose, accountArray);

    System.out.println("**********************STEP25**********************");
    cevatakkaya.removeCommentFromPost(dilekkose, comment2);
    System.out.println("**********************STEP26**********************");
    cevatakkaya.removeLikeFromPost(dilekkose, like3);
    System.out.println("**********************STEP27**********************");
    cevatakkaya.viewPostsInteractions(dilekkose, accountArray);
    System.out.println("**********************STEP28**********************");
   cevatakkaya.blocks(dilekkose);
   System.out.println("**********************STEP29**********************");
   
    cevatakkaya.addLikeToPost(dilekkose, like3);
    System.out.println("**********************STEP30**********************");
    cevatakkaya.addCommentToPost(dilekkose, comment2);
    System.out.println("**********************STEP31**********************");
    cevatakkaya.viewPostsInteractions(dilekkose, accountArray);
    System.out.println("**********************STEP32**********************");
    Message message3= new Message(3,cevatakkaya,dilekkose,"Hello again ");
    System.out.println("**********************STEP33**********************");
   cevatakkaya.unblocks(dilekkose);
   System.out.println("**********************STEP34**********************");
    cevatakkaya.unfollow(dilekkose);
    System.out.println("**********************STEP35**********************");
    cevatakkaya.viewHistory();
    System.out.println("**********************STEP36**********************");
    cevatakkaya.logout(cevatakkaya.getUsername());
    System.out.println("**********************STEP37**********************");
    merveozcelik.login(merveozcelik.getUsername());
    System.out.println("**********************STEP38**********************");
    merveozcelik.follow(dilekkose);
    System.out.println("**********************STEP39**********************");
    Like like4=new Like(post1,merveozcelik);
    merveozcelik.addLikeToPost(dilekkose, like4);
    System.out.println("**********************STEP40**********************");
    Message message4= new Message(4,merveozcelik,dilekkose,"where are you from?");
    System.out.println("**********************STEP41**********************");
    merveozcelik.logout(merveozcelik.getUsername());
    System.out.println("**********************STEP42**********************");
    esrakaratas.login(esrakaratas.getUsername());
    System.out.println("**********************STEP43**********************");
    esrakaratas.blocks(dilekkose);
    System.out.println("**********************STEP44**********************");
    esrakaratas.unblocks(dilekkose);
    System.out.println("**********************STEP45**********************");
    esrakaratas.logout(esrakaratas.getUsername());
    System.out.println("**********************STEP46**********************");

    salihzengin.login(salihzengin.getUsername());
    System.out.println("**********************STEP47**********************");
    salihzengin.follow(ozgebabur);
    System.out.println("**********************STEP48**********************");
    Message message5= new Message(5,salihzengin,gokhankaya,"where are you from?");
    System.out.println("**********************STEP49**********************");
    salihzengin.follow(dilekkose);
    System.out.println("**********************STEP50**********************");
    salihzengin.viewPosts(dilekkose);
    System.out.println("**********************STEP51**********************");
    salihzengin.unfollow(dilekkose);
    System.out.println("**********************STEP52**********************");
    salihzengin.viewProfile(dilekkose);
    System.out.println("**********************STEP53**********************");
    salihzengin.logout(salihzengin.getUsername());
    System.out.println("**********************STEP54**********************");
    sibelgulmez.login(sibelgulmez.getUsername());
    System.out.println("**********************STEP55**********************");
    sibelgulmez.checkNumberOfMessageInbox();
    System.out.println("**********************STEP56**********************");

    sibelgulmez.blocks(esrakaratas);
    System.out.println("**********************STEP57**********************");
    sibelgulmez.logout(sibelgulmez.getUsername());
    System.out.println("**********************STEP58**********************");
    dilekkose.login(dilekkose.getUsername());
    System.out.println("**********************STEP59**********************");
    dilekkose.viewInboxFromSpecificPerson(cevatakkaya);
    System.out.println("**********************STEP60**********************");

    gokhankaya.viewInbox();
    System.out.println("**********************STEP61**********************");
    gizemsungu.viewHistory();
    System.out.println("**********************STEP62**********************");
    gizemsungu.logout(gizemsungu.getUsername());



    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Time : "+timeElapsed);




    





    

   


      

    }
    
}

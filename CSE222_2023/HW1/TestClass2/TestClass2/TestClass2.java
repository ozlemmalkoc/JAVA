package TestClass2;
public class TestClass2 {

    public static void main(String[] args) {
      
        Account[] accountArray=new Account[100];
     
        System.out.println("   // **********************STEP***********************");
        System.out.println("... Creating accounts...");
      
        Account gizemsungu = new Account(4,"gizemsungu","13.01.1993","Istanbul");
        Account sibelgulmez = new Account(5,"sibelgulmez","13.01.1994","Istanbul");
        Account gokhankaya = new Account(6,"gokhankaya","13.01.1989","Istanbul");
      
        System.out.println("An account with username gizemsungu has been created.");
        System.out.println("An account with username gizemsungu has been created.");
        System.out.println("An account with username gizemsungu has been created.");
       
        accountArray[0]=gizemsungu;
        accountArray[1]=sibelgulmez;
        accountArray[2]=gokhankaya;

        System.out.println("   // **********************STEP1************************");
     
        gizemsungu.login(gizemsungu.getUsername());
       
        System.out.println("   // **********************STEP1A************************");
        Post post1 = new Post(1,gizemsungu.getAccountId(),"POST 1");
        gizemsungu.addPost(post1);
        System.out.println("   // **********************STEP1B************************");
        Post post2 = new Post(1,sibelgulmez.getAccountId(),"POST 2");
        sibelgulmez.addPost(post2);
        System.out.println("   // **********************STEP1C************************");
        gizemsungu.logout(gizemsungu.getUsername());


        System.out.println("   // **********************STEP2************************");
        
        sibelgulmez.login(sibelgulmez.getUsername());
        System.out.println("   // **********************STEP2A************************");
        sibelgulmez.viewProfile(gizemsungu);
        System.out.println("   // **********************STEP2B************************");
        
        System.out.println("   // **********************STEP2C************************");
        sibelgulmez.logout(sibelgulmez.getUsername());
        
        
        System.out.println("   // **********************STEP3************************");
        
        gokhankaya.login(gokhankaya.getUsername());
        System.out.println("   // **********************STEP3A************************");
        gokhankaya.viewProfile(gizemsungu);
        System.out.println("   // **********************STEP3B************************");
      

        System.out.println("   // **********************STEP3C************************");
        Message message1= new Message(2,gokhankaya,gizemsungu,"Hello!");
        System.out.println("   // **********************STEP3D************************");
        gokhankaya.logout(gokhankaya.getUsername());
    

        System.out.println("   // **********************STEP4************************");
        gizemsungu.login(gizemsungu.getUsername());
        System.out.println("   // **********************STEP4A************************");
        gizemsungu.viewProfile(gizemsungu);
        System.out.println("   // **********************STEP4B************************");
        gizemsungu.viewInboxFromSpecificPerson(sibelgulmez);
        
        
    }
    
}

package TestClass1;
public class Account{
    private int accountId;
    private String username;
    private String birthdate;
    private String location;
    private Post[] posts ;
    private Message[] messages;
    private Account[] following;
    private Account[] followers;
    private boolean isLogin;
    private Account[] blockedPeople;
    private Account[] peopleWhoBlocked;

  
    public Account(){}
    public Account(int accountId, String username, String birthdate, String location) {
        this.accountId = accountId;
        this.username = username;
        this.birthdate = birthdate;
        this.location = location;
        this.isLogin=false;
        
        this.posts=new Post[100];
        this.messages=new Message[100];
        
        followers=new Account[100];
        following=new Account[100];
        blockedPeople=new Account[100];
        peopleWhoBlocked=new Account[100];
    }
    public Account[] getBlockedPeople() {
        return blockedPeople;
    }
    public void setBlockedPeople(Account[] blockedPeople) {
        this.blockedPeople = blockedPeople;
    }
    public Account[] getPeopleWhoBlocked() {
        return peopleWhoBlocked;
    }
    public void setPeopleWhoBlocked(Account[] peopleWhoBlocked) {
        this.peopleWhoBlocked = peopleWhoBlocked;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Post[] getPosts() {
        return posts;
    }
    public void setPosts(Post[] posts) {
        this.posts = posts;
    }
    public Message[] getMessages() {
        return messages;
    }
    public void setMessages(Message[] messages) {
        this.messages = messages;
    }
    public Account[] getFollowing() {
        return following;
    }
    public void setFollowing(Account[] following) {
        this.following = following;
    }
    public Account[] getFollowers() {
        return followers;
    }
    public void setFollowers(Account[] followers) {
        this.followers = followers;
    }
   
    public void login(String username)
    {  
         this.isLogin=true;
        
         if(this.username==username)
        {
            System.out.println("Logging into an account (username: "+ username + " )");
        }
    }

    public void addPost(Post post)
    {  if(isLogin==true)
       {    System.out.println("Sharing post..."); 
        for(int i=0;i<posts.length;i++)
        {  
            if(posts[i]==null)
            {   posts[i]=post;   
                break;
            }         
        } 
    }
    else{
        System.out.println("Please logging into your account to share post!");
    }
    }

    public void follow(Account user)
    { 
        if(isLogin==true && isBlockedPerson(user)==false)
        {
            this.following[this.numberOfElements(following)]=user;
            user.followers[user.numberOfElements(user.getFollowers())]=this;
            System.out.println("Following "+user.getUsername());
        }
       else
       { 
            System.out.println("Please logging into your account to follow someone!");
        }
        
    }

   
   
    public void logout(String username)
    {   
        this.isLogin=false;
        
        if(this.username==username)
        {
            System.out.println("Logging out from account  ( "+ username + " )");
        }
    }

    public void viewProfile(Account user)
    {   
        if(isBlockedPerson(user)==false)
        {   
            System.out.println("Viewing "+user.getUsername()+"'s profile...");
            System.out.println("UserId :  "+ user.getAccountId());
            System.out.println("Username :  "+ user.getUsername());
            System.out.println("Location :  "+ user.getLocation());
            System.out.println("Birth Day :  "+ user.getBirthdate());
            System.out.println(user.getUsername()+" is following "+user.numberOfElements(user.getFollowing())+" account(s) and has " +user.numberOfElements(user.getFollowers())+"  follower(s)");
            System.out.print(user.getUsername()+" is following: :  ");

        for(int i=0;i<user.numberOfElements(user.getFollowing());i++)
        {
                System.out.print(user.getFollowing()[i].getUsername()+" , ");
        }
        
        System.out.println();
        System.out.print("The followers of "+ user.getUsername()+" are: ");
        
        for(int i=0;i<user.numberOfElements(user.getFollowers());i++)
        {    
                System.out.print(user.getFollowers()[i].getUsername()+" , ");
        }
        
        System.out.println();
            System.out.println(user.getUsername()+" has  "+user.numberOfPost(user.posts) +"  posts");
        
        }
    }

    public void viewPosts(Account user)
    {   if(isBlockedPerson(user)==false)
        { 
            System.out.println("Viewing "+user.getUsername() +"'posts... ");
        for(int i =0 ; i< this.numberOfPost(user.getPosts());i++)
        {
            System.out.println("POST ID : "+i+" "+user.getUsername()+" : " + user.getPosts()[i].getContent());
            
        }
       
    }else
    System.out.println("There is not  "+user.getUsername() +"'posts... ");
    }
    public void viewPostsInteractions(Account user,Account[] accounts)
    {   
        if(isBlockedPerson(user)==false)
        { 
        
        for(int i =0 ; i< this.numberOfPost(user.getPosts());i++)
        {
            System.out.println("POST ID : "+i+" "+user.getUsername()+" : " + user.getPosts()[i].getContent());
            for(int j=0;j<accounts.length && accounts[j]!=null;j++)
            {
                for(int k=0;k<user.posts[i].getLikes().length && user.posts[i].getLikes()[k]!=null;k++)
                if(accounts[j].getAccountId()==user.posts[i].getLikes()[k].getAccountId())
                {
                    System.out.println(accounts[j].getUsername()+",");
                }

            }
            System.out.println("The posts has "+user.numberOfComments(user.posts[i].getComments())+" comments");
            for(int j=0;j<accounts.length && accounts[j]!=null;j++)
            {
                for(int k=0;k<user.posts[i].getComments().length && user.posts[i].getComments()[k]!=null;k++)
                if(accounts[j].getAccountId()==user.posts[i].getComments()[k].getAccountId())
                {
                    System.out.println(accounts[j].getUsername()+"   said to "+user.posts[i].getComments()[k].getContent());
                }
                
            }

            System.out.println("Viewing "+user.getUsername() +"'posts... ");
        }
        System.out.println("There is not  "+user.getUsername() +"'posts... ");
        }
        
       
    }

    public int numberOfElements(Account[] accounts )
    {   int i;
        for( i=0;i<accounts.length;i++)
        {
            if(accounts[i]==null)
            {
                return i;
            }
        }
        return 0;
    }
    public int numberOfPost(Post[] posts)
    {
        int i;
        for( i=0;i<posts.length;i++)
        {
            if(posts[i]==null)
            {
                return i;
            }
        }
        return 0;

    }
    public int numberOfMessages(Message[] messages)
    {
        int i;
        for( i=0;i<messages.length;i++)
        {
            if(messages[i]==null)
            {
                return i;
            }
        }
        return 0;

    }

    public int checkNumberOfMessageInbox()
    {  int j=0;
        for(int i=0;i<this.numberOfMessages(this.getMessages());i++)
        {
            if(this.messages[i].getSenderId().getAccountId()==this.accountId)
            {
                j++;
            }
        } System.out.println("Checking inbox...");
        System.out.println("There is/are "+ j+" message(s) in the inbox.");
        return j;
    }

    public int checkNumberOfMessageOutbox()
    {  int j=0;
        for(int i=0;i<this.numberOfMessages(this.getMessages());i++)
        {
            if(this.messages[i].getReceiverId().getAccountId()==this.accountId)
            {
                j++;
            }

        }
        System.out.println("Checking outbox...");
        System.out.println("There is/are "+ j+" message(s) in the outbox.");
        return j;
    }
    public void findLikedAccounts(Account[] accounts)
    {

        
    }
    public void viewInbox()
    {   if(isLogin==true)
        {for(int i=0;i<this.numberOfMessages(this.getMessages());i++)
        {   System.out.println("Viewing inbox...");
            System.out.println("Message ID : "+messages[i].getMessageId());
            System.out.println("From : "+messages[i].getSenderId().getUsername());
            System.out.println("To : "+messages[i].getReceiverId().getUsername());
            System.out.println("Message : "+messages[i].getContent());
        }}
        else
        {
            System.out.println("Please logging into your account to view inbox!");
        }

       
    }

    public void blocks(Account person)
    {
        if(isLogin==true)
        { for(int i=0;i<blockedPeople.length;i++)
         {  
             if(blockedPeople[i]==null)
             {   blockedPeople[i]=person;
                person.getPeopleWhoBlocked()[person.numberOfBlockedPeople(person.getPeopleWhoBlocked())]=this ; 
          
                 break;
             }         
         } 
     }
     else{
         System.out.println("Please logging into your account to blocks someone!");
     }
    }

  public int numberOfBlockedPeople(Account[] blockedPeople)
    {
        int i;
        for( i=0;i<blockedPeople.length;i++)
        {
            if(blockedPeople[i]==null)
            {
                return i;
            }
        }
        return 0;

 
    }

    public int numberOfComments(Comment[] comments)
    {
        int i;
        for( i=0;i<comments.length;i++)
        {
            if(comments[i]==null)
            {
                return i;
            }
        }
        return 0;

 
    }
    public void addCommentToPost(Account person,Comment comment)
    {
        for(int i=0;i<person.getPosts().length;i++)
        {
            if(person.getPosts()[i]!=null && person.getPosts()[i].getPostId()==comment.getPostId())
            {
                person.getPosts()[i].addComment(comment);
                
            }
        } 
    }
    public void addLikeToPost(Account person,Like like)
    {
        for(int i=0;i<person.getPosts().length;i++)
        {
            if(person.getPosts()[i]!=null && person.getPosts()[i].getPostId()==like.getPostId())
            {
                person.getPosts()[i].addLike(like);
                
            }
        } 
    }

    public  boolean isBlockedPerson(Account person)
    {
        for (int i = 0;i<peopleWhoBlocked.length;i++)
        {
            if(person==peopleWhoBlocked[i])
            return true;
            
        }
         return false;
    }
    
}
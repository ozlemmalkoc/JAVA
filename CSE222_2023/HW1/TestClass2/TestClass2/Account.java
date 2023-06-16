package TestClass2;
public class Account{
    private int accountId;
    private String username;
    private String birthdate;
    private String location;
    private Post[] posts ;
    private Message[] messages;
    private Account[] following;
    private Account[] followers;
  
    public Account(){}
    public Account(int accountId, String username, String birthdate, String location) {
        this.accountId = accountId;
        this.username = username;
        this.birthdate = birthdate;
        this.location = location;
        

        this.posts=new Post[100];
        this.messages=new Message[100];
        
      
        followers=new Account[10];
        following=new Account[10];
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
        if(this.username==username)
        {
            System.out.println("Logging into an account (username: "+ username + " )");
        }
    }

   public void addPost(Post post)
    {  
        for(int i=0;i<posts.length;i++)
        {  
            if(posts[i]==null)
            {   posts[i]=post;   
                break;
            }         
        } 
    }

    public void follow(Account user)
    { 
       following[this.numberOfElements(following)]=user;
       user.followers[user.numberOfElements(followers)]=user;
        
    }

   
   
    public void logout(String username)
    {
        if(this.username==username)
        {
            System.out.println("Logging out from account  "+ username + " )");
        }
    }

    public void viewProfile(Account user)
    {   System.out.println("Viewing "+user.getUsername()+"'s profile...");
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
        System.out.println(user.getUsername()+" has  "+user.numberOfPost(user.posts) +"  posts");
       
        
    }

    public void viewPosts(Account user)
    {   System.out.println("Viewing "+user.getUsername() +"'posts... ");
        
        for(int i =0 ; i< this.numberOfPost(user.getPosts());i++)
        {
            System.out.println("POST ID : "+i+" "+user.getUsername()+" : " + user.getPosts()[i].getContent());
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
        }
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
        return j;
    }

    public void viewInbox()
    {
        for(int i=0;i<this.numberOfMessages(this.getMessages());i++)
        {
            System.out.println("Message ID : "+messages[i].getMessageId());
            System.out.println("From : "+messages[i].getSenderId().getUsername());
            System.out.println("To : "+messages[i].getReceiverId().getUsername());
            System.out.println("Message : "+messages[i].getContent());
        }

       
    }
    public void viewInboxFromSpecificPerson(Account person)
    {
        for(int i=0;i<this.numberOfMessages(this.getMessages());i++)
        {   if(person.getUsername()==messages[i].getSenderId().getUsername())
           { System.out.println("Message ID : "+messages[i].getMessageId());
            System.out.println("From : "+messages[i].getSenderId().getUsername());
            System.out.println("To : "+messages[i].getReceiverId().getUsername());
            System.out.println("Message : "+messages[i].getContent());}
        }

       
    }


}
package TestClass2;
public class Post {
    
    private int postId;
    private int accountId;
    private Like[] likes;
    private Comment[] comments;
    private String content;
    
    public Post()
    {

    }
    public Post(int postId, int accountId,  String content) {
        this.postId = postId;
        this.accountId = accountId;
   
        this.content = content;

        comments=new Comment[100];
        likes=new Like[100];
    }
    
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public Like[] getLikes() {
        return likes;
    }
    public void setLikes(Like[] likes) {
        this.likes = likes;
    }
    public Comment[] getComments() {
        return comments;
    }
    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
  
   /*  
    public void addLike()
    {
        following[this.numberOfElements(following)]=user;
        likes(this.numberOfLikes(likes))=;
       
    }
    public int numberOfLikes(Like[] likes)
    {
        int i;
        for( i=0;i<likes.length;i++)
        {
            if(likes[i]==null)
            {
                return i;
            }
        }
        return 0;

    }*/

}

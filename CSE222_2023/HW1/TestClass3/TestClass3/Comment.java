package TestClass3;
public class Comment extends Interaction{
    
    private String content;
    public Comment(){}
    public Comment(Post post,String content,Account user) {
        
        super(post.getPostId(),user.getAccountId(),post.getPostId());
        this.content = content;
        
        
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}


package TestClass2;
public class Interaction {
    private int interactionId;
    private int accountId;
    private int postId;
    
    public Interaction(int interactionId, int accountId, int postId) {
        this.interactionId = interactionId;
        this.accountId = accountId;
        this.postId = postId;
    }
   
    public int getInteractionId() {
        return interactionId;
    }
    public void setInteractionId(int interactionId) {
        this.interactionId = interactionId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
   
    
}

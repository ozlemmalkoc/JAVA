package TestClass3;
public class Message {
   
    private int messageId;
    private Account senderId;
    private Account receiverId;
   
    public Message()
    {
        
    }
    public Message(int messageId, Account senderId, Account receiverId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
       
        if(senderId.isBlockedPerson(receiverId)==false)
       { System.out.println("Sending a message to " + receiverId.getUsername()); 
        addMessagetoInbox();
        addMessagetoOutbox();
      
       }
      

    }
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
 
    public Account getSenderId() {
        return senderId;
    }
    public void setSenderId(Account senderId) {
        this.senderId = senderId;
    }
    public Account getReceiverId() {
        return receiverId;
    }
    public void setReceiverId(Account receiverId) {
        this.receiverId = receiverId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    private String content;

    public void addMessagetoInbox()
    {
        senderId.getMessages()[numberOfMessages(senderId.getMessages())]=this;

       
    }
    public void addMessagetoOutbox()
    {
        receiverId.getMessages()[numberOfMessages(receiverId.getMessages())]=this;
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

    
}

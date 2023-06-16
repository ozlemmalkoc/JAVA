package class_packages;

public class Message {

  private int messageId;
  private Account senderId;
  private Account receiverId;

  public Message() {

  }
  public Message(int messageId, Account senderId, Account receiverId, String content) {
    this.messageId = messageId;
    this.senderId = senderId;
    this.receiverId = receiverId;
    this.content = content;
    if (senderId.isLogin() == true) {
      if (senderId.isBlockedPerson(receiverId) == false && receiverId.getBlockedPeople().contains(senderId)==false) {
        System.out.println("Sending a message to " + receiverId.getUsername());
        addMessagetoInbox();
        addMessagetoOutbox();

      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");
    } else
      System.out.println("Please logging into your account to send to message!");

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

  public void addMessagetoInbox() {

    senderId.getMessages().add(this);
  }
  public void addMessagetoOutbox() {
    receiverId.getMessages().add(this);
  }

}
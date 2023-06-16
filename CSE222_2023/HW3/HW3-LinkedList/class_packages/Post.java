package class_packages;

import java.util.LinkedList;


public class Post {

  private int postId;
  private int accountId;
  private LinkedList < Like > likes;
  private LinkedList < Comment > comments;
  private String content;

  public Post() {

  }
  public Post(int postId, int accountId, String content) {
    this.postId = postId;
    this.accountId = accountId;

    this.content = content;

    comments = new LinkedList < Comment > ();
    likes = new LinkedList < Like > ();
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
  public LinkedList < Like > getLikes() {
    return likes;
  }
  public void setLikes(LinkedList < Like > likes) {
    this.likes = likes;
  }
  public LinkedList < Comment > getComments() {
    return comments;
  }
  public void setComments(LinkedList < Comment > comments) {
    this.comments = comments;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  public void addComment(Comment comment) {

    this.getComments().add(comment);
  }
  public void removeComment(Comment comment) {
    if (this.getComments().contains(comment))
      this.getComments().remove(comment);
  }

  public void addLike(Like like) {

    if (!(this.getLikes().contains(like)))
      this.getLikes().add(like);
  }

  public void removeLike(Like like) {

    if ((this.getLikes().contains(like)))
      this.getLikes().remove(like);
  }

}
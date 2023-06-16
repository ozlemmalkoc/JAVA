package class_packages;

public class Like extends Interaction {

  public Like() {}
  public Like(Post post, Account user) {
    super(post.getPostId(), user.getAccountId(), post.getPostId());
  }

}
package class_packages;

import java.util.ArrayList;

public class Account {
  private int accountId;
  private String username;
  private String birthdate;
  private String location;
  private ArrayList < Post > posts;
  private ArrayList < Message > messages;
  private ArrayList < Account > following;
  private ArrayList < Account > followers;
  private boolean isLogin;
  private ArrayList < Account > blockedPeople;
  private ArrayList < Account > peopleWhoBlocked;
  private ArrayList < String > history;

  public boolean isLogin() {
    return isLogin;
  }
  public void setLogin(boolean isLogin) {
    this.isLogin = isLogin;
  }
  public ArrayList < String > getHistory() {
    return history;
  }
  public void setHistory(ArrayList < String > history) {
    this.history = history;
  }
  public Account() {}
  public Account(int accountId, String username, String birthdate, String location) {
    this.accountId = accountId;
    this.username = username;
    this.birthdate = birthdate;
    this.location = location;
    this.isLogin = false;

    this.posts = new ArrayList < Post > ();
    this.messages = new ArrayList < Message > ();

    followers = new ArrayList < Account > ();
    following = new ArrayList < Account > ();
    blockedPeople = new ArrayList < Account > ();
    peopleWhoBlocked = new ArrayList < Account > ();
    history = new ArrayList < String > ();
    System.out.println("An account with username " + this.username + " has been created.");
  }
  public ArrayList < Account > getBlockedPeople() {
    return blockedPeople;
  }
  public void setBlockedPeople(ArrayList < Account > blockedPeople) {
    this.blockedPeople = blockedPeople;
  }
  public ArrayList < Account > getPeopleWhoBlocked() {
    return peopleWhoBlocked;
  }
  public void setPeopleWhoBlocked(ArrayList < Account > peopleWhoBlocked) {
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
  public ArrayList < Post > getPosts() {
    return posts;
  }
  public void setPosts(ArrayList < Post > posts) {
    this.posts = posts;
  }
  public ArrayList < Message > getMessages() {
    return messages;
  }
  public void setMessages(ArrayList < Message > messages) {
    this.messages = messages;
  }
  public ArrayList < Account > getFollowing() {
    return following;
  }
  public void setFollowing(ArrayList < Account > following) {
    this.following = following;
  }
  public ArrayList < Account > getFollowers() {
    return followers;
  }
  public void setFollowers(ArrayList < Account > followers) {
    this.followers = followers;
  }

  public void login(String username) {
    this.isLogin = true;

    if (this.username == username) {
      System.out.println("Logging into an account (username: " + username + " )");
      history.add("You logged in...");
    }
  }

  public void addPost(Post post) {
    if (isLogin == true) {
      System.out.println("Sharing post...");

      posts.add(post);
      history.add("You shared post");
    } else {
      System.out.println("Please logging into your account to share post!");
    }
  }

  public void follow(Account user) {
    if (isLogin == true) {
      if (isBlockedPerson(user) == false && user.getBlockedPeople().contains(this)==false) {
        following.add(user);
        user.followers.add(this);
        System.out.println("Following " + user.getUsername());
        history.add("You followed " + user.getUsername());
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");
    } else {
      System.out.println("Please logging into your account to follow someone!");
    }

  }
  public void unfollow(Account user) {
    if (isLogin == true)

    {
      if (isBlockedPerson(user) == false && user.getBlockedPeople().contains(this)==false) {
        following.remove(user);
        user.followers.remove(this);
        System.out.println("Unfollowing " + user.getUsername());
        history.add("You unfollowed " + user.getUsername());
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else {
      System.out.println("Please logging into your account to unfollow someone!");
    }

  }

  public boolean isBlockedPerson(Account person) {

    if (blockedPeople.contains(person))
      return true;

    return false;
  }

  public void logout(String username) {
    if(isLogin==true)
    {
      this.isLogin = false;

      if (this.username == username) {
        System.out.println("Logging out from account  ( " + username + " )");
        history.add("You logged out");
      }
    }
    else
    System.out.println("You are not already logged in");
  }

  public void viewProfile(Account user) {
    if (isLogin == true) {
      if (isBlockedPerson(user) == false && user.getBlockedPeople().contains(this)==false) {
        history.add("You viewed " + user.getUsername() + "'s profile");
        System.out.println("Viewing " + user.getUsername() + "'s profile...");
        System.out.println("UserId :  " + user.getAccountId());
        System.out.println("Username :  " + user.getUsername());
        System.out.println("Location :  " + user.getLocation());
        System.out.println("Birth Day :  " + user.getBirthdate());
        System.out.println(user.getUsername() + " is following " + user.following.size() + " account(s) and has " + user.followers.size() + "  follower(s)");
        System.out.print(user.getUsername() + " is following: :  ");

        for (int i = 0; i < user.following.size(); i++) {
          System.out.print(user.getFollowing().get(i).getUsername() + " , ");
        }

        System.out.println();
        System.out.print("The followers of " + user.getUsername() + " are: ");

        for (int i = 0; i < user.followers.size(); i++) {
          System.out.print(user.getFollowers().get(i).getUsername() + " , ");
        }

        System.out.println();
        System.out.println(user.getUsername() + " has  " + user.getPosts().size() + "  posts");

      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to view profile someone!");

  }

  public void viewPosts(Account user) {
    if (isLogin == true) {
      if (isBlockedPerson(user) == false && user.getBlockedPeople().contains(this)==false) {
        history.add("You viewed " + user.getUsername() + "'s posts");
        System.out.println("Viewing " + user.getUsername() + "'posts... ");
        if (user.getPosts().size() == 0)
          System.out.println("There is not  " + user.getUsername() + "'posts... ");
        else {
          for (int i = 0; i < user.getPosts().size(); i++) {
            System.out.println("POST ID : " + user.getPosts().get(i).getPostId() + " " + user.getUsername() + " : " + user.getPosts().get(i).getContent());

          }
        }

      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to view posts someone!");

  }

  public void addLikeToPost(Account person, Like like) {
    if (isLogin == true) {
      if (isBlockedPerson(person) == false && person.getBlockedPeople().contains(this)==false) {
        for (int i = 0; i < person.getPosts().size(); i++) {
          if (person.getPosts().get(i) != null && person.getPosts().get(i).getPostId() == like.getPostId()) {
            person.getPosts().get(i).addLike(like);
            history.add("You liked " + person.getUsername() + " post id:" + person.getPosts().get(i).getPostId());

          }
        }
        System.out.println("Liking a post of " + person.getUsername() + "...");
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to add like to post of someone!");

  }
  public void removeLikeFromPost(Account person, Like like) {
    if (isLogin == true) {
      if (isBlockedPerson(person) == false && person.getBlockedPeople().contains(this)==false) {
        System.out.println("The like is removed  of a post of " + person.getUsername() + "...");
        for (int i = 0; i < person.getPosts().size(); i++) {
          if (person.getPosts().get(i) != null && person.getPosts().get(i).getPostId() == like.getPostId()) {
            person.getPosts().get(i).removeLike(like);
            history.add("You  removed  of a post of  " + person.getUsername() + " post id:" + person.getPosts().get(i).getPostId());
          }
        }
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to remove like from post !");

  }

  public void addCommentToPost(Account person, Comment comment) {
    if (isLogin == true) {
      if (isBlockedPerson(person) == false && person.getBlockedPeople().contains(this)==false) {
        System.out.println("Adding a comment on a post of " + person.getUsername() + "...");
        for (int i = 0; i < person.getPosts().size(); i++) {
          if (person.getPosts().get(i) != null && person.getPosts().get(i).getPostId() == comment.getPostId()) {
            person.getPosts().get(i).addComment(comment);
            history.add("You commented  " + person.getUsername() + " post id:" + person.getPosts().get(i).getPostId());

          }
        }
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to add comment to post !");

  }

  public void removeCommentFromPost(Account person, Comment comment) {
    if (isLogin == true) {
      if (isBlockedPerson(person) == false && person.getBlockedPeople().contains(this)==false) {
        System.out.println("The comment is removed  of a post of " + person.getUsername() + "...");
        for (int i = 0; i < person.getPosts().size(); i++) {
          if (person.getPosts().get(i) != null && person.getPosts().get(i).getPostId() == comment.getPostId()) {
            person.getPosts().get(i).removeComment(comment);
            history.add("You  removed  of a comment of  " + person.getUsername() + " post id:" + person.getPosts().get(i).getPostId());

          }
        }
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else
      System.out.println("Please logging into your account to remove comment from post!");

  }

  public int checkNumberOfMessageInbox() {
    if (isLogin == true) {
      int j = 0;
      for (int i = 0; i < this.getMessages().size(); i++) {
        if (this.messages.get(i).getReceiverId().getAccountId() == this.accountId) {
          j++;
        }
      }
      System.out.println("Checking inbox...");

      System.out.println("There is/are " + j + " message(s) in the inbox.");
      return j;
    } else {
      System.out.println("Please logging into your account to check number of message inbox!");
      return 0;
    }
  }

  public int checkNumberOfMessageOutbox() {
    if (isLogin == true) {
      int j = 0;
      for (int i = 0; i < this.getMessages().size(); i++) {
        if (this.messages.get(i).getSenderId().getAccountId() == this.accountId) {
          j++;
        }

      }
      System.out.println("Checking outbox...");
      System.out.println("There is/are " + j + " message(s) in the outbox.");
      return j;
    } else {
      System.out.println("Please logging into your account to check number of message outbox!");
      return 0;
    }
  }

  public void viewInbox() {
    if (isLogin == true) {
      history.add("You viewed inbox ");
      for (int i = 0; i < this.getMessages().size(); i++) {
        System.out.println("Viewing inbox...");
        System.out.println("Message ID : " + messages.get(i).getMessageId());
        System.out.println("From : " + messages.get(i).getSenderId().getUsername());
        System.out.println("To : " + messages.get(i).getReceiverId().getUsername());
        System.out.println("Message : " + messages.get(i).getContent());
      }
    } else {
      System.out.println("Please logging into your account to view inbox!");
    }
  }

  public void viewPostsInteractions(Account user, ArrayList < Account > accounts) {
    if (isLogin == true) {
      if (isBlockedPerson(user) == false && user.getBlockedPeople().contains(this)==false) {
        history.add("You viewed " + user.getUsername() + "'s posts interactions");
        System.out.println("Viewing " + user.getUsername() + "'posts interactions... ");

        if (user.getPosts().size() != 0) {
          for (int i = 0; i < user.getPosts().size(); i++) {
            System.out.println("POST ID : " + user.getPosts().get(i).getPostId() + " : " + user.getPosts().get(i).getContent());

            System.out.println("The posts has " + user.posts.get(i).getLikes().size() + " likes");
            System.out.print("The post was liked by the following account(s):");
            for (int j = 0; j < accounts.size(); j++) {
              for (int k = 0; k < user.posts.get(i).getLikes().size(); k++) {
                if (accounts.get(j).getAccountId() == user.posts.get(i).getLikes().get(k).getAccountId()) {
                  System.out.print(accounts.get(j).getUsername() + " , ");
                }
              }

            }

            System.out.println("\nThe posts has " + user.posts.get(i).getComments().size() + " comments");

            for (int j = 0; j < accounts.size(); j++) {
              for (int k = 0; k < user.posts.get(i).getComments().size(); k++) {
                if (accounts.get(j).getAccountId() == user.posts.get(i).getComments().get(k).getAccountId()) {
                  System.out.print("Comment " + (k + 1) + ":");
                  System.out.println("'" + accounts.get(j).getUsername() + "'" + "   said to " + "'" + user.posts.get(i).getComments().get(k).getContent() + "'");
                }
              }
            }
          }
        } else
          System.out.println("There is not  " + user.getUsername() + "'posts... ");
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");
    } else
      System.out.println("Please logging into your account to view post interactions!");
  }

  ////////

  public void blocks(Account person) {
    if (isLogin == true) {
      if (!blockedPeople.contains(person)) {
        history.add("You blocked to " + person.getUsername());
        System.out.println("You blocked to " + person.getUsername());
        person.getPeopleWhoBlocked().add(this);
        this.getBlockedPeople().add(person);

      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");

    } else {
      System.out.println("Please logging into your account to blocks someone!");
    }
  }

  public void unblocks(Account person) {
    if (isLogin == true && isBlockedPerson(person) == true) {
      if (blockedPeople.contains(person)) {
        person.getPeopleWhoBlocked().remove(this);
        this.getBlockedPeople().remove(person);
      }
      history.add("You unblocked to " + person.getUsername());
      System.out.println("You unblocked to " + person.getUsername());

    } else {
      System.out.println("Please logging into your account to unblocks someone!");
    }
  }
  public void viewInboxFromSpecificPerson(Account person) {
    if (isLogin == true) {
      if (isBlockedPerson(person) == false && person.getBlockedPeople().contains(this)==false ) {
        for (int i = 0; i < this.getMessages().size(); i++) {
          if (person.getUsername() == messages.get(i).getSenderId().getUsername()) {
            System.out.println("Message ID : " + messages.get(i).getMessageId());
            System.out.println("From : " + messages.get(i).getSenderId().getUsername());
            System.out.println("To : " + messages.get(i).getReceiverId().getUsername());
            System.out.println("Message : " + messages.get(i).getContent());
            history.add("You viewed inbox from " + person.getUsername());
          }
        }
      } else
        System.out.println("You cannot do this because this person is among the blockedperson or peopleWhoBlocked.");
    } else
      System.out.println("Please logging into your account to view inbox from specific person!");

  }
  public void viewHistory() {
    if (isLogin == true) {
      for (String str: history) {
        System.out.println(str);

      }
    } else
      System.out.println("Please logging into your account to view history!");
  }
}
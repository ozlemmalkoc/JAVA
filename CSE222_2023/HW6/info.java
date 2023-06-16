import java.util.ArrayList;

public class info {
  private int count;
  private ArrayList < String > words;

  public info() {
    words = new ArrayList < String > ();
  }

  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public ArrayList < String > getWords() {
    return words;
  }
  public void setWords(ArrayList < String > words) {
    this.words = words;
  }
  public String displayWords() {
    String str = "[";
    for (int i = 0; i < words.size(); i++) {
      if (i < words.size() - 1)
        str = str + words.get(i) + ',';
      else
        str = str + words.get(i);
    }
    return str + "]";
  }

}
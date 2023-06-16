import java.util.LinkedHashMap;

public class myMap {

  private LinkedHashMap < String, info > map;
  private int mapSize;
  private String str;
  private String[] strArray;

  public String[] getStrArray() {
    return strArray;
  }
  public void setStrArray(String[] strArray) {
    this.strArray = strArray;
  }
  public myMap() {}
  public myMap(myMap original) {

    this.map = new LinkedHashMap < > (original.getMapSize());

  }
  public myMap(String input) {

    if(input=="")
    {
        System.out.println("Not valid input");
        System.exit(0);
    }
    System.out.println("Original String: "+input);
    input = input.toLowerCase();

    input = removeDataWithoutSpaceAndCharacter(input);
    System.out.println("Preprocessed String: "+input);
    System.out.println();
    map = new LinkedHashMap < String, info > ();
    String ch;

    strArray = input.split(" ");

    for (int j = 0; j < strArray.length; j++) {
      input = strArray[j];

      for (int i = 0; i < input.length(); i++) {
        ch = String.valueOf(input.charAt(i));
        if (!map.containsKey(ch)) {
          info Info = new info();
          Info.setCount(1);
          Info.getWords().add(input);
          map.put(ch, Info);

        } else {
          map.get(ch).getWords().add(input);
          map.get(ch).setCount(map.get(ch).getCount() + 1);
        }

      }
    }

    str = null;
    mapSize = map.size();

  }
  public void displayMap() {
    map.forEach((key, value) -> {
      System.out.println("\"" + key + "\"" + " : count = " + value.getCount() + " , words = " + value.displayWords());
    });

  }
  public LinkedHashMap < String, info > getMap() {
    return map;
  }
  public void setMap(LinkedHashMap < String, info > map) {
    this.map = map;
  }
  public int getMapSize() {
    return mapSize;
  }
  public void setMapSize(int mapSize) {
    this.mapSize = mapSize;
  }
  public String getStr() {
    return str;
  }
  public void setStr(String str) {
    this.str = str;
  }

  public static String removeDataWithoutSpaceAndCharacter(String str) {
    String data = "";

    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i)) == true || str.charAt(i) == ' ')
        data = data + str.charAt(i);

    }
    str = data;
    return str;
  }

}
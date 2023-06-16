
public class Main {

  public static void main(String[] args) {
    System.out.println("SAMPLE 1 :");
    String input = "Buzzing bees buzz.";

    myMap myMap = new myMap(input);
    System.out.println("The original (unsorted) map:");
    myMap.displayMap();
    System.out.println();

    mergeSort s = new mergeSort(myMap);
    System.out.println("The sorted map:");

    s.sort();
    s.getSortedMap().displayMap();

    System.out.println("SAMPLE 2 :");
    String input2 = "'Hush, hush!' whispered the rushing wind.";

    myMap myMap2 = new myMap(input2);
    System.out.println("The original (unsorted) map:");
    myMap2.displayMap();
    System.out.println();

    mergeSort s2 = new mergeSort(myMap2);
    System.out.println("The sorted map:");

    s2.sort();
    s2.getSortedMap().displayMap();
    System.out.println("SAMPLE 3 :");
    String input3 = "";
    myMap myMap3 = new myMap((input3));
    myMap3.displayMap();

  }

}
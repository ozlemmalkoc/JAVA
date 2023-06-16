public class Main {

  public static void main(String[] args) {

    String inputBestCase = "abbcccddddeeeeeffffffgggggggllllllllmmmmmmmmmrrrrrrrrrr";
    String inputWorstCase = "rrrrrrrrrrmmmmmmmmmllllllllgggggggffffffeeeeeddddcccbba";
    String inputAverageCase = "cgmlrrblemdgfblfrmgcrdrmdrglfdmlreelegarmmrlgfegrmfmlcf";

 
    System.out.println("\n----------BUBBLE SORT----------\n");

    myMap myMap3 = new myMap(inputWorstCase);
    //System.out.println("The original (unsorted) map:");
    //myMap3.displayMap();
    System.out.println();

    bubbleSort b3 = new bubbleSort(myMap3);
    // System.out.println("The sorted map:");

    System.out.print("For Worst Case  -->");

    b3.measureSortTime();
    //b3.getSortedMap().displayMap(); 

    System.out.println("\n*******************************************\n");

    myMap myMap2 = new myMap(inputAverageCase);
    // System.out.println("The original (unsorted) map:");
    //myMap2.displayMap();
    System.out.println();

    bubbleSort b2 = new bubbleSort(myMap2);
    // System.out.println("The sorted map:");
    System.out.print("For Average Case  -->");
    b2.measureSortTime();

    //b2.getSortedMap().displayMap();

    System.out.println("\n*******************************************\n");

    myMap myMap = new myMap(inputBestCase);
    // System.out.println("The original (unsorted) map:");
    // myMap.displayMap();
    System.out.println();

    bubbleSort b = new bubbleSort(myMap);
    // System.out.println("The sorted map:");
    System.out.print("For Best Case  -->");
    b.measureSortTime();

    // b.getSortedMap().displayMap();

    System.out.println("\n----------------------------------------------------------------\n");

    System.out.println("\n----------SELECTION SORT----------\n");

    myMap myMap4 = new myMap(inputWorstCase);
    //System.out.println("The original (unsorted) map:");
    //myMap3.displayMap();
    System.out.println();

    selectionSort b4 = new selectionSort(myMap4);
    // System.out.println("The sorted map:");

    System.out.print("For Worst Case  -->");

    b4.measureSortTime();
    //b3.getSortedMap().displayMap(); 

    System.out.println("\n*******************************************\n");

    myMap myMap5 = new myMap(inputAverageCase);
    // System.out.println("The original (unsorted) map:");
    //myMap2.displayMap();
    System.out.println();

    selectionSort b5 = new selectionSort(myMap5);
    // System.out.println("The sorted map:");
    System.out.print("For Average Case  -->");
    b5.measureSortTime();

    //b2.getSortedMap().displayMap();

    System.out.println("\n*******************************************\n");

    myMap myMap6 = new myMap(inputBestCase);
    // System.out.println("The original (unsorted) map:");
    // myMap.displayMap();
    System.out.println();

    selectionSort b6 = new selectionSort(myMap6);
    // System.out.println("The sorted map:");
    System.out.print("For Best Case  -->");
    b6.measureSortTime();

    // b.getSortedMap().displayMap();

    System.out.println("\n----------------------------------------------------------------\n");

 

    System.out.println("\n----------INSERTION SORT----------\n");

    myMap myMap7 = new myMap(inputWorstCase);
    //System.out.println("The original (unsorted) map:");
    //myMap3.displayMap();
    System.out.println();

    insertionSort b7 = new insertionSort(myMap7);
    // System.out.println("The sorted map:");

    System.out.print("For Worst Case  -->");

    b7.measureSortTime();
    //b3.getSortedMap().displayMap(); 

    System.out.println("\n*******************************************\n");

    myMap myMap8 = new myMap(inputAverageCase);
    // System.out.println("The original (unsorted) map:");
    //myMap2.displayMap();
    System.out.println();

    insertionSort b8 = new insertionSort(myMap8);
    // System.out.println("The sorted map:");
    System.out.print("For Average Case  -->");
    b8.measureSortTime();

    //b2.getSortedMap().displayMap();

    System.out.println("\n*******************************************\n");

    myMap myMap9 = new myMap(inputBestCase);
    // System.out.println("The original (unsorted) map:");
    // myMap.displayMap();
    System.out.println();

    insertionSort b9 = new insertionSort(myMap9);
    // System.out.println("The sorted map:");
    System.out.print("For Best Case  -->");
    b9.measureSortTime();

    // b.getSortedMap().displayMap();

    System.out.println("\n----------------------------------------------------------------\n");

    

    System.out.println("\n----------QUICK SORT----------\n");

    myMap myMap10 = new myMap(inputWorstCase);
    //System.out.println("The original (unsorted) map:");
    //myMap3.displayMap();
    System.out.println();

    insertionSort b10 = new insertionSort(myMap10);
    // System.out.println("The sorted map:");

    System.out.print("For Worst Case  -->");

    b10.measureSortTime();
    //b3.getSortedMap().displayMap(); 

    System.out.println("\n*******************************************\n");

    myMap myMap11 = new myMap(inputAverageCase);
    // System.out.println("The original (unsorted) map:");
    //myMap2.displayMap();
    System.out.println();

    insertionSort b11 = new insertionSort(myMap11);
    // System.out.println("The sorted map:");
    System.out.print("For Average Case  -->");
    b11.measureSortTime();

    //b2.getSortedMap().displayMap();

    System.out.println("\n*******************************************\n");

    myMap myMap12 = new myMap(inputBestCase);
    // System.out.println("The original (unsorted) map:");
    // myMap.displayMap();
    System.out.println();

    insertionSort b12 = new insertionSort(myMap12);
    // System.out.println("The sorted map:");
    System.out.print("For Best Case  -->");
    b12.measureSortTime();

    // b.getSortedMap().displayMap();

    System.out.println("\n----------------------------------------------------------------\n");

    System.out.println("\n----------MERGE SORT----------\n");

    myMap myMap13 = new myMap(inputWorstCase);
    //System.out.println("The original (unsorted) map:");
    //myMap3.displayMap();
    System.out.println();

    insertionSort b13 = new insertionSort(myMap13);
    // System.out.println("The sorted map:");

    System.out.print("For Worst Case  -->");

    b13.measureSortTime();
    //b3.getSortedMap().displayMap(); 

    System.out.println("\n*******************************************\n");

    myMap myMap14 = new myMap(inputAverageCase);
    // System.out.println("The original (unsorted) map:");
    //myMap2.displayMap();
    System.out.println();

    insertionSort b14 = new insertionSort(myMap14);
    // System.out.println("The sorted map:");
    System.out.print("For Average Case  -->");
    b14.measureSortTime();

    //b2.getSortedMap().displayMap();

    System.out.println("\n*******************************************\n");

    myMap myMap15 = new myMap(inputBestCase);
    // System.out.println("The original (unsorted) map:");
    // myMap.displayMap();
    System.out.println();

    insertionSort b15 = new insertionSort(myMap15);
    // System.out.println("The sorted map:");
    System.out.print("For Best Case  -->");
    b15.measureSortTime();

    // b.getSortedMap().displayMap();

    System.out.println("\n----------------------------------------------------------------\n");

  }

}
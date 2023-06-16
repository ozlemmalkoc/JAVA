import java.util.List;
import java.util.ArrayList;

public class mergeSort {

    private myMap originalMap;
    private myMap sortedMap;
    private List<String> aux;
  
    public mergeSort(myMap originalMap) {
      this.originalMap = originalMap;
      sortedMap = new myMap(originalMap);
      this.aux = new ArrayList<String>(this.originalMap.getMap().keySet());
  
    }
  
    public myMap getOriginalMap() {
      return originalMap;
    }
  
    public void setOriginalMap(myMap originalMap) {
      this.originalMap = originalMap;
    }
  
    public myMap getSortedMap() {
      return sortedMap;
    }
  
    public void setSortedMap(myMap sortedMap) {
      this.sortedMap = sortedMap;
    }
  
    public List<String> getAux() {
      return aux;
    }
  
    public void setAux(List<String> aux) {
      this.aux = aux;
    }
    public void sort() {
      String ch;
      mergeSortFunc(0, aux.size() - 1);
      for (int i = 0; i < aux.size(); i++) {
        ch = String.valueOf(aux.get(i));
        if (!sortedMap.getMap().containsKey(ch)) {
          sortedMap.getMap().put(ch, originalMap.getMap().get(ch));
  
        }
  
      }
  
    }
  
    public void mergeSortFunc(int first, int last) {
      if (first < last) {
        int midIndex = (first + last) / 2;
  
        mergeSortFunc(first, midIndex);
        mergeSortFunc(midIndex + 1, last);
  
        merge(first, midIndex, last);
  
      }
  
    }
    public void merge(int first, int midIndex, int last) {
      String[] leftHalf = new String[midIndex - first + 1];
      String[] rightHalf = new String[last - midIndex];
  
      for (int i = 0; i < midIndex - first + 1; i++) {
        leftHalf[i] = aux.get(first + i);
      }
      for (int i = 0; i < last - midIndex; i++) {
        rightHalf[i] = aux.get(midIndex + 1 + i);
      }
  
      int i = 0, j = 0, k = first;
  
      while (i < midIndex - first + 1 && j < last - midIndex) {
        if (originalMap.getMap().get(leftHalf[i]).getCount() <= originalMap.getMap().get(rightHalf[j]).getCount()) {
          aux.set(k,leftHalf[i]);
          i++;
        } else {
          aux.set(k,rightHalf[j]); 
          j++;
        }
        k++;
      }
      while (i < midIndex - first + 1) {
        aux.set(k,leftHalf[i]);
        i++;
        k++;
      }
  
      while (j < last - midIndex) {
        aux.set(k,rightHalf[j]);
        j++;
        k++;
      }
    }

    public  long measureSortTime() {
      long startTime = System.nanoTime(); 
      
      sort(); 
      
      long endTime = System.nanoTime(); 
      System.out.println(endTime - startTime);
      return endTime - startTime; 
  }
  
  }
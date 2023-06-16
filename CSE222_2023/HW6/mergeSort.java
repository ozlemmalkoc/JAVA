public class mergeSort {

    private myMap originalMap;
    private myMap sortedMap;
    private String[] aux;
  
    public mergeSort(myMap originalMap) {
      this.originalMap = originalMap;
      sortedMap = new myMap(originalMap);
      aux = new String[originalMap.getMapSize()];
      int index = 0;
      for (String key: originalMap.getMap().keySet()) {
        aux[index] = key;
        index++;
      }
  
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
  
    public String[] getAux() {
      return aux;
    }
  
    public void setAux(String[] aux) {
      this.aux = aux;
    }
    public void sort() {
      String ch;
      mergeSortFunc(0, aux.length - 1);
      for (int i = 0; i < aux.length; i++) {
        ch = String.valueOf(aux[i]);
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
        leftHalf[i] = aux[first + i];
      }
      for (int i = 0; i < last - midIndex; i++) {
        rightHalf[i] = aux[midIndex + 1 + i];
      }
  
      int i = 0, j = 0, k = first;
  
      while (i < midIndex - first + 1 && j < last - midIndex) {
        if (originalMap.getMap().get(leftHalf[i]).getCount() <= originalMap.getMap().get(rightHalf[j]).getCount()) {
          aux[k] = leftHalf[i];
          i++;
        } else {
          aux[k] = rightHalf[j];
          j++;
        }
        k++;
      }
      while (i < midIndex - first + 1) {
        aux[k] = leftHalf[i];
        i++;
        k++;
      }
  
      while (j < last - midIndex) {
        aux[k] = rightHalf[j];
        j++;
        k++;
      }
    }
  
  }
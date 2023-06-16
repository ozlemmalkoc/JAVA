import java.util.List;
import java.util.ArrayList;

public class quickSort {

    private myMap originalMap;
    private myMap sortedMap;
    private List<String> aux;
  
    public quickSort(myMap originalMap) {
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
      quickSortFunc(0, aux.size() - 1);
      for (int i = 0; i < aux.size(); i++) {
        ch = String.valueOf(aux.get(i));
        if (!sortedMap.getMap().containsKey(ch)) {
          sortedMap.getMap().put(ch, originalMap.getMap().get(ch));
  
        }
  
      }
  
    }
  
    public int partition(int first,int last)
    { String temp;
      int pivot=originalMap.getMap().get(aux.get(last)).getCount();
      int i=first-1;

      for(int j=first;j<last;j++)
      {
        if(originalMap.getMap().get(aux.get(j)).getCount()<pivot)
        {
          i++;
          temp = aux.get(i);
          aux.set(i, aux.get(j));
          aux.set(j, temp);

        }
      }
      temp = aux.get(i+1);
      aux.set(i+1, aux.get(last));
      aux.set(last, temp);

      return i+1;


    }

    public void quickSortFunc(int first,int last)
    {
      if(first<last)
      {
      int pi=partition(first, last);
      quickSortFunc(first, pi-1);
      quickSortFunc(pi+1, last);
      }
    }

    public  void  measureSortTime() {
      
      long startTime= System.nanoTime(); 
      
      
      System.out.print("  Time : ");
        sort();
     
      long endTime = System.nanoTime(); 
      System.out.println(endTime - startTime);
      
  }
    
}

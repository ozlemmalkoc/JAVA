import java.util.List;
import java.util.ArrayList;
public class bubbleSort {

    private myMap originalMap;
    private myMap sortedMap;
    private List<String> aux;
  
    public bubbleSort(myMap originalMap) {
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

    public void sort()
    { String ch;
      bubbleSortFunc();
      for (int i = 0; i < aux.size(); i++) {
        ch = String.valueOf(aux.get(i));
        if (!sortedMap.getMap().containsKey(ch)) {
          sortedMap.getMap().put(ch, originalMap.getMap().get(ch));
  
        }
  
      }
    }
    public void bubbleSortFunc()
    {
      String temp;

      for(int i=0;i<aux.size()-1;i++)
      {
        for(int j=0 ;j<aux.size()-1-i;j++)
        {
          if(originalMap.getMap().get(aux.get(j)).getCount()>originalMap.getMap().get(aux.get(j+1)).getCount())
          {
            temp = aux.get(j);
            aux.set(j, aux.get(j+1));
            aux.set(j+1, temp);
          }
        }
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

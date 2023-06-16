import java.util.List;
import java.util.ArrayList;

public class insertionSort {
    

    
    private myMap originalMap;
    private myMap sortedMap;
    private List<String> aux;
  
    public insertionSort(myMap originalMap) {
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
      insertionSortFunc();
      for (int i = 0; i < aux.size(); i++) {
        ch = String.valueOf(aux.get(i));
        if (!sortedMap.getMap().containsKey(ch)) {
          sortedMap.getMap().put(ch, originalMap.getMap().get(ch));
  
        }
  
      }
    }
    public void insertionSortFunc()
    { 
      for(int i=1;i<aux.size();i++)
      {
        int key= originalMap.getMap().get(aux.get(i)).getCount();
        String str=aux.get(i);
        
        int j=i-1;
        while(j>=0 && originalMap.getMap().get(aux.get(j)).getCount()>key )
        {
          aux.set(j+1, aux.get(j));
          j=j-1;
        }
        aux.set(j+1, str);

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



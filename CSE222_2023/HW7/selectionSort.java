import java.util.List;
import java.util.ArrayList;
public class selectionSort {
    
    private myMap originalMap;
    private myMap sortedMap;
    private List<String> aux;
  
    public selectionSort(myMap originalMap) {
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
      selectionSortFunc();
      for (int i = 0; i < aux.size(); i++) {
        ch = String.valueOf(aux.get(i));
        if (!sortedMap.getMap().containsKey(ch)) {
          sortedMap.getMap().put(ch, originalMap.getMap().get(ch));
  
        }
  
      }
    }

    public void selectionSortFunc()
    { String temp;
      for(int i=0;i<aux.size();i++)
      { int minValue=originalMap.getMap().get(aux.get(i)).getCount(),minValueIndex=i;
        for(int j=i+1;j<aux.size();j++)
        {
          if(originalMap.getMap().get(aux.get(j)).getCount()<minValue)
          {
            minValue=originalMap.getMap().get(aux.get(j)).getCount();
            minValueIndex=j;

          }
        }
        

            temp = aux.get(i);
            aux.set(i, aux.get(minValueIndex));
            aux.set(minValueIndex, temp);

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

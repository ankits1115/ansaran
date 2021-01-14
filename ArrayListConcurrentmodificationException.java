import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcurrentmodificationException {
  public static void main(String[] args) {
    // List with initial capacity as 2
    List<String> cityList = new ArrayList<>(2);
    cityList.add("London");
    cityList.add("Paris");
    cityList.add("Bangalore");
    cityList.add("Istanbul");
    Iterator<String> itr = cityList.iterator();
    while(itr.hasNext()){
      String city = itr.next();
      if(city.equals("Paris")){
        // removing using remove method 
        // of the ArrayList class
        cityList.remove(city);
      }
    }
  }
}

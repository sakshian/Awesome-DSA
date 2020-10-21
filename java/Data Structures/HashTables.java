
import java.util.*;
public class HashTable {

   public static void main(String args[]) {
     
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("XYZ", new Double(123.67));
      balance.put("B", new Double(2020.20));
      balance.put("WIE", new Double(-100.00));
      balance.put("VIT", new Double(-99.09));
      balance.put("Foodies", new Double(-201.01));

      names = balance.keys();
      
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " + balance.get(str));
      }        
      System.out.println();
      
      bal = ((Double)balance.get("XYZ")).doubleValue();
      balance.put("XYZ", new Double(bal + 2020));
      System.out.println("XYZ's new balance: " + balance.get("XYZ"));
   }
}

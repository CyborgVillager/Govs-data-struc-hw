import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ejcf {
	/* START Exercise Question # 2
	 * Writing alt method for lists  / make sure to return new list with an alt method for syms
	 * contain x,y,z # as long it does not show the same # twice 
	 * Question Located pg 750 Question #2
	 * 
	 */
	 public static void main(String[] args) {
	        Set<Integer> setof1 = Set.of(1, 4, 7, 9);
	        Set<Integer> setof2 = Set.of(2, 4, 5, 6, 7);

	        System.out.print("Symmetric Set difference is ");
	        for (Integer a: symmetricSetDifference(setof1, setof2))
	            System.out.print(a+", ");
	        System.out.println("\n");
/*END Exercise Question # 2 */
	        /* START Exercise Question # 11s
	         * SymmetricSet difference - ensures it accepts 2 sets as para's  / returns a new Set
	         * show differences 
	         */
/* Basic map overview	        
 * http://tutorials.jenkov.com/java-collections/map.html
 * Re-check further on collections @ weekend
 */
	        Map<String, String> map = Map.of(
	                "Marty", "Stepp",
	                "Stuart", "Reges",
	                "Jessica", "Miller",
	                "Amanda", "Camp",
	                "Hal", "Perkins"
	        );

	        for (String key: map.keySet())
	            System.out.println("Key: "+key+", Value: "+map.get(key));
	        System.out.println("Is unique? "+isUnique(map)+"\n");

	        map = Map.of(
	                "Kendrick", "Perkins",
	                "Stuart", "Reges",
	                "Jessica", "Miller",
	                "Bruce", "Reges",
	                "Hal", "Perkins"
	        );

	        for (String key: map.keySet())
	            System.out.println("Key: "+key+", Value: "+map.get(key));
	        System.out.println("Is unique? "+isUnique(map));
	    }
/* Java hashset tutorial https://www.javatpoint.com/java-hashset , reference info/ review
 * Re-look into Integer as stated @ class
 * break info;
 * symmetric addon for Hashset
 * check in with previous Exercise Questions
 *  */
	    public static Set<Integer> symmetricSetDifference(Set<Integer> sets1, Set<Integer> sets2) {
	        Set<Integer> symmetric = new HashSet<>();
	        Set<Integer> jaB = new HashSet<>();
	        Set<Integer> Jab = new HashSet<>();
	        /* jaB = x 4 now
	         * Jab = y 4 now
	         */
/* Info Integer https://stackoverflow.com/questions/12756360/how-to-make-java-set
 * example:
 * import java.util.*;
Set<Integer> a = new HashSet<Integer>();
a.add( 1);
a.add( 2);
a.add( 3); check further on stackoverflow
 */
	        for (Integer a : sets1) {
	            int value1 = a;
	            boolean found = false;
	            for (Integer b : sets2) {
	                int value2 = b;
	                if (value1 == value2) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found)
	            	jaB.add(value1);
	        }
	        
	       /* Check further If info/bool
	        *  https://codingbat.com/doc/java-if-boolean-logic.html
	        * 
	        */
	        for (Integer a : sets2) {
	            int value1 = a;
	            boolean found = false;
	            for (Integer b : sets1) {
	                int value2 = b;
	                if (value1 == value2) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found)
	            	Jab.add(value1);
	        }
	        symmetric.addAll(jaB);
	        symmetric.addAll(Jab);

	        return symmetric;
	    }
/* START   Question Exercise #13 
 * is Unique ensures it accepts a map = string as a para and returns True if not Returns False
 * CHeck pg 751 in regarding username include = for last name
 * Re-look into keys/value pairs as stated @ class
 * https://www.baeldung.com/java-pairs
 * https://stackoverflow.com/questions/521171/a-java-collection-of-value-pairs-tuples
 * Check in with provided link at blackboard for more info over weekend
 * 
 */
	    public static boolean isUnique(Map<String, String> map) {
	        boolean found = true;
	        for (String keys1 : map.keySet()) {
	            int count = 0;
	            for (String keys2 : map.keySet()) {
	                if (map.get(keys1).equals(map.get(keys2))) {
	                    count++;
	                    if (count == 2) {
	                        found = false;
	                        break;
	                    }
	                }
	            }
	        }
	        return found;
	    }
	}
/* END Question Exercise #13 
 * Review blackboard info 4 further java-tutorial
 * 
 * CHECK ON 9/10/21 AFTER WRK MAKE SURE BLACKBOARD ACCEPTED IT-EMAIL PROF RESPO IN-CASE
 * */

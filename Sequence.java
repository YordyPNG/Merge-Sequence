import java.util.ArrayList;
/**
 * Write a description of class Sequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sequence
{
    /* declares variable "values" which is an ArrayList that
     * stores integers and the list can only be accessed inside
     * the class
     */
    private ArrayList<Integer> values;
    
    /* a constructer which runs when a Sequence object is created
     * and makes values an empty list
     */
    public Sequence() {
        values = new ArrayList<Integer>();
    }
    
    //adds a number "n" to the Sequence
    public void add(int n) {
        values.add(n);
    }
    
    //returns the sequence in a string
    public String toString() {
        return values.toString();
    }
    
    // merge method
    /* 1.Creates a new empty Sequence called result to store
     * the merged values
     * 2. Uses two counters to track the positions for both of
     * sequences
     * 3. Loop until numbers from both sequences have been
     * added
     * 4. alternating numbers from this ("Sequence" calling the
     * method) and other (the other sequence) 
     * Example: a.merge(b)
     * a will be "this" and b will be "other"
     * 5. Returns the merged sequence
     */
    public Sequence merge(Sequence other) {
        Sequence result = new Sequence();
        int i = 0, j = 0;
        while (i < this.values.size() || j < other.values.size()){
            if (i < this.values.size()) {
                result.add(this.values.get(i));
                i++;
            }
            
            if (j < other.values.size()){
                result.add(other.values.get(j));
                j++;
            }
        }
        return result;
    }
}

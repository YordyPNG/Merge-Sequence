
/**
 * Write a description of class SequenceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SequenceTest
    // main
{   public static void main(String[] args) {
    
        //Creating Sequence A
        Sequence a = new Sequence();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        
        //Creating Sequence B
        Sequence b = new Sequence();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        
        // running the merge method
        Sequence merged = a.merge(b);
        
        //printing
        System.out.println("Sequence of A: >:|" + a);
        System.out.println("Sequence of B: >:)" + b);
        System.out.println("Merged Sequence (A & B) >:D: " + merged);
    }  
}

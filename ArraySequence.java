import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex ;
  private int[] data ;

  public ArraySequence(int [] other){
    currentIndex = 0 ;
    data = other ;
  }

  public ArraySequence(IntegerSequence otherseq){
    currentIndex = 0 ;
    int[] array = new int[otherseq.length()] ;
    int i = 0 ;
    while (otherseq.hasNext()) {
      array[i] = otherseq.next() ;
      i++ ;
    }
    data = array ;
  }

  public void reset() {
    currentIndex = 0 ;
  }

  public int length() {
    return data.length ;
  }

  public boolean hasNext() {
    return (currentIndex < length()) ;
  }

  public int next() {
    if (!hasNext()) {
      throw new NoSuchElementException ("No more values left in ArraySequence.") ;
    }
    int result = data[currentIndex] ;
    currentIndex++ ;
    return result ;
  }

}

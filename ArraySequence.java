import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex ;
  private int[] data ;

  public ArraySequence(int [] other){
    currentIndex = 0 ;
    data = other ;
  }

  public void reset() {
    currentindex = 0 ;
  }

  public int length() {
    return data.length ;
  }

}

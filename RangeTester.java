public class RangeTester {
  public static void main(String[] args) {
    Range s = new Range(5,10) ;
    System.out.println(s.next()) ;
    while (s.hasNext()) {
      System.out.println(s.next()) ;
    }
    try {
      s.next() ;
    }
    catch (RuntimeException e) {
      System.out.println("No more values") ;
    }
    IntegerSequence r = new Range(10,20);
    while(r.hasNext()) {
      System.out.print(r.next()) ;
      if(r.hasNext())
         System.out.print(", ") ;
   }
    System.out.println( );
    int[] a = {1,2,3,4,5,6} ;
    ArraySequence b = new ArraySequence(a) ;
    while (b.hasNext()) {
      System.out.println(b.next()) ;
    }
  }

}

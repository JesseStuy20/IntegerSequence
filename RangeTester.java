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
    int[] a = {1,3,4,1,0,81} ;
    ArraySequence b = new ArraySequence(a) ;
    while (b.hasNext()) {
      System.out.println(b.next()) ;
    }
    try {
      b.next() ;
    }
    catch (RuntimeException e) {
      System.out.println("No more values") ;
    }
    s.reset() ;
    ArraySequence c = new ArraySequence(s) ;
    while (c.hasNext()) {
      System.out.println(c.next()) ;
    }
    IntegerSequence d = new Range(10,20);
    IntegerSequence as = new ArraySequence(d) ;
    System.out.println("ArraySequence(seq):") ;
    while(as.hasNext()) {
      System.out.print(as.next() + ", ") ;
    }
    System.out.println() ;
  }

}

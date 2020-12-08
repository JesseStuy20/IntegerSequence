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
  }
}

public class RangeTester {
  public static void main(String[] args) {
    Range s = new Range(5,10) ;
    System.out.println(s.next()) ;
    while (s.hasNext()) {
      System.out.println(s.next()) ;
    }

  }
}

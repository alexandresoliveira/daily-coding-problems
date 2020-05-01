package dev.aleoliv.challenge;

public class Count {
  public Integer in( int number ) {
    return Integer.toString( number ).length();
  }

  public Integer in( String number ) {
    return in(Integer.parseInt( number ));
  }
}

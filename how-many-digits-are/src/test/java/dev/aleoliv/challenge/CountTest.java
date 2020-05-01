package dev.aleoliv.challenge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountTest {

  @Test
  public void numberOfDigitsTest() {
    Count count = new Count();
    Integer digits = count.in(10);
    assertThat( digits, is( 2 ) );
  }

  @Test
  public void numberOfDigitsStringNumberTest() {
    Count count = new Count();
    Integer digits = count.in( "1000" );
    assertThat( digits, is( digits ) );
  }

  @Test(expected = NumberFormatException.class)
  public void shouldDoNotCountNumberOfDigitsInStringNonNumberTest() {
    Count count = new Count();
    count.in( "a" );
  }
}

package add.lib;

import add.even.EvenNumber;
import add.odd.OddNumber;
import org.junit.jupiter.api.Test;

import static add.lib.Nats.even;
import static add.lib.Nats.odd;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {

    private static final OddNumber FIVE = odd(5);
    private static final EvenNumber SIX = even(6);
    private static final OddNumber TWENTYFIVE = odd(25);
    private static final EvenNumber THIRTY = even(30);
    private static final EvenNumber THIRTYSIX = even(36);

    @Test
    void testFiveTimesFive() {
        OddNumber result = Multiplication.multiply(FIVE, FIVE);
        assertEquals(TWENTYFIVE, result);
    }

    @Test
    void testFiveTimesSix() {
        EvenNumber result = Multiplication.multiply(FIVE, SIX);
        assertEquals(THIRTY, result);
    }

    @Test
    void testSixTimesFive() {
        EvenNumber result = Multiplication.multiply(SIX, FIVE);
        assertEquals(THIRTY, result);
    }

    @Test
    void testSixTimesSix() {
        EvenNumber result = Multiplication.multiply(SIX, SIX);
        assertEquals(THIRTYSIX, result);
    }
}
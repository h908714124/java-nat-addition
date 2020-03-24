package add.lib;

import add.even.EvenNumber;
import add.odd.OddNumber;
import org.junit.jupiter.api.Test;

import static add.lib.Addition.add;
import static add.lib.Nats.even;
import static add.lib.Nats.odd;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    private static final OddNumber FIVE = odd(5);
    private static final EvenNumber SIX = even(6);
    private static final EvenNumber TEN = even(10);
    private static final OddNumber ELEVEN = odd(11);
    private static final EvenNumber TWELVE = even(12);

    @Test
    void testFivePlusFive() {
        EvenNumber result = add(FIVE, FIVE);
        assertEquals(TEN, result);
    }

    @Test
    void testFivePlusSix() {
        OddNumber result = add(FIVE, SIX);
        assertEquals(ELEVEN, result);
    }

    @Test
    void testSixPlusFive() {
        OddNumber result = add(SIX, FIVE);
        assertEquals(ELEVEN, result);
    }

    @Test
    void testSixPlusSix() {
        EvenNumber result = add(SIX, SIX);
        assertEquals(TWELVE, result);
    }
}
package add.lib;

import add.even.EvenSuccessor;
import add.even.Zero;
import add.odd.OddNumber;
import org.junit.jupiter.api.Test;

import static add.lib.Nats.even;
import static add.lib.Nats.odd;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NatsTest {

    @Test
    void testZero() {
        assertEquals(new Zero(), even(0));
    }

    @Test
    void testOne() {
        assertEquals(new OddNumber(new Zero()), odd(1));
    }

    @Test
    void testTwo() {
        assertEquals(new EvenSuccessor(new OddNumber(new Zero())), even(2));
    }

    @Test
    void testThree() {
        assertEquals(new OddNumber(new EvenSuccessor(new OddNumber(new Zero()))), odd(3));
    }
}
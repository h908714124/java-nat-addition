package add.lib;

import add.even.EvenNumber;
import add.even.Zero;
import add.odd.OddNumber;

class Nats {

    static EvenNumber even(int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Expecting an even number, but found: " + n);
        }
        EvenNumber result = new Zero();
        int hn = n / 2;
        for (int i = 0; i < hn; i++) {
            result = result.successor().successor();
        }
        return result;
    }

    static OddNumber odd(int n) {
        return even(n - 1).successor();
    }
}

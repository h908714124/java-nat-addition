package add.even;

import add.number.Nat;
import add.odd.OddNumber;

public abstract class EvenNumber implements Nat {

    @Override
    public final OddNumber successor() {
        return new OddNumber(this);
    }

    public abstract <R> R accept(EvenNumberVisitor<R> v);
}

package add.odd;

import add.even.EvenNumber;
import add.even.EvenSuccessor;
import add.number.Nat;

public final class OddNumber implements Nat {

    private final EvenNumber predecessor;

    public OddNumber(EvenNumber predecessor) {
        this.predecessor = predecessor;
    }

    public EvenNumber predecessor() {
        return predecessor;
    }

    @Override
    public final EvenNumber successor() {
        return new EvenSuccessor(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OddNumber)) {
            return false;
        }
        return ((OddNumber) obj).predecessor.equals(predecessor);
    }
}

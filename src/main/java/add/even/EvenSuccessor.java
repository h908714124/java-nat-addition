package add.even;

import add.odd.OddNumber;

public final class EvenSuccessor extends EvenNumber {

    private final OddNumber predecessor;

    public EvenSuccessor(OddNumber predecessor) {
        this.predecessor = predecessor;
    }

    public OddNumber predecessor() {
        return predecessor;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EvenSuccessor)) {
            return false;
        }
        return ((EvenSuccessor) obj).predecessor.equals(predecessor);
    }

    @Override
    public <R> R accept(EvenNumberVisitor<R> v) {
        return v.visitSuccessor(this);
    }
}

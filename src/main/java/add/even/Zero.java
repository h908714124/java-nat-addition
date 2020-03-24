package add.even;

public final class Zero extends EvenNumber {

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Zero;
    }

    @Override
    public <R> R accept(EvenNumberVisitor<R> v) {
        return v.visitZero();
    }
}

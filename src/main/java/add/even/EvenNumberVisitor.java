package add.even;

public interface EvenNumberVisitor<R> {

    R visitZero();

    R visitSuccessor(EvenSuccessor nonZero);
}

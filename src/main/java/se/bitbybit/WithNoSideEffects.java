package se.bitbybit;

import java.util.Optional;

public class WithNoSideEffects {

    private Finder finder;

    public WithNoSideEffects(Finder finder){
        this.finder = finder;
    }

    public String getResultFor(int firstInt, int secondInt) {
        Optional<Integer> biggest = finder.findBiggest(firstInt, secondInt);
        return (biggest.isPresent() ?  "" + biggest.get(): "None") + " is biggest" ;
    }
}

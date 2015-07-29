package se.bitbybit;

import java.util.Optional;
import java.util.OptionalInt;

public class WithLessSideEffects {

    private Finder finder;

    public WithLessSideEffects(Finder finder){
        this.finder = finder;
    }

    public void printResultFor(int firstInt, int secondInt) {
        Optional<Integer> biggest = finder.findBiggest(firstInt, secondInt);
        System.out.printf("%s is biggest\n", biggest.isPresent() ? biggest.get() : "None");
    }
}

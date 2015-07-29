package se.bitbybit;

import java.util.Optional;

@FunctionalInterface
public interface Finder {
    public Optional<Integer> findBiggest(int firstInt, int secondInt);
}

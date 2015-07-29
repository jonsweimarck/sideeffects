package se.bitbybit;


import java.util.Optional;

public class App
{
    public static void main( String[] args ) {

        // Hard to test
        new WithSideEffects().printMaxOf(5, 2);

        // Easier to test
        Finder maxFinder = (int firstInt, int secondInt) ->
        {
            if(firstInt > secondInt) return Optional.of(firstInt);
            if(firstInt < secondInt) return Optional.of(secondInt);
            return Optional.empty();
        };

        new WithLessSideEffects(maxFinder).printResultFor(5, 2);


        // Easiest to test
        Finder maxFinder2 = (int firstInt, int secondInt) ->
        {
            if(firstInt > secondInt) return Optional.of(firstInt);
            if(firstInt < secondInt) return Optional.of(secondInt);
            return Optional.empty();
        };

        String result = new WithNoSideEffects(maxFinder).getResultFor(5, 2);
        System.out.println(result);

    }
}

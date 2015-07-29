package se.bitbybit;

public class WithSideEffects {
    public void printMaxOf(int firstInt, int secondInt) {
        if(firstInt > secondInt){
            System.out.println(firstInt + " is bigger");
        } else if(firstInt < secondInt){
            System.out.println(secondInt + " is bigger");
        }else {
            System.out.println("They are equal");
        }
    }
}

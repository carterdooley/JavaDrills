public class FizzBuzz {
//    Declaration of the class
    public static void main(String[] args) {
//        Creation of the main function
        fizzBuzz100();
//        Calling the fizzBuzz100 function
    }
// Closing
    private static void fizzBuzz100() {
//        Creation of the fizzBuzz100 function
        for (int i = 1; i <= 100; i++) {
//            Creation of a loop that will run 100 times
            if ((i % 3) == 0)
//                Condition if "i" is evenly divisible by 3
                System.out.println("fizz");
//            If "i" meets condition, then it will print the word fizz
            else if ((i % 5) == 0)
//              Second condition: if "i" is evenly divisible by 5
                System.out.println("buzz");
//            If condition is met, system will print the word buzz
            else if ((i % 5 == 0) && (i % 3 == 0))
//                Third condition: If "i" is evenly divisable by 3 and 5
//                The bug in the code is that this condition will never be seen because it is listed under other
//                conditions with th same statements
                System.out.println("fizzbuzz");
//            If condition is met, then system will print "fizzbuzz"
            else
//                If all conditions fail, the next line will run
                System.out.println(i);
//            System will print out the integer that is "i" during the loop
        }
    }
}

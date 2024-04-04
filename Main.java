public class Main {
    public static void main(String[] args) {
        System.out.println("trying to add via intellij");
        System.out.println("Addition: "+ Calculator.add(2, 1));
git         System.out.println("Compound Interest: " + CompoundInterestCalculator.calculate(100000, 8, 5));
        System.out.println("SIP return: "+ SIPCalculator.calculate(10000, 12, 12, 20));

    }
}
/*
       master
public class Main{
    public static void main(String[] args) {
        System.out.println("trying to add via intellij");
    }
<<<<<<< HEAD
}
=======
}

        calculator
public class Main {
    public static void main(String[] args) {
        System.out.println("trying to add via intellij");
        System.out.println("Addition"+ Calculator.add(2, 1));
    }
}
 */


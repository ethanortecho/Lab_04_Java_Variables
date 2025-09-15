//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 24;
        int intDifference = 4;
        int intQuotient = 9;
        int intModulo = 12;

        double doubleOperandA = 2.5;
        double doubleOperandB = 3.2;
        double doubleSum = 13.1;
        double doubleProduct = 24.6;
        double doubleDifference = 4.3;
        double doubleQuotient = 9.8;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        int kidsNo = 2;
        boolean raining = false;
        double gallonPrice = 2.79;
        int favNumber = 25;
        double shoeSize = 9.5;
        String birthMonth = "July";
        String fullName = "Ethan Ortecho";

        System.out.println("The gallon price is " + gallonPrice);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My favorite number is " + favNumber);
        System.out.println("My full name is " + fullName);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("Is it raining? :" + raining);
        System.out.println("Number of kids in my family: " + kidsNo);


    }
    }
public class DesigningClassesRealWorldApplication {
    public static void main (String[] args) {

        MyInteger myInteger = new MyInteger();
        myInteger.value = 10;
        int randomNumber = 2;
        char [] array = {'1', '2', '3'};
        MyInteger testObject = new MyInteger();
        testObject.value = 5;
        String s = "456";

        System.out.println("Is myInteger an even number?: " + myInteger.isEven());
        System.out.println("Is myInteger an odd number?: " + myInteger.isOdd());
        System.out.println("Is myInteger a prime number?: " + myInteger.isPrime());

        System.out.println("--------------------------------------");

        System.out.println("Is the following number " + randomNumber + " even?: "  + myInteger.isEven(randomNumber));
        System.out.println("Is the following number " + randomNumber + " odd?: " + myInteger.isOdd(randomNumber));
        System.out.println("Is the following number " + randomNumber + " prime?: " + myInteger.isPrime(randomNumber));

        System.out.println("--------------------------------------");

        System.out.println("Is the following number " + testObject.getValue() + " even?: " + myInteger.isEven(testObject));
        System.out.println("Is the following number " + testObject.getValue() + " odd?: " + myInteger.isOdd(testObject));
        System.out.println("Is the following number " + testObject.getValue() + " prime?: " + myInteger.isPrime(testObject));

        System.out.println("Is the number 2 and myInteger equal to each other?: " + myInteger.equals(2));
        System.out.println("Is testObject and myInteger equal to each other?: " + myInteger.equals(testObject));

        System.out.println("--------------------------------------");

        System.out.println("Here is array as an integer: " + myInteger.parseInt(array));
        System.out.println("Herer is the string s as an integer: " + myInteger.parseInt(s));


    }


}


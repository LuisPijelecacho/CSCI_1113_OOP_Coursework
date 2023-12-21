public class MyInteger {

    int value = 0;

    MyInteger(){

    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean isOdd() {
        if (value % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean isPrime(){
        if (value <= 1)
        {
            return false;
        }
        for(int i = 2; i <= value / 2; i++)
        {
            if((value % i) == 0)
                return  false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isOdd(int value) {
        if (value % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPrime(int value) {
        if (value <= 1)
        {
            return false;
        }
        for(int i = 2; i <= value / 2; i++)
        {
            if((value % i) == 0)
                return  false;
        }
        return true;
    }
    public static boolean isEven(MyInteger myInteger) {
        if (myInteger.getValue() % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isOdd(MyInteger myInteger) {
        if (myInteger.getValue() % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPrime(MyInteger myInteger) {
        if (myInteger.getValue() <= 1)
        {
            return false;
        }
        for(int i = 2; i <= myInteger.getValue() / 2; i++)
        {
            if((myInteger.getValue() % i) == 0)
                return  false;
        }
        return true;
    }

    public boolean equals(int value){
        if (this.value == value){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(MyInteger myInteger){
        if (this.value == myInteger.getValue()){
            return true;
        }else{
            return false;
        }
    }

    public static int parseInt(char[]array){
        String arrayToString = new String(array);
        return Integer.parseInt(arrayToString);
    }

    public static int parseInt(String string){
        return Integer.parseInt(string);
    }
}

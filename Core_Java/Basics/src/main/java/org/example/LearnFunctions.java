package org.example;

public class LearnFunctions {

    public LearnFunctions(){}

    public void printData(String value){
        /*
        here im using the string format to pass the value
         %s - string value,
         %d - integer
         %f - floating / double numbers
         %n - new line
         */
        System.out.println(String.format("This method just printing the value - %s ",value));
    }

    // A return method with return the sum of two values
    public int addSum(int n1, int n2){
        return n1+n2;
    }

    //This is method overloading, when methods have same name but different parameters
    public int addSum(int n1, int n2 , int n3){
        return n1+n2+n3;
    }

    // This is static function, so we can call the method with class instance, without initializing
    public static int subtraction(int totalValue, int subtractedValue){
        return totalValue - subtractedValue;
    }
}

//Fraction class file


//Constructed with numerator and the denominator,
//Not be able to modify!


//These methods are required:

/*
    double toDecimalNotation(): 1/3 should return 0.33333
    string toString(): 1/3 should return "1/3"
    Fraction add(int number): 1/3 + 1 should become 4/3
    Fraction add(Fraction fraction): 1/3 + 1/6 should become 1/2
    Fraction subtract(int number): 4/3 - 1 should become 1/3
    Fraction subtract(Fraction fraction): 1/2 - 1/6 should become 1/3
    Fraction multiply(int number): 3/4 * 2 should become 3/2
    Fraction multiply(Fraction fraction): 3/4 * 2/5 should become 3/10
    Fraction divide(int number): 3/2 / 2 should become 3/4
    Fraction divide(Fraction fraction): 3/10 / 2/5 should become 3/4

    */
package nl.sogyo.javaopdrachten;

import java.util.*;

public class Fraction{




  //instance variables
  int numerator;
  int denominator;
  


// here you make sure the variables are initialised using the input for the user
public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    
}


//double toDecimalNotation(): 1/3 should return 0.33333
public Double toDecimalNotation() {
    Double doubleresult = (double) numerator/denominator;
    return doubleresult;
}

//string toString(): 1/3 should return "1/3"
public String toString() {
    String stringresult = String.valueOf(numerator) + "/" + String.valueOf(denominator); 
    return stringresult;
}




//Fraction add(int number): 1/3 + 1 should become 4/3
public Fraction add(int number) {
    int newnumerator = numerator + number*denominator;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator, newdenominator);  
    newFraction = Simplify(newFraction);
    return newFraction;
    
}

//Fraction add(Fraction fraction): 1/3 + 1/6 should become 1/2
public Fraction add(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator= denominator*num2 +den2*numerator;
    int newdenominator = den2 *denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;
    
    
}




//Fraction subtract(int number): 4/3 - 1 should become 1/3
public Fraction subtract(int number) {
    int newnumerator = numerator - denominator*number;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;


}

//Fraction subtract(Fraction fraction): 1/2 - 1/6 should become 1/3
public Fraction subtract(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator= den2*numerator - denominator*num2 ;
    int newdenominator= den2 *denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;
    //simplify 
}




//Fraction multiply(int number): 3/4 * 2 should become 3/2
public Fraction multiply(int number) {
    int newnumerator = number*numerator;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;

    //simplify
}

//Fraction multiply(Fraction fraction): 3/4 * 2/5 should become 3/10
public Fraction multiply(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator = num2*numerator;
    int newdenominator = den2*denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;
    
}




//Fraction divide(int number): 3/2 / 2 should become 3/4
public Fraction divide(int number) {
    int newdenominator = denominator * number;
    int newnumerator = numerator;
    
    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;
}

//Fraction divide(Fraction fraction): 3/10 / 2/5 should become 3/4
public Fraction divide(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator = numerator*den2;
    int newdenominator = denominator*num2;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = Simplify(newFraction);
    return newFraction;
    //simplify 
}

public Fraction Simplify(Fraction inputfraction){

    int newNumerator = inputfraction.numerator;
    int newDenominator = inputfraction.denominator;

    for (int num : Primegen()) {
        if(newNumerator%num == 0&&newDenominator%num ==0){
            newNumerator = newNumerator/num;
            newDenominator = newDenominator/num;

        }
        


    }
   
    Fraction newFraction = new Fraction(newNumerator, newDenominator);
    return(newFraction);
}


public List<Integer> Primegen(){

    List<Integer> primeNumbers = new ArrayList<>();

    int count = 0;
    int num = 2;
    while (count < 50) {
        if (isPrime(num)) {
            primeNumbers.add(num);
            count++;
        }
        num++;
    }

    return primeNumbers;
}

public boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;


}
}

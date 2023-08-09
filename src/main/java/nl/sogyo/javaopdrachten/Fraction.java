package nl.sogyo.javaopdrachten;

import java.util.*;

public class Fraction{


  int numerator;
  int denominator;
  

public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    
}


public Double toDecimalNotation() {
    Double doubleresult = (double) numerator/denominator;
    return doubleresult;
}


public String toString() {
    String stringresult = String.valueOf(numerator) + "/" + String.valueOf(denominator); 
    return stringresult;
}


public Fraction add(int number) {
    int newnumerator = numerator + number*denominator;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator, newdenominator);  
    newFraction = simplify(newFraction);
    return newFraction;    
}


public Fraction add(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator= denominator*num2 +den2*numerator;
    int newdenominator = den2 *denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;   
}


public Fraction subtract(int number) {
    int newnumerator = numerator - denominator*number;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;
}


public Fraction subtract(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator= den2*numerator - denominator*num2 ;
    int newdenominator= den2 *denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;
}


public Fraction multiply(int number) {
    int newnumerator = number*numerator;
    int newdenominator = denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;
}


public Fraction multiply(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator = num2*numerator;
    int newdenominator = den2*denominator;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction; 
}


public Fraction divide(int number) {
    int newdenominator = denominator * number;
    int newnumerator = numerator;
    
    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;
}


public Fraction divide(Fraction Fraction2) {
    int num2 = Fraction2.numerator;
    int den2 = Fraction2.denominator;
    int newnumerator = numerator*den2;
    int newdenominator = denominator*num2;

    Fraction newFraction = new Fraction(newnumerator,newdenominator);
    newFraction = simplify(newFraction);
    return newFraction;
    //simplify 
}


public Fraction simplify(Fraction inputfraction){
    int newNumerator = inputfraction.numerator;
    int newDenominator = inputfraction.denominator;

    for (int num : primeGen()) {
        if(newNumerator%num == 0&&newDenominator%num ==0){
            newNumerator = newNumerator/num;
            newDenominator = newDenominator/num;
        }
    }
    Fraction newFraction = new Fraction(newNumerator, newDenominator);
    return(newFraction);
}


public List<Integer> primeGen(){
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

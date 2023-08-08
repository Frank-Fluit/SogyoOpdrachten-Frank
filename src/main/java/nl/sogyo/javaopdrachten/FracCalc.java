// Main File

// Use the objects of the Fraction class here

package nl.sogyo.javaopdrachten;


public class FracCalc{
    public static void main(String [] args){

        System.out.println("Test string print");

        // fraction1:  1/3
        Fraction Fraction1 = new Fraction(1, 13);
        // fraction2:  1/6
        Fraction Fraction2 = new Fraction(1,6);



        System.out.println(Fraction1.toDecimalNotation());
        System.out.println(Fraction1.toString());

        //Adding

        Fraction addnrtoFraction = Fraction1.add(1);
        Fraction addFractiontoFraction = Fraction1.add(Fraction2);

        System.out.println(addnrtoFraction);
        System.out.println(addFractiontoFraction);

        //Substracting

        Fraction substractnrfromFraction = Fraction1.subtract(1);
        Fraction substractFractionfromFraction = Fraction1.subtract(Fraction2);

        System.out.println(substractnrfromFraction);
        System.out.println(substractFractionfromFraction);

        //Multiplying

        Fraction multiplynrbyFraction = Fraction1.multiply(2);
        Fraction multiplyFractionbyFraction = Fraction1.multiply(Fraction2);

        System.out.println(multiplynrbyFraction);
        System.out.println(multiplyFractionbyFraction);

        //Dividing

        Fraction divideFractionbynr =  Fraction1.divide(2);
        Fraction divideFractionbyfraction = Fraction1.divide(Fraction2);

        System.out.println(divideFractionbynr);
        System.out.println(divideFractionbyfraction);


    }
}
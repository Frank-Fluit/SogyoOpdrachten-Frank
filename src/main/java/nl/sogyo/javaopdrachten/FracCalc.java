package nl.sogyo.javaopdrachten;


public class FracCalc{
    public static void main(String [] args){


        Fraction Fraction1 = new Fraction(1, 13);
        Fraction Fraction2 = new Fraction(1,6);


        

        System.out.println("toDecimal: "+Fraction1.toDecimalNotation());

        System.out.println("toString: "+Fraction1.toString());

        Fraction addNrtoFraction = Fraction1.add(1);
        System.out.println("addNrtoFraction: " + addNrtoFraction);

        Fraction addFractiontoFraction = Fraction1.add(Fraction2);
        System.out.println("addFractiontoFraction: " + addFractiontoFraction);

        Fraction substractNrfromFraction = Fraction1.subtract(1);
        System.out.println("subtractNrfromfraction: " + substractNrfromFraction);

        Fraction substractFractionfromFraction = Fraction1.subtract(Fraction2);
        System.out.println("subtractFractionfromFraction: " + substractFractionfromFraction);
  
        Fraction multiplyNrbyFraction = Fraction1.multiply(2);
        System.out.println("multplyNrbyFraction: " + multiplyNrbyFraction);

        Fraction multiplyFractionbyFraction = Fraction1.multiply(Fraction2);
        System.out.println("multiplyFractionbyFraction: " + multiplyFractionbyFraction);

        Fraction divideFractionbyNr =  Fraction1.divide(2);
        System.out.println("divideFractionbyNr: " + divideFractionbyNr);

        Fraction divideFractionbyFraction = Fraction1.divide(Fraction2);
        System.out.println("divideFractionbyFraction: " + divideFractionbyFraction);



    }
}
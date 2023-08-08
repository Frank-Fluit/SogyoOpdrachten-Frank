package nl.sogyo.javaopdrachten.quote;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Quote {
    private static String[][] quotes = {
        {"galileo", "eppur si muove"},
        {"archimedes", "eureka!"},
        {"erasmus", "in regione caecorum rex est luscus"},
        {"socrates", "I know nothing except the fact of my ignorance"},
        {"rené descartes", "cogito, ergo sum"},
        {"sir isaac newton", "if I have seen further it is by standing on the shoulders of giants"}
    };

    
    
    
    public static String capitalizeWords(String input) {
        StringBuilder result = new StringBuilder();

        
        String[] words = input.split("\\s");

        for (String word : words) {
            
            result.append(word.substring(0, 1).toUpperCase());
            result.append(word.substring(1).toLowerCase());
            result.append(" "); 
        }

        return result.toString().trim();
    }

    public static String capitalizeSentences(String input) {
        StringBuilder result = new StringBuilder();
    
        
        boolean capitalizeNextChar = true;
    
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
    
            
             if (Character.isLetterOrDigit(currentChar) && capitalizeNextChar) {
                
                result.append(Character.toUpperCase(currentChar));
                capitalizeNextChar = false; 
            } else {
                
                result.append(currentChar);
            }
        }
    
        
        if (result.length() > 0 && result.charAt(result.length() - 1) != '.' &&
                result.charAt(result.length() - 1) != '?' && result.charAt(result.length() - 1) != '!') {
            result.append('.');
        }
    
        return result.toString();
    }

    public static String Fixday(int currentDay) {

        String currentdaystring = String.valueOf(currentDay);

        if (currentDay == 1){
            currentdaystring = "1st";
        }
        if (currentDay == 21){
            currentdaystring = "21st";
        }
        if (currentDay == 31){
            currentdaystring = "31st";
        }
        if (currentDay == 2){
            currentdaystring = "2nd";
        }
        if(currentDay == 22){
            currentdaystring = "22nd";
        }
        if(currentDay == 3){
            currentdaystring = "3rd";
        }
        if(currentDay == 23){
            currentdaystring = "23rd";
        }
        if(currentDay!=1&&currentDay!=21&&currentDay!=31&&currentDay!=2&&currentDay!=22&&currentDay!=3&&currentDay!=23){
            currentdaystring = currentdaystring + "th";
        }

        return currentdaystring;
    }

    public static void main(String... args) {


        
        //indice
        LocalDate currentdate = LocalDate.now();

        int dayofyear = currentdate.getDayOfYear();

        int listindice = dayofyear%6;
        
      
        //day of week
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        
        String stringdayofweek = String.valueOf(dayOfWeek);

        stringdayofweek = capitalizeWords(stringdayofweek);

       
        // Month
        Month currentMonth = currentdate.getMonth();
        
        String stringcurrentmonth = String.valueOf(currentMonth);

        stringcurrentmonth = capitalizeWords(stringcurrentmonth);

        // current day of year
        int currentDay = currentdate.getDayOfMonth();
        
        String currentdaystring = Fixday(currentDay);


        // fix quote and names
        String namestring = quotes[listindice][0];

        String namestringcaps = capitalizeWords(namestring);

        String quoteString = quotes[listindice][1];

        String quotefixed = capitalizeSentences(quoteString);



        System.out.println("Quote for " + stringdayofweek + " the " + currentdaystring + " of "+ stringcurrentmonth + ":");

        System.out.println(namestringcaps+" --"+ quotefixed);


        
    }
}

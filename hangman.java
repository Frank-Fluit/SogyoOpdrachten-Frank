// The line below import the relevant scanner class

import java.util.*;

public class hangman
{
    private static int guessleft = 10;




    // Method -- Generate random word
    public static String Selectword(){

        String[] dictionary = {"java",
        "hangman",
        "programming",
        "computer",
        "science",
        "algorithm",
        "code",
        "developer",
        "debug",
        "variable",
        "method",
        "interface",
        "inheritance",
        "polymorphism",
        "array",
        "loop",
        "conditional",
        "object",
        "class",
        "static"}; 

        Random rand = new Random(); 
      
        int upperbound = 20;
      
        int int_random = rand.nextInt(upperbound); 

        String chosenword = dictionary[int_random];

        
        return(chosenword);

    }

    public static String[] Showprompt(String chosenword){

        int lengthword = chosenword.length();

        String[] prompt = new String[lengthword];

        // Fill the array with the default value
        Arrays.fill(prompt, "_");

        System.out.println(Arrays.toString(prompt));

        return(prompt);

       
        
    }
    // Method -- Print the current progress
    // Method -- Print update after guess
    // Method? -- Ask for input user


    public static String Takeinput(){
        // First an object of the scanner class is created
        Scanner scan = new Scanner(System.in);

        // Here the user is asked to enter an integer (year)
        System.out.print("Enter your hangman guess: ");

        String userguess = scan.nextLine();  // Read user input
        System.out.println("The entered string is " + userguess);  // Output user input


        //Here the scan object is closed again
        //scan.close();

        return(userguess);
    }

    public static void Updateprompt(String userguess, String chosenword, String[] firstprompt){

        System.out.println("userguess is: " + userguess);
        System.out.println("chosenword is: " + chosenword);

        int lengthword = chosenword.length();
        

        

        for (int i = 0; i < chosenword.length(); i++) {
                char letter = chosenword.charAt(i);
            if (userguess.equals(String.valueOf(letter))) {
                System.out.println("there is a match");

                firstprompt[i] = String.valueOf(letter);

                System.out.println(Arrays.toString(firstprompt));

                //String[] newprompt = new String[lengthword];

                }
            }

        if(Arrays.asList(firstprompt).contains(userguess) == false){
            guessleft = guessleft - 1;

            // add to wronglist and type it here
        }

        System.out.println(guessleft);

        if(guessleft==0){
            System.out.println("you failed the game");
        }
        }

    


// Main

    public static void main(String args[])
    {
        String chosenword = Selectword();
        //System.out.println(chosenword);
        String[] firstprompt = Showprompt(chosenword);

        //String userguess = Takeinput();

        //Updateprompt(userguess,chosenword, firstprompt);
        

        String notfinished = "_";
        


        while(Arrays.asList(firstprompt).contains(notfinished)){

            String userguess = Takeinput();

            Updateprompt(userguess,chosenword, firstprompt);

            



        //Add here what needs     
    }
}
}

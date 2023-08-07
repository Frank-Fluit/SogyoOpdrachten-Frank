import java.util.*;

public class hangman
{
    private static int guessleft = 10;

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

        Arrays.fill(prompt, "_");

        System.out.println(Arrays.toString(prompt));

        return(prompt);

       
        
    }
    

    public static String Takeinput(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your guess: ");

        String userguess = scan.nextLine();  

        return(userguess);
    }

    public static void Updateprompt(String userguess, String chosenword, String[] firstprompt, ArrayList<String> wrongguesses){
 
        for (int i = 0; i < chosenword.length(); i++) {

                char letter = chosenword.charAt(i);

            if (userguess.equals(String.valueOf(letter))) {

                firstprompt[i] = String.valueOf(letter);

                }
            }
        
        
        if(Arrays.asList(firstprompt).contains(userguess) == false){

            guessleft = guessleft - 1;

            wrongguesses.add(userguess);

            
        }

        if(guessleft == 0){

            System.out.println("You can ran out of guesses, more luck next time!");

            System.exit(0);
        }

        
        System.out.println(Arrays.toString(firstprompt));

        System.out.print("Guesses left:" + guessleft);

        System.out.println(" The wrongguesses are" + wrongguesses);

        
        }

    


// Main

    public static void main(String args[])
    {
        String chosenword = Selectword();
        
        String[] firstprompt = Showprompt(chosenword);

        ArrayList<String> wrongguesses = new ArrayList<>();

        String notfinished = "_";
        
        while(Arrays.asList(firstprompt).contains(notfinished)){

            String userguess = Takeinput();

            Updateprompt(userguess,chosenword, firstprompt, wrongguesses);
        }
        System.out.println("congrats you won the game");
        

            



        

}
}